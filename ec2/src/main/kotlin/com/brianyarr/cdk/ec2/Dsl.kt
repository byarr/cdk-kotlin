package com.brianyarr.cdk.ec2

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation
import software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps
import software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission
import software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps
import software.amazon.awscdk.services.ec2.PublicSubnet
import software.amazon.awscdk.services.ec2.PublicSubnetProps
import software.amazon.awscdk.services.ec2.CfnVPCEndpointService
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServiceProps
import software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock
import software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagation
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps
import software.amazon.awscdk.services.ec2.NetworkAclEntry
import software.amazon.awscdk.services.ec2.NetworkAclEntryProps
import software.amazon.awscdk.services.ec2.CfnVPNConnection
import software.amazon.awscdk.services.ec2.CfnVPNConnectionProps
import software.amazon.awscdk.services.ec2.CfnSubnet
import software.amazon.awscdk.services.ec2.CfnSubnetProps
import software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection
import software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorTarget
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps
import software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRule
import software.amazon.awscdk.services.ec2.CfnClientVpnAuthorizationRuleProps
import software.amazon.awscdk.services.ec2.CfnVolume
import software.amazon.awscdk.services.ec2.CfnVolumeProps
import software.amazon.awscdk.services.ec2.CfnCapacityReservation
import software.amazon.awscdk.services.ec2.CfnCapacityReservationProps
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociation
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociationProps
import software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway
import software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps
import software.amazon.awscdk.services.ec2.CfnRouteTable
import software.amazon.awscdk.services.ec2.CfnRouteTableProps
import software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation
import software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps
import software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress
import software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps
import software.amazon.awscdk.services.ec2.CfnPlacementGroup
import software.amazon.awscdk.services.ec2.CfnPlacementGroupProps
import software.amazon.awscdk.services.ec2.SecurityGroup
import software.amazon.awscdk.services.ec2.SecurityGroupProps
import software.amazon.awscdk.services.ec2.CfnNetworkAcl
import software.amazon.awscdk.services.ec2.CfnNetworkAclProps
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociation
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociationProps
import software.amazon.awscdk.services.ec2.CfnCustomerGateway
import software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps
import software.amazon.awscdk.services.ec2.GatewayVpcEndpoint
import software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps
import software.amazon.awscdk.services.ec2.CfnNetworkInterface
import software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps
import software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation
import software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps
import software.amazon.awscdk.services.ec2.CfnVolumeAttachment
import software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps
import software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation
import software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps
import software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation
import software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps
import software.amazon.awscdk.services.ec2.Vpc
import software.amazon.awscdk.services.ec2.VpcProps
import software.amazon.awscdk.services.ec2.CfnVPCEndpoint
import software.amazon.awscdk.services.ec2.CfnVPCEndpointProps
import software.amazon.awscdk.services.ec2.CfnInstance
import software.amazon.awscdk.services.ec2.CfnInstanceProps
import software.amazon.awscdk.services.ec2.CfnVPC
import software.amazon.awscdk.services.ec2.CfnVPCProps
import software.amazon.awscdk.services.ec2.CfnInternetGateway
import software.amazon.awscdk.services.ec2.CfnInternetGatewayProps
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute
import software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps
import software.amazon.awscdk.services.ec2.VpcEndpointService
import software.amazon.awscdk.services.ec2.VpcEndpointServiceProps
import software.amazon.awscdk.services.ec2.CfnSecurityGroup
import software.amazon.awscdk.services.ec2.CfnSecurityGroupProps
import software.amazon.awscdk.services.ec2.CfnEIPAssociation
import software.amazon.awscdk.services.ec2.CfnEIPAssociationProps
import software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation
import software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntry
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps
import software.amazon.awscdk.services.ec2.PrivateSubnet
import software.amazon.awscdk.services.ec2.PrivateSubnetProps
import software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress
import software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps
import software.amazon.awscdk.services.ec2.CfnTransitGateway
import software.amazon.awscdk.services.ec2.CfnTransitGatewayProps
import software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment
import software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps
import software.amazon.awscdk.services.ec2.VpnConnection
import software.amazon.awscdk.services.ec2.VpnConnectionProps
import software.amazon.awscdk.services.ec2.CfnFlowLog
import software.amazon.awscdk.services.ec2.CfnFlowLogProps
import software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment
import software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTable
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableProps
import software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute
import software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps
import software.amazon.awscdk.services.ec2.NetworkAcl
import software.amazon.awscdk.services.ec2.NetworkAclProps
import software.amazon.awscdk.services.ec2.CfnNatGateway
import software.amazon.awscdk.services.ec2.CfnNatGatewayProps
import software.amazon.awscdk.services.ec2.Subnet
import software.amazon.awscdk.services.ec2.SubnetProps
import software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment
import software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilter
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps
import software.amazon.awscdk.services.ec2.CfnVPNGateway
import software.amazon.awscdk.services.ec2.CfnVPNGatewayProps
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps
import software.amazon.awscdk.services.ec2.Instance
import software.amazon.awscdk.services.ec2.InstanceProps
import software.amazon.awscdk.services.ec2.CfnRoute
import software.amazon.awscdk.services.ec2.CfnRouteProps
import software.amazon.awscdk.services.ec2.CfnClientVpnRoute
import software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps
import software.amazon.awscdk.services.ec2.CfnHost
import software.amazon.awscdk.services.ec2.CfnHostProps
import software.amazon.awscdk.services.ec2.CfnSpotFleet
import software.amazon.awscdk.services.ec2.CfnSpotFleetProps
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorSession
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps
import software.amazon.awscdk.services.ec2.CfnVPCCidrBlock
import software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps
import software.amazon.awscdk.services.ec2.FlowLog
import software.amazon.awscdk.services.ec2.FlowLogProps
import software.amazon.awscdk.services.ec2.CfnEIP
import software.amazon.awscdk.services.ec2.CfnEIPProps
import software.amazon.awscdk.services.ec2.CfnEC2Fleet
import software.amazon.awscdk.services.ec2.CfnEC2FleetProps
import software.amazon.awscdk.services.ec2.BastionHostLinux
import software.amazon.awscdk.services.ec2.BastionHostLinuxProps
import software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation
import software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps
import software.amazon.awscdk.services.ec2.CfnDHCPOptions
import software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps
import software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotification
import software.amazon.awscdk.services.ec2.CfnVPCEndpointConnectionNotificationProps

