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
            
            Texto Bíblico: 
            1 Samuel 17
            
            Golias era um gigante muito forte, mas Davi tinha a arma mais poderosa de todas: a confiança em Deus!
            Toque no Davi para ver como ele venceu Golias
        """.trimIndent(), // Remove a indentação desnecessária
        arquivoJson = "DaviEGolias.json"
    ),
    GraficoData(
        titulo = "Jesus Acalma a Tempestade",
        texto = """
            Jesus Acalma a Tempestade
            
            Texto Bíblico: 
            Marcos 4:35-41
            
            Os discípulos estavam com muito medo por causa da tempestade no mar, mas então eles lembraram que Jesus estava ali no barco dormindo!
            Toque no mar para ver o que aconteceu quando Jesus disse "Silêncio!"            
        """.trimIndent(),
        arquivoJson = "JesusAcalmaATempestade.json"
    ),
    GraficoData(
        titulo = "O Sonho de Jacó",
        texto = """
            O Sonho de Jacó
            
            Texto Bíblico: 
            Gênesis 28
            
            Quando Jacó saiu de casa fugindo de seu irmão, ele dormiu e teve um sonho. Nesse sonho, ele viu uma escada que ia até o Céu, e os anjos subiam e desciam por ela.
            Essa escada representa Jesus, que faz a ponte entre nós e Deus!
        """.trimIndent(),
        arquivoJson = "SonhoDeJaco.json"
    ),
    GraficoData(
        titulo = "Sadraque, Mesaque e Abede-Nego",
        texto = """
            Os 3 Amigos na Fornalha
            
            Texto Bíblico: 
            Daniel 3
            
            Sadraque, Mesaque e Abede-Nego foram lançados na fornalha porque não adoraram a estátua de ouro do rei. Porém, quando o rei olhou lá dentro, ele teve uma surpresa!
            Toque na fornalha para ver o que aconteceu.
        """.trimIndent(),
        arquivoJson = "SadraqueMesaqueEAbedenego.json"
    ),
    GraficoData(
        titulo = "A Mulher de Ló",
        texto = """
            A Mulher de Ló
            
            Texto Bíblico: 
            Gênesis 19
            
            Deus destruiu as cidades de Sodoma e Gomorra porque as pessoas de lá eram más. Ló e sua família deveriam fugir sem olhar para trás, mas a mulher de Ló olhou!
            Toque na família de Ló e acompanhe eles para ver o que aconteceu.
        """.trimIndent(),
        arquivoJson = "AMulherDeLo.json"
    ),
    GraficoData(
        titulo = "O Paralítico do Tanque",
        texto = """
            O Paralítico do Tanque
            
            Texto Bíblico: 
            João 5
            
            Muitos doentes ficavam ao redor do tanque de Betesda porque achavam que aquela água poderia curá-los. Um homem paralítico estava ali havia 38 anos, esperando por uma cura.
            Toque no paralítico para ver o que aconteceu quando Jesus falou com ele!
        """.trimIndent(),
        arquivoJson = "OParaliticoDoTanque.json"
    ),
    GraficoData(
        titulo = "Pedro e Jesus Andam na Água",
        texto = """
            Pedro e Jesus Andam na Água
            
            Texto Bíblico: 
            Mateus 14:30,31
            
            Quando os discípulos estavam atravessando o mar, Jesus foi até eles andando sobre a água. Pedro pediu pra andar na água também, e Jesus chamou ele pra fora, porém a tempestade assustou Pedro!
            Mexa o medidor de fé e veja o que aconteceu quando a fé de Pedro diminuiu!
        """.trimIndent(),
        arquivoJson = "PedroEJesusAndamNaAgua.json"
    )
)
