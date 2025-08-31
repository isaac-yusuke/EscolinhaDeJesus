package br.isaacyyanagui.escolinhadejesus

import android.content.Context
import fi.iki.elonen.NanoHTTPD
import java.io.InputStream

class LocalWebServer(private val context: Context) : NanoHTTPD(12346) {

    override fun serve(session: IHTTPSession): Response {
        val uri = session.uri.removePrefix("/")
        println("Arquivo requisitado: $uri")

        // Ignorar favicon.ico para evitar poluir os logs
        if (uri == "favicon.ico") {
            return newFixedLengthResponse(
                Response.Status.NOT_FOUND,
                "text/plain",
                ""
            )
        }

        return try {
            val inputStream: InputStream = context.assets.open(uri)
            newFixedLengthResponse(
                Response.Status.OK,
                getMimeType(uri),
                inputStream,
                inputStream.available().toLong()
            )
        } catch (e: Exception) {
            println("Erro ao abrir o arquivo: $e")
            newFixedLengthResponse(
                Response.Status.NOT_FOUND,
                "text/plain",
                "File not found"
            )
        }
    }



    private fun getMimeType(uri: String): String {
        return when {
            uri.endsWith(".html") -> "text/html"
            uri.endsWith(".json") -> "application/json"
            else -> "text/plain"
        }
    }
}
