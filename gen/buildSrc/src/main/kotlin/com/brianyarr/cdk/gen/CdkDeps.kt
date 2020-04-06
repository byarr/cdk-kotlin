package com.brianyarr.cdk.gen

import org.gradle.api.Project
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.node.ArrayNode
import java.net.URL

fun Project.addCdkDeps(groupId: String, version: String) {

    val respTree = loadDeps(groupId, version)

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

private fun loadDeps(groupId: String, version: String): JsonNode {
    val url = URL("http://search.maven.org/solrsearch/select?q=g:%22${groupId}%22+AND+v:%22${version}%22&rows=200&core=gav")
    val objectMapper = ObjectMapper()
    val respTree = objectMapper.readTree(url.openStream())
    return respTree
}