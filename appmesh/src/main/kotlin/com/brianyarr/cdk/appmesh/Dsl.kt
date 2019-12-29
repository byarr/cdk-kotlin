package com.brianyarr.cdk.appmesh

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.appmesh.VirtualService
import software.amazon.awscdk.services.appmesh.VirtualServiceProps
import software.amazon.awscdk.services.appmesh.Route
import software.amazon.awscdk.services.appmesh.RouteProps
import software.amazon.awscdk.services.appmesh.Mesh
import software.amazon.awscdk.services.appmesh.MeshProps
import software.amazon.awscdk.services.appmesh.VirtualNode
import software.amazon.awscdk.services.appmesh.VirtualNodeProps
import software.amazon.awscdk.services.appmesh.VirtualRouter
import software.amazon.awscdk.services.appmesh.VirtualRouterProps

fun Construct.virtualService(id: String, init: VirtualServiceProps.Builder.() -> Unit): VirtualService {
    val propsBuilder = VirtualServiceProps.builder()
    propsBuilder.init()
    
    return VirtualService(this, id, propsBuilder.build())
}


fun Construct.route(id: String, init: RouteProps.Builder.() -> Unit): Route {
    val propsBuilder = RouteProps.builder()
    propsBuilder.init()
    
    return Route(this, id, propsBuilder.build())
}


fun Construct.mesh(id: String, init: MeshProps.Builder.() -> Unit): Mesh {
    val propsBuilder = MeshProps.builder()
    propsBuilder.init()
    
    return Mesh(this, id, propsBuilder.build())
}


fun Construct.virtualNode(id: String, init: VirtualNodeProps.Builder.() -> Unit): VirtualNode {
    val propsBuilder = VirtualNodeProps.builder()
    propsBuilder.init()
    
    return VirtualNode(this, id, propsBuilder.build())
}


fun Construct.virtualRouter(id: String, init: VirtualRouterProps.Builder.() -> Unit): VirtualRouter {
    val propsBuilder = VirtualRouterProps.builder()
    propsBuilder.init()
    
    return VirtualRouter(this, id, propsBuilder.build())
}