fun Construct.cfnGatewayRouteTableAssociation(id: String, init: CfnGatewayRouteTableAssociationProps.Builder.() -> Unit): CfnGatewayRouteTableAssociation {
    val propsBuilder = CfnGatewayRouteTableAssociationProps.builder()
    propsBuilder.init()
    
    return CfnGatewayRouteTableAssociation(this, id, propsBuilder.build())
}

fun Construct.cfnNetworkInterfacePermission(id: String, init: CfnNetworkInterfacePermissionProps.Builder.() -> Unit): CfnNetworkInterfacePermission {
    val propsBuilder = CfnNetworkInterfacePermissionProps.builder()
    propsBuilder.init()
    
    return CfnNetworkInterfacePermission(this, id, propsBuilder.build())
}

fun Construct.publicSubnet(id: String, init: PublicSubnetProps.Builder.() -> Unit): PublicSubnet {
    val propsBuilder = PublicSubnetProps.builder()
    propsBuilder.init()
    
    return PublicSubnet(this, id, propsBuilder.build())
}

fun Construct.cfnVPCEndpointService(id: String, init: CfnVPCEndpointServiceProps.Builder.() -> Unit): CfnVPCEndpointService {
    val propsBuilder = CfnVPCEndpointServiceProps.builder()
    propsBuilder.init()
    
    return CfnVPCEndpointService(this, id, propsBuilder.build())
}

