package com.brianyarr.cdk.servicediscovery

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.servicediscovery.HttpNamespace
import software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps
import software.amazon.awscdk.services.servicediscovery.CnameInstance
import software.amazon.awscdk.services.servicediscovery.CnameInstanceProps
import software.amazon.awscdk.services.servicediscovery.CfnService
import software.amazon.awscdk.services.servicediscovery.CfnServiceProps
import software.amazon.awscdk.services.servicediscovery.Service
import software.amazon.awscdk.services.servicediscovery.ServiceProps
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps
import software.amazon.awscdk.services.servicediscovery.CfnHttpNamespace
import software.amazon.awscdk.services.servicediscovery.CfnHttpNamespaceProps
import software.amazon.awscdk.services.servicediscovery.CfnInstance
import software.amazon.awscdk.services.servicediscovery.CfnInstanceProps
import software.amazon.awscdk.services.servicediscovery.NonIpInstance
import software.amazon.awscdk.services.servicediscovery.NonIpInstanceProps
import software.amazon.awscdk.services.servicediscovery.AliasTargetInstance
import software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps
import software.amazon.awscdk.services.servicediscovery.IpInstance
import software.amazon.awscdk.services.servicediscovery.IpInstanceProps

fun Construct.httpNamespace(id: String, init: HttpNamespaceProps.Builder.() -> Unit): HttpNamespace {
    val propsBuilder = HttpNamespaceProps.builder()
    propsBuilder.init()
    
    return HttpNamespace(this, id, propsBuilder.build())
}

fun Construct.cnameInstance(id: String, init: CnameInstanceProps.Builder.() -> Unit): CnameInstance {
    val propsBuilder = CnameInstanceProps.builder()
    propsBuilder.init()
    
    return CnameInstance(this, id, propsBuilder.build())
}

fun Construct.cfnService(id: String, init: CfnServiceProps.Builder.() -> Unit): CfnService {
    val propsBuilder = CfnServiceProps.builder()
    propsBuilder.init()
    
    return CfnService(this, id, propsBuilder.build())
}

fun Construct.service(id: String, init: ServiceProps.Builder.() -> Unit): Service {
    val propsBuilder = ServiceProps.builder()
    propsBuilder.init()
    
    return Service(this, id, propsBuilder.build())
}

fun Construct.privateDnsNamespace(id: String, init: PrivateDnsNamespaceProps.Builder.() -> Unit): PrivateDnsNamespace {
    val propsBuilder = PrivateDnsNamespaceProps.builder()
    propsBuilder.init()
    
    return PrivateDnsNamespace(this, id, propsBuilder.build())
}

fun Construct.cfnHttpNamespace(id: String, init: CfnHttpNamespaceProps.Builder.() -> Unit): CfnHttpNamespace {
    val propsBuilder = CfnHttpNamespaceProps.builder()
    propsBuilder.init()
    
    return CfnHttpNamespace(this, id, propsBuilder.build())
}

fun Construct.cfnInstance(id: String, init: CfnInstanceProps.Builder.() -> Unit): CfnInstance {
    val propsBuilder = CfnInstanceProps.builder()
    propsBuilder.init()
    
    return CfnInstance(this, id, propsBuilder.build())
}

fun Construct.nonIpInstance(id: String, init: NonIpInstanceProps.Builder.() -> Unit): NonIpInstance {
    val propsBuilder = NonIpInstanceProps.builder()
    propsBuilder.init()
    
    return NonIpInstance(this, id, propsBuilder.build())
}

fun Construct.aliasTargetInstance(id: String, init: AliasTargetInstanceProps.Builder.() -> Unit): AliasTargetInstance {
    val propsBuilder = AliasTargetInstanceProps.builder()
    propsBuilder.init()
    
    return AliasTargetInstance(this, id, propsBuilder.build())
}

fun Construct.publicDnsNamespace(id: String, init: PublicDnsNamespaceProps.Builder.() -> Unit): PublicDnsNamespace {
    val propsBuilder = PublicDnsNamespaceProps.builder()
    propsBuilder.init()
    
    return PublicDnsNamespace(this, id, propsBuilder.build())
}

fun Construct.cfnPrivateDnsNamespace(id: String, init: CfnPrivateDnsNamespaceProps.Builder.() -> Unit): CfnPrivateDnsNamespace {
    val propsBuilder = CfnPrivateDnsNamespaceProps.builder()
    propsBuilder.init()
    
    return CfnPrivateDnsNamespace(this, id, propsBuilder.build())
}

fun Construct.cfnPublicDnsNamespace(id: String, init: CfnPublicDnsNamespaceProps.Builder.() -> Unit): CfnPublicDnsNamespace {
    val propsBuilder = CfnPublicDnsNamespaceProps.builder()
    propsBuilder.init()
    
    return CfnPublicDnsNamespace(this, id, propsBuilder.build())
}

fun Construct.ipInstance(id: String, init: IpInstanceProps.Builder.() -> Unit): IpInstance {
    val propsBuilder = IpInstanceProps.builder()
    propsBuilder.init()
    
    return IpInstance(this, id, propsBuilder.build())
}

