package com.example.escolinhadejesus

// Classe para representar os dados dos gráficos
data class GraficoData(
    val titulo: String,
    val texto: String,
    val arquivoJson: String // Adicionamos o nome do arquivo JSON
)

// Lista com os dados dos gráficos
val graficos = listOf(
    GraficoData(
        titulo = "Gráfico 1",
        texto = "Texto relacionado ao Gráfico 1",
        arquivoJson = "estado_1.json"
    ),
    GraficoData(
        titulo = "Gráfico 2",
        texto = "Texto relacionado ao Gráfico 2",
        arquivoJson = "estado_2.json"
    ),
    GraficoData(
        titulo = "Gráfico 3",
        texto = "Texto relacionado ao Gráfico 3",
        arquivoJson = "estado_3.json"
    ),
    GraficoData(
        titulo = "Gráfico 4",
        texto = "Texto relacionado ao Gráfico 4",
        arquivoJson = "estado_4.json"
    )

)