fun Construct.cfnSubnetCidrBlock(id: String, init: CfnSubnetCidrBlockProps.Builder.() -> Unit): CfnSubnetCidrBlock {
    val propsBuilder = CfnSubnetCidrBlockProps.builder()
    propsBuilder.init()
    
    return CfnSubnetCidrBlock(this, id, propsBuilder.build())
}

fun Construct.cfnTrafficMirrorFilterRule(id: String, init: CfnTrafficMirrorFilterRuleProps.Builder.() -> Unit): CfnTrafficMirrorFilterRule {
    val propsBuilder = CfnTrafficMirrorFilterRuleProps.builder()
    propsBuilder.init()
    
    return CfnTrafficMirrorFilterRule(this, id, propsBuilder.build())
}

fun Construct.cfnTransitGatewayRouteTablePropagation(id: String, init: CfnTransitGatewayRouteTablePropagationProps.Builder.() -> Unit): CfnTransitGatewayRouteTablePropagation {
    val propsBuilder = CfnTransitGatewayRouteTablePropagationProps.builder()
    propsBuilder.init()
    
    return CfnTransitGatewayRouteTablePropagation(this, id, propsBuilder.build())
}

fun Construct.networkAclEntry(id: String, init: NetworkAclEntryProps.Builder.() -> Unit): NetworkAclEntry {
    val propsBuilder = NetworkAclEntryProps.builder()
    propsBuilder.init()
    
    return NetworkAclEntry(this, id, propsBuilder.build())
}

fun Construct.cfnVPNConnection(id: String, init: CfnVPNConnectionProps.Builder.() -> Unit): CfnVPNConnection {
    val propsBuilder = CfnVPNConnectionProps.builder()
    propsBuilder.init()
    
    return CfnVPNConnection(this, id, propsBuilder.build())
}

fun Construct.cfnSubnet(id: String, init: CfnSubnetProps.Builder.() -> Unit): CfnSubnet {
    val propsBuilder = CfnSubnetProps.builder()
    propsBuilder.init()
    
    return CfnSubnet(this, id, propsBuilder.build())
}

fun Construct.cfnVPCPeeringConnection(id: String, init: CfnVPCPeeringConnectionProps.Builder.() -> Unit): CfnVPCPeeringConnection {
    val propsBuilder = CfnVPCPeeringConnectionProps.builder()
    propsBuilder.init()
    
    return CfnVPCPeeringConnection(this, id, propsBuilder.build())
}

fun Construct.cfnTrafficMirrorTarget(id: String, init: CfnTrafficMirrorTargetProps.Builder.() -> Unit): CfnTrafficMirrorTarget {
    val propsBuilder = CfnTrafficMirrorTargetProps.builder()
    propsBuilder.init()
    
    return CfnTrafficMirrorTarget(this, id, propsBuilder.build())
}

fun Construct.cfnClientVpnAuthorizationRule(id: String, init: CfnClientVpnAuthorizationRuleProps.Builder.() -> Unit): CfnClientVpnAuthorizationRule {
    val propsBuilder = CfnClientVpnAuthorizationRuleProps.builder()
    propsBuilder.init()
    
    return CfnClientVpnAuthorizationRule(this, id, propsBuilder.build())
}

fun Construct.cfnVolume(id: String, init: CfnVolumeProps.Builder.() -> Unit): CfnVolume {
    val propsBuilder = CfnVolumeProps.builder()
    propsBuilder.init()
    
    return CfnVolume(this, id, propsBuilder.build())
}

fun Construct.cfnCapacityReservation(id: String, init: CfnCapacityReservationProps.Builder.() -> Unit): CfnCapacityReservation {
    val propsBuilder = CfnCapacityReservationProps.builder()
    propsBuilder.init()
    
    return CfnCapacityReservation(this, id, propsBuilder.build())
}

fun Construct.cfnLocalGatewayRouteTableVPCAssociation(id: String, init: CfnLocalGatewayRouteTableVPCAssociationProps.Builder.() -> Unit): CfnLocalGatewayRouteTableVPCAssociation {
    val propsBuilder = CfnLocalGatewayRouteTableVPCAssociationProps.builder()
    propsBuilder.init()
    
    return CfnLocalGatewayRouteTableVPCAssociation(this, id, propsBuilder.build())
}

