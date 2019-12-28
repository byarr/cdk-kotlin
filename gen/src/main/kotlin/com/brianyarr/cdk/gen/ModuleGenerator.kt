package com.brianyarr.cdk.gen

import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

data class Module(val group: String, val artifact: String, val version: String) {
    fun fileName(): String {
        return "${artifact}-${version}.jar"
    }
    fun url(): String {
        val groupPath = group.replace('.', '/')
        val fileName = fileName()
        return "https://repo1.maven.org/maven2/${groupPath}/${artifact}/${version}/$fileName"
    }
}

object ModuleGenerator {

    val groupId = "software.amazon.awscdk"
    val version = "1.19.0"

    val httpClient = HttpClient.newHttpClient()

    fun getCdkModules(): List<Module> {
        val uri = "http://search.maven.org/solrsearch/select?q=g:%22software.amazon.awscdk%22+AND+v:%221.19.0%22&rows=200&core=gav"

        val s = httpClient.send(HttpRequest.newBuilder().GET().uri(URI.create(uri)).build(), HttpResponse.BodyHandlers.ofString())

        val resp = Parser.default().parse(StringBuilder(s.body())) as JsonObject
        val docs = resp.obj("response")?.array<JsonObject>("docs") !!
        return docs.map {
            val g = it.string("g")
            val a = it.string("a")
            val v = it.string("v")
            Module(g!!, a!!, v!!)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val modules = ModuleGenerator.getCdkModules()
        println(modules)

        for (module in modules) {

            println(module.artifact)

            CodeGen.generate(module)

        }
    }
}