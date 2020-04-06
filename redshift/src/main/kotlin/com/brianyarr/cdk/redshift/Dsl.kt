package com.brianyarr.cdk.redshift

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps
import software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup
import software.amazon.awscdk.services.redshift.CfnClusterSubnetGroupProps
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroup
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps
import software.amazon.awscdk.services.redshift.CfnCluster
import software.amazon.awscdk.services.redshift.CfnClusterProps

fun Construct.cfnClusterSecurityGroupIngress(id: String, init: CfnClusterSecurityGroupIngressProps.Builder.() -> Unit): CfnClusterSecurityGroupIngress {
    val propsBuilder = CfnClusterSecurityGroupIngressProps.builder()
    propsBuilder.init()
    
    return CfnClusterSecurityGroupIngress(this, id, propsBuilder.build())
}

fun Construct.cfnClusterSecurityGroup(id: String, init: CfnClusterSecurityGroupProps.Builder.() -> Unit): CfnClusterSecurityGroup {
    val propsBuilder = CfnClusterSecurityGroupProps.builder()
    propsBuilder.init()
    
    return CfnClusterSecurityGroup(this, id, propsBuilder.build())
}

fun Construct.cfnClusterSubnetGroup(id: String, init: CfnClusterSubnetGroupProps.Builder.() -> Unit): CfnClusterSubnetGroup {
    val propsBuilder = CfnClusterSubnetGroupProps.builder()
    propsBuilder.init()
    
    return CfnClusterSubnetGroup(this, id, propsBuilder.build())
}

fun Construct.cfnClusterParameterGroup(id: String, init: CfnClusterParameterGroupProps.Builder.() -> Unit): CfnClusterParameterGroup {
    val propsBuilder = CfnClusterParameterGroupProps.builder()
    propsBuilder.init()
    
    return CfnClusterParameterGroup(this, id, propsBuilder.build())
}

fun Construct.cfnCluster(id: String, init: CfnClusterProps.Builder.() -> Unit): CfnCluster {
    val propsBuilder = CfnClusterProps.builder()
    propsBuilder.init()
    
    return CfnCluster(this, id, propsBuilder.build())
}