fun Construct.cfnEgressOnlyInternetGateway(id: String, init: CfnEgressOnlyInternetGatewayProps.Builder.() -> Unit): CfnEgressOnlyInternetGateway {
    val propsBuilder = CfnEgressOnlyInternetGatewayProps.builder()
    propsBuilder.init()
    
    return CfnEgressOnlyInternetGateway(this, id, propsBuilder.build())
}

fun Construct.cfnRouteTable(id: String, init: CfnRouteTableProps.Builder.() -> Unit): CfnRouteTable {
    val propsBuilder = CfnRouteTableProps.builder()
    propsBuilder.init()
    
    return CfnRouteTable(this, id, propsBuilder.build())
}

fun Construct.cfnClientVpnTargetNetworkAssociation(id: String, init: CfnClientVpnTargetNetworkAssociationProps.Builder.() -> Unit): CfnClientVpnTargetNetworkAssociation {
    val propsBuilder = CfnClientVpnTargetNetworkAssociationProps.builder()
    propsBuilder.init()
    
    return CfnClientVpnTargetNetworkAssociation(this, id, propsBuilder.build())
}

fun Construct.cfnSecurityGroupEgress(id: String, init: CfnSecurityGroupEgressProps.Builder.() -> Unit): CfnSecurityGroupEgress {
    val propsBuilder = CfnSecurityGroupEgressProps.builder()
    propsBuilder.init()
    
    return CfnSecurityGroupEgress(this, id, propsBuilder.build())
}

fun Construct.interfaceVpcEndpoint(id: String, init: InterfaceVpcEndpointProps.Builder.() -> Unit): InterfaceVpcEndpoint {
    val propsBuilder = InterfaceVpcEndpointProps.builder()
    propsBuilder.init()
    
    return InterfaceVpcEndpoint(this, id, propsBuilder.build())
}

fun Construct.cfnPlacementGroup(id: String, init: CfnPlacementGroupProps.Builder.() -> Unit): CfnPlacementGroup {
    val propsBuilder = CfnPlacementGroupProps.builder()
    propsBuilder.init()
    
    return CfnPlacementGroup(this, id, propsBuilder.build())
}

fun Construct.securityGroup(id: String, init: SecurityGroupProps.Builder.() -> Unit): SecurityGroup {
    val propsBuilder = SecurityGroupProps.builder()
    propsBuilder.init()
    
    return SecurityGroup(this, id, propsBuilder.build())
}

fun Construct.cfnNetworkAcl(id: String, init: CfnNetworkAclProps.Builder.() -> Unit): CfnNetworkAcl {
    val propsBuilder = CfnNetworkAclProps.builder()
    propsBuilder.init()
    
    return CfnNetworkAcl(this, id, propsBuilder.build())
}

fun Construct.cfnTransitGatewayRouteTableAssociation(id: String, init: CfnTransitGatewayRouteTableAssociationProps.Builder.() -> Unit): CfnTransitGatewayRouteTableAssociation {
    val propsBuilder = CfnTransitGatewayRouteTableAssociationProps.builder()
    propsBuilder.init()
    
    return CfnTransitGatewayRouteTableAssociation(this, id, propsBuilder.build())
}

fun Construct.cfnCustomerGateway(id: String, init: CfnCustomerGatewayProps.Builder.() -> Unit): CfnCustomerGateway {
    val propsBuilder = CfnCustomerGatewayProps.builder()
    propsBuilder.init()
    
    return CfnCustomerGateway(this, id, propsBuilder.build())
}

fun Construct.gatewayVpcEndpoint(id: String, init: GatewayVpcEndpointProps.Builder.() -> Unit): GatewayVpcEndpoint {
    val propsBuilder = GatewayVpcEndpointProps.builder()
    propsBuilder.init()
    
    return GatewayVpcEndpoint(this, id, propsBuilder.build())
}

