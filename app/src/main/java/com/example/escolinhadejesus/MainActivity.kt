package com.example.escolinhadejesus

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EscolinhaApp()
        }
    }
}

@Composable
fun EscolinhaApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "tela1") {
        composable("tela1") {
            Tela1(onIniciarClick = { navController.navigate("tela2") })
        }
        composable("tela2") {
            val listaDeBotoes = listOf("Gráfico 1", "Gráfico 2", "Gráfico 3")
            Tela2(listaDeBotoes = listaDeBotoes) { index ->
                navController.navigate("grafico/$index")
            }
        }
        composable("grafico/{index}") { backStackEntry ->
            val index = backStackEntry.arguments?.getString("index")?.toIntOrNull() ?: 1
            TelaGraficoI(
                estadoJson = "estado_$index.json",
                imagem2 = R.drawable.imagem2,
                textoRolavel = "Texto relacionado ao Gráfico $index"
            )
        }
    }
}

@Composable
fun Tela1(onIniciarClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = rememberImagePainter(R.drawable.imagem1),
            contentDescription = "Fundo",
            modifier = Modifier.fillMaxSize()
        )
        Button(
            onClick = onIniciarClick,
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(text = "Iniciar")
        }
    }
}

@Composable
fun Tela2(listaDeBotoes: List<String>, onBotaoClick: (Int) -> Unit) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = rememberImagePainter(R.drawable.imagem1),
            contentDescription = "Fundo",
            modifier = Modifier.fillMaxSize()
        )
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            itemsIndexed(listaDeBotoes) { index, texto ->
                Button(onClick = { onBotaoClick(index + 1) }) {
                    Text(text = texto)
                }
            }
        }
    }
}

@Composable
fun TelaGraficoI(estadoJson: String, imagem2: Int, textoRolavel: String) {
    val context = LocalContext.current

    // Inicializar o servidor local usando remember
    val server = remember { LocalWebServer(context) }
    LaunchedEffect(Unit) {
        server.start()
        /*
        awaitDispose {
            server.stop() // Certifique-se de que o servidor seja encerrado
        }
         */
    }

    Row(modifier = Modifier.fillMaxSize()) {
        // WebView para exibir o gráfico
        AndroidView(factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true
                settings.domStorageEnabled = true
                loadUrl("http://localhost:12346/grafico.html?json=$estadoJson")
            }
        }, modifier = Modifier.weight(0.75f))

        // Imagem e texto rolável
        Column(
            modifier = Modifier
                .weight(0.25f)
                .fillMaxHeight()
        ) {
            Image(
                painter = painterResource(id = imagem2),
                contentDescription = "Imagem ao lado",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp)
            ) {
                item {
                    Text(text = textoRolavel)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewTela1() {
    Tela1(onIniciarClick = {})
}

@Preview(showBackground = true)
@Composable
fun PreviewTela2() {
    val listaDeBotoes = listOf("Gráfico 1", "Gráfico 2", "Gráfico 3")
    Tela2(listaDeBotoes = listaDeBotoes, onBotaoClick = {})
}

@Preview(showBackground = true)
@Composable
fun PreviewTelaGraficoI() {
    TelaGraficoI(
        estadoJson = "estado_1.json",
        imagem2 = R.drawable.imagem2,
        textoRolavel = "Texto de exemplo para o gráfico"
    )
}
