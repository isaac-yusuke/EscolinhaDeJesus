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
        """.trimIndent(), // Remove a indentação desnecessária
        arquivoJson = "DaviEGolias.json"
    ),
    GraficoData(
        titulo = "Jesus Acalma a Tempestade",
        texto = """
            Jesus Acalma a Tempestade
            
            Texto bíblico: Marcos 4:35-41
            
            Os discípulos estavam com muito medo por causa da tempestade no mar, mas então eles lembraram que Jesus estava ali no barco dormindo!
            Toque no mar para ver o que aconteceu quando Jesus disse "Silêncio!"            
        """.trimIndent(),
        arquivoJson = "JesusAcalmaATempestade.json"
    ),
    GraficoData(
        titulo = "O Sonho de Jacó",
        texto = """
            O Sonho de Jacó
            
            Texto bíblico: Gênesis 28
            
            Quando Jacó saiu de casa fugindo de seu irmão, ele dormiu e teve um sonho. Nesse sonho, ele viu uma escada que ia até o Céu, e os anjos subiam e desciam por ela.
            Essa escada representa Jesus, que faz a ponte entre nós e Deus!
        """.trimIndent(),
        arquivoJson = "SonhoDeJaco.json"
    ),
    GraficoData(
        titulo = "Gráfico 4",
        texto = """
            O Gráfico 4 traz informações importantes.
            Ele é baseado em um conjunto de dados específicos
            que demonstram conceitos de maneira visual.
        """.trimIndent(),
        arquivoJson = ".json"
    )
)