fun Construct.cfnNetworkInterface(id: String, init: CfnNetworkInterfaceProps.Builder.() -> Unit): CfnNetworkInterface {
    val propsBuilder = CfnNetworkInterfaceProps.builder()
    propsBuilder.init()
    
    return CfnNetworkInterface(this, id, propsBuilder.build())
}

fun Construct.cfnSubnetRouteTableAssociation(id: String, init: CfnSubnetRouteTableAssociationProps.Builder.() -> Unit): CfnSubnetRouteTableAssociation {
    val propsBuilder = CfnSubnetRouteTableAssociationProps.builder()
    propsBuilder.init()
    
    return CfnSubnetRouteTableAssociation(this, id, propsBuilder.build())
}

fun Construct.cfnVolumeAttachment(id: String, init: CfnVolumeAttachmentProps.Builder.() -> Unit): CfnVolumeAttachment {
    val propsBuilder = CfnVolumeAttachmentProps.builder()
    propsBuilder.init()
    
    return CfnVolumeAttachment(this, id, propsBuilder.build())
}

fun Construct.cfnVPCDHCPOptionsAssociation(id: String, init: CfnVPCDHCPOptionsAssociationProps.Builder.() -> Unit): CfnVPCDHCPOptionsAssociation {
    val propsBuilder = CfnVPCDHCPOptionsAssociationProps.builder()
    propsBuilder.init()
    
    return CfnVPCDHCPOptionsAssociation(this, id, propsBuilder.build())
}

fun Construct.subnetNetworkAclAssociation(id: String, init: SubnetNetworkAclAssociationProps.Builder.() -> Unit): SubnetNetworkAclAssociation {
    val propsBuilder = SubnetNetworkAclAssociationProps.builder()
    propsBuilder.init()
    
    return SubnetNetworkAclAssociation(this, id, propsBuilder.build())
}

fun Construct.vpc(id: String, init: VpcProps.Builder.() -> Unit): Vpc {
    val propsBuilder = VpcProps.builder()
    propsBuilder.init()
    
    return Vpc(this, id, propsBuilder.build())
}

fun Construct.cfnVPCEndpoint(id: String, init: CfnVPCEndpointProps.Builder.() -> Unit): CfnVPCEndpoint {
    val propsBuilder = CfnVPCEndpointProps.builder()
    propsBuilder.init()
    
    return CfnVPCEndpoint(this, id, propsBuilder.build())
}

fun Construct.cfnInstance(id: String, init: CfnInstanceProps.Builder.() -> Unit): CfnInstance {
    val propsBuilder = CfnInstanceProps.builder()
    propsBuilder.init()
    
    return CfnInstance(this, id, propsBuilder.build())
}

fun Construct.cfnVPC(id: String, init: CfnVPCProps.Builder.() -> Unit): CfnVPC {
    val propsBuilder = CfnVPCProps.builder()
    propsBuilder.init()
    
    return CfnVPC(this, id, propsBuilder.build())
}

fun Construct.cfnInternetGateway(id: String, init: CfnInternetGatewayProps.Builder.() -> Unit): CfnInternetGateway {
    val propsBuilder = CfnInternetGatewayProps.builder()
    propsBuilder.init()
    
    return CfnInternetGateway(this, id, propsBuilder.build())
}

fun Construct.cfnLocalGatewayRoute(id: String, init: CfnLocalGatewayRouteProps.Builder.() -> Unit): CfnLocalGatewayRoute {
    val propsBuilder = CfnLocalGatewayRouteProps.builder()
    propsBuilder.init()
    
    return CfnLocalGatewayRoute(this, id, propsBuilder.build())
}

fun Construct.vpcEndpointService(id: String, init: VpcEndpointServiceProps.Builder.() -> Unit): VpcEndpointService {
    val propsBuilder = VpcEndpointServiceProps.builder()
    propsBuilder.init()
    
    return VpcEndpointService(this, id, propsBuilder.build())
}

