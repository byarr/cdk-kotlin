package com.brianyarr.cdk.servicediscovery

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.servicediscovery.AliasTargetInstance
import software.amazon.awscdk.services.servicediscovery.AliasTargetInstanceProps
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespace
import software.amazon.awscdk.services.servicediscovery.PrivateDnsNamespaceProps
import software.amazon.awscdk.services.servicediscovery.NonIpInstance
import software.amazon.awscdk.services.servicediscovery.NonIpInstanceProps
import software.amazon.awscdk.services.servicediscovery.Service
import software.amazon.awscdk.services.servicediscovery.ServiceProps
import software.amazon.awscdk.services.servicediscovery.IpInstance
import software.amazon.awscdk.services.servicediscovery.IpInstanceProps
import software.amazon.awscdk.services.servicediscovery.CnameInstance
import software.amazon.awscdk.services.servicediscovery.CnameInstanceProps
import software.amazon.awscdk.services.servicediscovery.HttpNamespace
import software.amazon.awscdk.services.servicediscovery.HttpNamespaceProps
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespace
import software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps

fun Construct.aliasTargetInstance(id: String, init: AliasTargetInstanceProps.Builder.() -> Unit): AliasTargetInstance {
    val propsBuilder = AliasTargetInstanceProps.builder()
    propsBuilder.init()
    
    return AliasTargetInstance(this, id, propsBuilder.build())
}


fun Construct.privateDnsNamespace(id: String, init: PrivateDnsNamespaceProps.Builder.() -> Unit): PrivateDnsNamespace {
    val propsBuilder = PrivateDnsNamespaceProps.builder()
    propsBuilder.init()
    
    return PrivateDnsNamespace(this, id, propsBuilder.build())
}


fun Construct.nonIpInstance(id: String, init: NonIpInstanceProps.Builder.() -> Unit): NonIpInstance {
    val propsBuilder = NonIpInstanceProps.builder()
    propsBuilder.init()
    
    return NonIpInstance(this, id, propsBuilder.build())
}


fun Construct.service(id: String, init: ServiceProps.Builder.() -> Unit): Service {
    val propsBuilder = ServiceProps.builder()
    propsBuilder.init()
    
    return Service(this, id, propsBuilder.build())
}


fun Construct.ipInstance(id: String, init: IpInstanceProps.Builder.() -> Unit): IpInstance {
    val propsBuilder = IpInstanceProps.builder()
    propsBuilder.init()
    
    return IpInstance(this, id, propsBuilder.build())
}


fun Construct.cnameInstance(id: String, init: CnameInstanceProps.Builder.() -> Unit): CnameInstance {
    val propsBuilder = CnameInstanceProps.builder()
    propsBuilder.init()
    
    return CnameInstance(this, id, propsBuilder.build())
}


fun Construct.httpNamespace(id: String, init: HttpNamespaceProps.Builder.() -> Unit): HttpNamespace {
    val propsBuilder = HttpNamespaceProps.builder()
    propsBuilder.init()
    
    return HttpNamespace(this, id, propsBuilder.build())
}


fun Construct.publicDnsNamespace(id: String, init: PublicDnsNamespaceProps.Builder.() -> Unit): PublicDnsNamespace {
    val propsBuilder = PublicDnsNamespaceProps.builder()
    propsBuilder.init()
    
    return PublicDnsNamespace(this, id, propsBuilder.build())
}


