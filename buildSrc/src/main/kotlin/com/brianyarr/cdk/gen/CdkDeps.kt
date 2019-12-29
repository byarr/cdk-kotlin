package com.brianyarr.cdk.gen

import org.gradle.api.Project
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ArrayNode
import java.net.URL

fun Project.addCdkDeps() {

    val groupId = "software.amazon.awscdk"
    val version = "1.19.0"

    val respTree = loadDeps()

    val docs = respTree.get("response").get("docs")

    if (docs.isArray) {
        val arrayNode = docs as ArrayNode

        arrayNode.forEach {
            val group = it.get("g").textValue()
            val artifact = it.get("a").textValue()
            val version = it.get("v").textValue()

            this.dependencies.add("implementation", "$group:$artifact:$version")

        }
    }

}

private fun loadDeps(): JsonNode {
    val url = URL("http://search.maven.org/solrsearch/select?q=g:%22software.amazon.awscdk%22+AND+v:%221.19.0%22&rows=200&core=gav")
    val objectMapper = ObjectMapper()
    val respTree = objectMapper.readTree(url.openStream())
    return respTree
}