fun Construct.cfnSecurityGroup(id: String, init: CfnSecurityGroupProps.Builder.() -> Unit): CfnSecurityGroup {
    val propsBuilder = CfnSecurityGroupProps.builder()
    propsBuilder.init()
    
    return CfnSecurityGroup(this, id, propsBuilder.build())
}

fun Construct.cfnEIPAssociation(id: String, init: CfnEIPAssociationProps.Builder.() -> Unit): CfnEIPAssociation {
    val propsBuilder = CfnEIPAssociationProps.builder()
    propsBuilder.init()
    
    return CfnEIPAssociation(this, id, propsBuilder.build())
}

fun Construct.cfnSubnetNetworkAclAssociation(id: String, init: CfnSubnetNetworkAclAssociationProps.Builder.() -> Unit): CfnSubnetNetworkAclAssociation {
    val propsBuilder = CfnSubnetNetworkAclAssociationProps.builder()
    propsBuilder.init()
    
    return CfnSubnetNetworkAclAssociation(this, id, propsBuilder.build())
}

fun Construct.cfnLaunchTemplate(id: String, init: CfnLaunchTemplateProps.Builder.() -> Unit): CfnLaunchTemplate {
    val propsBuilder = CfnLaunchTemplateProps.builder()
    propsBuilder.init()
    
    return CfnLaunchTemplate(this, id, propsBuilder.build())
}

fun Construct.cfnNetworkAclEntry(id: String, init: CfnNetworkAclEntryProps.Builder.() -> Unit): CfnNetworkAclEntry {
    val propsBuilder = CfnNetworkAclEntryProps.builder()
    propsBuilder.init()
    
    return CfnNetworkAclEntry(this, id, propsBuilder.build())
}

fun Construct.privateSubnet(id: String, init: PrivateSubnetProps.Builder.() -> Unit): PrivateSubnet {
    val propsBuilder = PrivateSubnetProps.builder()
    propsBuilder.init()
    
    return PrivateSubnet(this, id, propsBuilder.build())
}

fun Construct.cfnSecurityGroupIngress(id: String, init: CfnSecurityGroupIngressProps.Builder.() -> Unit): CfnSecurityGroupIngress {
    val propsBuilder = CfnSecurityGroupIngressProps.builder()
    propsBuilder.init()
    
    return CfnSecurityGroupIngress(this, id, propsBuilder.build())
}

fun Construct.cfnTransitGateway(id: String, init: CfnTransitGatewayProps.Builder.() -> Unit): CfnTransitGateway {
    val propsBuilder = CfnTransitGatewayProps.builder()
    propsBuilder.init()
    
    return CfnTransitGateway(this, id, propsBuilder.build())
}

fun Construct.cfnVPCGatewayAttachment(id: String, init: CfnVPCGatewayAttachmentProps.Builder.() -> Unit): CfnVPCGatewayAttachment {
    val propsBuilder = CfnVPCGatewayAttachmentProps.builder()
    propsBuilder.init()
    
    return CfnVPCGatewayAttachment(this, id, propsBuilder.build())
}

fun Construct.vpnConnection(id: String, init: VpnConnectionProps.Builder.() -> Unit): VpnConnection {
    val propsBuilder = VpnConnectionProps.builder()
    propsBuilder.init()
    
    return VpnConnection(this, id, propsBuilder.build())
}

fun Construct.cfnFlowLog(id: String, init: CfnFlowLogProps.Builder.() -> Unit): CfnFlowLog {
    val propsBuilder = CfnFlowLogProps.builder()
    propsBuilder.init()
    
    return CfnFlowLog(this, id, propsBuilder.build())
}

fun Construct.cfnTransitGatewayAttachment(id: String, init: CfnTransitGatewayAttachmentProps.Builder.() -> Unit): CfnTransitGatewayAttachment {
    val propsBuilder = CfnTransitGatewayAttachmentProps.builder()
    propsBuilder.init()
    
    return CfnTransitGatewayAttachment(this, id, propsBuilder.build())
}

