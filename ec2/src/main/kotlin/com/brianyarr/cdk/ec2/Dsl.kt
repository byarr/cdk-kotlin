package com.brianyarr.cdk.ec2

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.ec2.NetworkAclEntry
import software.amazon.awscdk.services.ec2.NetworkAclEntryProps
import software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation
import software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps
import software.amazon.awscdk.services.ec2.SecurityGroup
import software.amazon.awscdk.services.ec2.SecurityGroupProps
import software.amazon.awscdk.services.ec2.Subnet
import software.amazon.awscdk.services.ec2.SubnetProps
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps
import software.amazon.awscdk.services.ec2.VpnConnection
import software.amazon.awscdk.services.ec2.VpnConnectionProps
import software.amazon.awscdk.services.ec2.PublicSubnet
import software.amazon.awscdk.services.ec2.PublicSubnetProps
import software.amazon.awscdk.services.ec2.NetworkAcl
import software.amazon.awscdk.services.ec2.NetworkAclProps
import software.amazon.awscdk.services.ec2.Instance
import software.amazon.awscdk.services.ec2.InstanceProps
import software.amazon.awscdk.services.ec2.PrivateSubnet
import software.amazon.awscdk.services.ec2.PrivateSubnetProps
import software.amazon.awscdk.services.ec2.Vpc
import software.amazon.awscdk.services.ec2.VpcProps
import software.amazon.awscdk.services.ec2.GatewayVpcEndpoint
import software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps

fun Construct.networkAclEntry(id: String, init: NetworkAclEntryProps.Builder.() -> Unit): NetworkAclEntry {
    val propsBuilder = NetworkAclEntryProps.builder()
    propsBuilder.init()
    
    return NetworkAclEntry(this, id, propsBuilder.build())
}


fun Construct.subnetNetworkAclAssociation(id: String, init: SubnetNetworkAclAssociationProps.Builder.() -> Unit): SubnetNetworkAclAssociation {
    val propsBuilder = SubnetNetworkAclAssociationProps.builder()
    propsBuilder.init()
    
    return SubnetNetworkAclAssociation(this, id, propsBuilder.build())
}


fun Construct.securityGroup(id: String, init: SecurityGroupProps.Builder.() -> Unit): SecurityGroup {
    val propsBuilder = SecurityGroupProps.builder()
    propsBuilder.init()
    
    return SecurityGroup(this, id, propsBuilder.build())
}


fun Construct.subnet(id: String, init: SubnetProps.Builder.() -> Unit): Subnet {
    val propsBuilder = SubnetProps.builder()
    propsBuilder.init()
    
    return Subnet(this, id, propsBuilder.build())
}


fun Construct.interfaceVpcEndpoint(id: String, init: InterfaceVpcEndpointProps.Builder.() -> Unit): InterfaceVpcEndpoint {
    val propsBuilder = InterfaceVpcEndpointProps.builder()
    propsBuilder.init()
    
    return InterfaceVpcEndpoint(this, id, propsBuilder.build())
}


fun Construct.vpnConnection(id: String, init: VpnConnectionProps.Builder.() -> Unit): VpnConnection {
    val propsBuilder = VpnConnectionProps.builder()
    propsBuilder.init()
    
    return VpnConnection(this, id, propsBuilder.build())
}


fun Construct.publicSubnet(id: String, init: PublicSubnetProps.Builder.() -> Unit): PublicSubnet {
    val propsBuilder = PublicSubnetProps.builder()
    propsBuilder.init()
    
    return PublicSubnet(this, id, propsBuilder.build())
}


fun Construct.networkAcl(id: String, init: NetworkAclProps.Builder.() -> Unit): NetworkAcl {
    val propsBuilder = NetworkAclProps.builder()
    propsBuilder.init()
    
    return NetworkAcl(this, id, propsBuilder.build())
}


fun Construct.instance(id: String, init: InstanceProps.Builder.() -> Unit): Instance {
    val propsBuilder = InstanceProps.builder()
    propsBuilder.init()
    
    return Instance(this, id, propsBuilder.build())
}


fun Construct.privateSubnet(id: String, init: PrivateSubnetProps.Builder.() -> Unit): PrivateSubnet {
    val propsBuilder = PrivateSubnetProps.builder()
    propsBuilder.init()
    
    return PrivateSubnet(this, id, propsBuilder.build())
}


fun Construct.vpc(id: String, init: VpcProps.Builder.() -> Unit): Vpc {
    val propsBuilder = VpcProps.builder()
    propsBuilder.init()
    
    return Vpc(this, id, propsBuilder.build())
}


fun Construct.gatewayVpcEndpoint(id: String, init: GatewayVpcEndpointProps.Builder.() -> Unit): GatewayVpcEndpoint {
    val propsBuilder = GatewayVpcEndpointProps.builder()
    propsBuilder.init()
    
    return GatewayVpcEndpoint(this, id, propsBuilder.build())
}


