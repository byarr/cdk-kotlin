package com.brianyarr.cdk.ecr.assets

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.ecr.assets.DockerImageAsset
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps

fun Construct.dockerImageAsset(id: String, init: DockerImageAssetProps.Builder.() -> Unit): DockerImageAsset {
    val propsBuilder = DockerImageAssetProps.builder()
    propsBuilder.init()
    
    return DockerImageAsset(this, id, propsBuilder.build())
}