fun Construct.cfnTransitGatewayRouteTable(id: String, init: CfnTransitGatewayRouteTableProps.Builder.() -> Unit): CfnTransitGatewayRouteTable {
    val propsBuilder = CfnTransitGatewayRouteTableProps.builder()
    propsBuilder.init()
    
    return CfnTransitGatewayRouteTable(this, id, propsBuilder.build())
}

fun Construct.cfnVPNConnectionRoute(id: String, init: CfnVPNConnectionRouteProps.Builder.() -> Unit): CfnVPNConnectionRoute {
    val propsBuilder = CfnVPNConnectionRouteProps.builder()
    propsBuilder.init()
    
    return CfnVPNConnectionRoute(this, id, propsBuilder.build())
}

fun Construct.networkAcl(id: String, init: NetworkAclProps.Builder.() -> Unit): NetworkAcl {
    val propsBuilder = NetworkAclProps.builder()
    propsBuilder.init()
    
    return NetworkAcl(this, id, propsBuilder.build())
}

fun Construct.cfnNatGateway(id: String, init: CfnNatGatewayProps.Builder.() -> Unit): CfnNatGateway {
    val propsBuilder = CfnNatGatewayProps.builder()
    propsBuilder.init()
    
    return CfnNatGateway(this, id, propsBuilder.build())
}

fun Construct.subnet(id: String, init: SubnetProps.Builder.() -> Unit): Subnet {
    val propsBuilder = SubnetProps.builder()
    propsBuilder.init()
    
    return Subnet(this, id, propsBuilder.build())
}

fun Construct.cfnNetworkInterfaceAttachment(id: String, init: CfnNetworkInterfaceAttachmentProps.Builder.() -> Unit): CfnNetworkInterfaceAttachment {
    val propsBuilder = CfnNetworkInterfaceAttachmentProps.builder()
    propsBuilder.init()
    
    return CfnNetworkInterfaceAttachment(this, id, propsBuilder.build())
}

fun Construct.cfnClientVpnEndpoint(id: String, init: CfnClientVpnEndpointProps.Builder.() -> Unit): CfnClientVpnEndpoint {
    val propsBuilder = CfnClientVpnEndpointProps.builder()
    propsBuilder.init()
    
    return CfnClientVpnEndpoint(this, id, propsBuilder.build())
}

fun Construct.cfnTrafficMirrorFilter(id: String, init: CfnTrafficMirrorFilterProps.Builder.() -> Unit): CfnTrafficMirrorFilter {
    val propsBuilder = CfnTrafficMirrorFilterProps.builder()
    propsBuilder.init()
    
    return CfnTrafficMirrorFilter(this, id, propsBuilder.build())
}

fun Construct.cfnVPNGateway(id: String, init: CfnVPNGatewayProps.Builder.() -> Unit): CfnVPNGateway {
    val propsBuilder = CfnVPNGatewayProps.builder()
    propsBuilder.init()
    
    return CfnVPNGateway(this, id, propsBuilder.build())
}

fun Construct.cfnVPCEndpointServicePermissions(id: String, init: CfnVPCEndpointServicePermissionsProps.Builder.() -> Unit): CfnVPCEndpointServicePermissions {
    val propsBuilder = CfnVPCEndpointServicePermissionsProps.builder()
    propsBuilder.init()
    
    return CfnVPCEndpointServicePermissions(this, id, propsBuilder.build())
}

fun Construct.instance(id: String, init: InstanceProps.Builder.() -> Unit): Instance {
    val propsBuilder = InstanceProps.builder()
    propsBuilder.init()
    
    return Instance(this, id, propsBuilder.build())
}

fun Construct.cfnRoute(id: String, init: CfnRouteProps.Builder.() -> Unit): CfnRoute {
    val propsBuilder = CfnRouteProps.builder()
    propsBuilder.init()
    
    return CfnRoute(this, id, propsBuilder.build())
}

fun Construct.cfnClientVpnRoute(id: String, init: CfnClientVpnRouteProps.Builder.() -> Unit): CfnClientVpnRoute {
    val propsBuilder = CfnClientVpnRouteProps.builder()
    propsBuilder.init()
    
    return CfnClientVpnRoute(this, id, propsBuilder.build())
}

