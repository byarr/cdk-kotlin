package com.brianyarr.cdk.appmesh

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.appmesh.Mesh
import software.amazon.awscdk.services.appmesh.MeshProps
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps
import software.amazon.awscdk.services.appmesh.CfnVirtualService
import software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps
import software.amazon.awscdk.services.appmesh.VirtualRouter
import software.amazon.awscdk.services.appmesh.VirtualRouterProps
import software.amazon.awscdk.services.appmesh.VirtualService
import software.amazon.awscdk.services.appmesh.VirtualServiceProps
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter
import software.amazon.awscdk.services.appmesh.CfnVirtualRouterProps
import software.amazon.awscdk.services.appmesh.Route
import software.amazon.awscdk.services.appmesh.RouteProps
import software.amazon.awscdk.services.appmesh.CfnRoute
import software.amazon.awscdk.services.appmesh.CfnRouteProps
import software.amazon.awscdk.services.appmesh.CfnMesh
import software.amazon.awscdk.services.appmesh.CfnMeshProps
import software.amazon.awscdk.services.appmesh.VirtualNode
import software.amazon.awscdk.services.appmesh.VirtualNodeProps

fun Construct.mesh(id: String, init: MeshProps.Builder.() -> Unit): Mesh {
    val propsBuilder = MeshProps.builder()
    propsBuilder.init()
    
    return Mesh(this, id, propsBuilder.build())
}

fun Construct.cfnVirtualNode(id: String, init: CfnVirtualNodeProps.Builder.() -> Unit): CfnVirtualNode {
    val propsBuilder = CfnVirtualNodeProps.builder()
    propsBuilder.init()
    
    return CfnVirtualNode(this, id, propsBuilder.build())
}

fun Construct.cfnVirtualService(id: String, init: CfnVirtualServiceProps.Builder.() -> Unit): CfnVirtualService {
    val propsBuilder = CfnVirtualServiceProps.builder()
    propsBuilder.init()
    
    return CfnVirtualService(this, id, propsBuilder.build())
}

fun Construct.virtualRouter(id: String, init: VirtualRouterProps.Builder.() -> Unit): VirtualRouter {
    val propsBuilder = VirtualRouterProps.builder()
    propsBuilder.init()
    
    return VirtualRouter(this, id, propsBuilder.build())
}

fun Construct.virtualService(id: String, init: VirtualServiceProps.Builder.() -> Unit): VirtualService {
    val propsBuilder = VirtualServiceProps.builder()
    propsBuilder.init()
    
    return VirtualService(this, id, propsBuilder.build())
}

fun Construct.cfnVirtualRouter(id: String, init: CfnVirtualRouterProps.Builder.() -> Unit): CfnVirtualRouter {
    val propsBuilder = CfnVirtualRouterProps.builder()
    propsBuilder.init()
    
    return CfnVirtualRouter(this, id, propsBuilder.build())
}

fun Construct.route(id: String, init: RouteProps.Builder.() -> Unit): Route {
    val propsBuilder = RouteProps.builder()
    propsBuilder.init()
    
    return Route(this, id, propsBuilder.build())
}

fun Construct.cfnRoute(id: String, init: CfnRouteProps.Builder.() -> Unit): CfnRoute {
    val propsBuilder = CfnRouteProps.builder()
    propsBuilder.init()
    
    return CfnRoute(this, id, propsBuilder.build())
}

fun Construct.cfnMesh(id: String, init: CfnMeshProps.Builder.() -> Unit): CfnMesh {
    val propsBuilder = CfnMeshProps.builder()
    propsBuilder.init()
    
    return CfnMesh(this, id, propsBuilder.build())
}

fun Construct.virtualNode(id: String, init: VirtualNodeProps.Builder.() -> Unit): VirtualNode {
    val propsBuilder = VirtualNodeProps.builder()
    propsBuilder.init()
    
    return VirtualNode(this, id, propsBuilder.build())
}

