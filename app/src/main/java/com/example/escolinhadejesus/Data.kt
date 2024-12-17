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
        titulo = "Davi e Golias",
        texto = """
            Davi e Golias
            
            Texto bíblico: 1 Samuel 17
            
            Golias era um gigante muito forte, mas Davi tinha a arma mais poderosa de todas: a confiança em Deus!
            Toque no Davi para ver como ele venceu Golias
            teste
            teste2
            teste3
        """.trimIndent(), // Remove a indentação desnecessária
        arquivoJson = "DavieGolias.json"
    ),
    GraficoData(
        titulo = "Gráfico 2",
        texto = """
            Este é o texto do Gráfico 2.
            Ele pode conter múltiplas linhas,
            incluindo explicações detalhadas.
        """.trimIndent(),
        arquivoJson = "estado_2.json"
    ),
    GraficoData(
        titulo = "Gráfico 3",
        texto = """
            Aqui está um texto relacionado ao Gráfico 3.
            Podemos usar várias linhas para fornecer mais informações
            sobre o conteúdo e contexto do gráfico.
        """.trimIndent(),
        arquivoJson = "estado_3.json"
    ),
    GraficoData(
        titulo = "Gráfico 4",
        texto = """
            O Gráfico 4 traz informações importantes.
            Ele é baseado em um conjunto de dados específicos
            que demonstram conceitos de maneira visual.
        """.trimIndent(),
        arquivoJson = "estado_4.json"
    )
)