fun Construct.cfnHost(id: String, init: CfnHostProps.Builder.() -> Unit): CfnHost {
    val propsBuilder = CfnHostProps.builder()
    propsBuilder.init()
    
    return CfnHost(this, id, propsBuilder.build())
}

fun Construct.cfnSpotFleet(id: String, init: CfnSpotFleetProps.Builder.() -> Unit): CfnSpotFleet {
    val propsBuilder = CfnSpotFleetProps.builder()
    propsBuilder.init()
    
    return CfnSpotFleet(this, id, propsBuilder.build())
}

fun Construct.cfnTrafficMirrorSession(id: String, init: CfnTrafficMirrorSessionProps.Builder.() -> Unit): CfnTrafficMirrorSession {
    val propsBuilder = CfnTrafficMirrorSessionProps.builder()
    propsBuilder.init()
    
    return CfnTrafficMirrorSession(this, id, propsBuilder.build())
}

fun Construct.cfnVPCCidrBlock(id: String, init: CfnVPCCidrBlockProps.Builder.() -> Unit): CfnVPCCidrBlock {
    val propsBuilder = CfnVPCCidrBlockProps.builder()
    propsBuilder.init()
    
    return CfnVPCCidrBlock(this, id, propsBuilder.build())
}

fun Construct.flowLog(id: String, init: FlowLogProps.Builder.() -> Unit): FlowLog {
    val propsBuilder = FlowLogProps.builder()
    propsBuilder.init()
    
    return FlowLog(this, id, propsBuilder.build())
}

fun Construct.cfnEIP(id: String, init: CfnEIPProps.Builder.() -> Unit): CfnEIP {
    val propsBuilder = CfnEIPProps.builder()
    propsBuilder.init()
    
    return CfnEIP(this, id, propsBuilder.build())
}

fun Construct.cfnEC2Fleet(id: String, init: CfnEC2FleetProps.Builder.() -> Unit): CfnEC2Fleet {
    val propsBuilder = CfnEC2FleetProps.builder()
    propsBuilder.init()
    
    return CfnEC2Fleet(this, id, propsBuilder.build())
}

fun Construct.bastionHostLinux(id: String, init: BastionHostLinuxProps.Builder.() -> Unit): BastionHostLinux {
    val propsBuilder = BastionHostLinuxProps.builder()
    propsBuilder.init()
    
    return BastionHostLinux(this, id, propsBuilder.build())
}

fun Construct.cfnVPNGatewayRoutePropagation(id: String, init: CfnVPNGatewayRoutePropagationProps.Builder.() -> Unit): CfnVPNGatewayRoutePropagation {
    val propsBuilder = CfnVPNGatewayRoutePropagationProps.builder()
    propsBuilder.init()
    
    return CfnVPNGatewayRoutePropagation(this, id, propsBuilder.build())
}

fun Construct.cfnDHCPOptions(id: String, init: CfnDHCPOptionsProps.Builder.() -> Unit): CfnDHCPOptions {
    val propsBuilder = CfnDHCPOptionsProps.builder()
    propsBuilder.init()
    
    return CfnDHCPOptions(this, id, propsBuilder.build())
}

fun Construct.cfnTransitGatewayRoute(id: String, init: CfnTransitGatewayRouteProps.Builder.() -> Unit): CfnTransitGatewayRoute {
    val propsBuilder = CfnTransitGatewayRouteProps.builder()
    propsBuilder.init()
    
    return CfnTransitGatewayRoute(this, id, propsBuilder.build())
}

fun Construct.cfnVPCEndpointConnectionNotification(id: String, init: CfnVPCEndpointConnectionNotificationProps.Builder.() -> Unit): CfnVPCEndpointConnectionNotification {
    val propsBuilder = CfnVPCEndpointConnectionNotificationProps.builder()
    propsBuilder.init()
    
    return CfnVPCEndpointConnectionNotification(this, id, propsBuilder.build())
}

