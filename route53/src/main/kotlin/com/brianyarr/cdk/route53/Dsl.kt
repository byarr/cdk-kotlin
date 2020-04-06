package com.brianyarr.cdk.route53

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.route53.PublicHostedZone
import software.amazon.awscdk.services.route53.PublicHostedZoneProps
import software.amazon.awscdk.services.route53.SrvRecord
import software.amazon.awscdk.services.route53.SrvRecordProps
import software.amazon.awscdk.services.route53.RecordSet
import software.amazon.awscdk.services.route53.RecordSetProps
import software.amazon.awscdk.services.route53.PrivateHostedZone
import software.amazon.awscdk.services.route53.PrivateHostedZoneProps
import software.amazon.awscdk.services.route53.HostedZone
import software.amazon.awscdk.services.route53.HostedZoneProps
import software.amazon.awscdk.services.route53.ARecord
import software.amazon.awscdk.services.route53.ARecordProps
import software.amazon.awscdk.services.route53.CfnRecordSet
import software.amazon.awscdk.services.route53.CfnRecordSetProps
import software.amazon.awscdk.services.route53.CfnHealthCheck
import software.amazon.awscdk.services.route53.CfnHealthCheckProps
import software.amazon.awscdk.services.route53.CaaAmazonRecord
import software.amazon.awscdk.services.route53.CaaAmazonRecordProps
import software.amazon.awscdk.services.route53.CfnRecordSetGroup
import software.amazon.awscdk.services.route53.CfnRecordSetGroupProps
import software.amazon.awscdk.services.route53.MxRecord
import software.amazon.awscdk.services.route53.MxRecordProps
import software.amazon.awscdk.services.route53.AaaaRecord
import software.amazon.awscdk.services.route53.AaaaRecordProps
import software.amazon.awscdk.services.route53.ZoneDelegationRecord
import software.amazon.awscdk.services.route53.ZoneDelegationRecordProps
import software.amazon.awscdk.services.route53.CaaRecord
import software.amazon.awscdk.services.route53.CaaRecordProps
import software.amazon.awscdk.services.route53.CnameRecord
import software.amazon.awscdk.services.route53.CnameRecordProps
import software.amazon.awscdk.services.route53.TxtRecord
import software.amazon.awscdk.services.route53.TxtRecordProps
import software.amazon.awscdk.services.route53.CfnHostedZone
import software.amazon.awscdk.services.route53.CfnHostedZoneProps

fun Construct.publicHostedZone(id: String, init: PublicHostedZoneProps.Builder.() -> Unit): PublicHostedZone {
    val propsBuilder = PublicHostedZoneProps.builder()
    propsBuilder.init()
    
    return PublicHostedZone(this, id, propsBuilder.build())
}

fun Construct.srvRecord(id: String, init: SrvRecordProps.Builder.() -> Unit): SrvRecord {
    val propsBuilder = SrvRecordProps.builder()
    propsBuilder.init()
    
    return SrvRecord(this, id, propsBuilder.build())
}

fun Construct.recordSet(id: String, init: RecordSetProps.Builder.() -> Unit): RecordSet {
    val propsBuilder = RecordSetProps.builder()
    propsBuilder.init()
    
    return RecordSet(this, id, propsBuilder.build())
}

fun Construct.privateHostedZone(id: String, init: PrivateHostedZoneProps.Builder.() -> Unit): PrivateHostedZone {
    val propsBuilder = PrivateHostedZoneProps.builder()
    propsBuilder.init()
    
    return PrivateHostedZone(this, id, propsBuilder.build())
}

fun Construct.hostedZone(id: String, init: HostedZoneProps.Builder.() -> Unit): HostedZone {
    val propsBuilder = HostedZoneProps.builder()
    propsBuilder.init()
    
    return HostedZone(this, id, propsBuilder.build())
}

fun Construct.aRecord(id: String, init: ARecordProps.Builder.() -> Unit): ARecord {
    val propsBuilder = ARecordProps.builder()
    propsBuilder.init()
    
    return ARecord(this, id, propsBuilder.build())
}

fun Construct.cfnRecordSet(id: String, init: CfnRecordSetProps.Builder.() -> Unit): CfnRecordSet {
    val propsBuilder = CfnRecordSetProps.builder()
    propsBuilder.init()
    
    return CfnRecordSet(this, id, propsBuilder.build())
}

fun Construct.cfnHealthCheck(id: String, init: CfnHealthCheckProps.Builder.() -> Unit): CfnHealthCheck {
    val propsBuilder = CfnHealthCheckProps.builder()
    propsBuilder.init()
    
    return CfnHealthCheck(this, id, propsBuilder.build())
}

fun Construct.caaAmazonRecord(id: String, init: CaaAmazonRecordProps.Builder.() -> Unit): CaaAmazonRecord {
    val propsBuilder = CaaAmazonRecordProps.builder()
    propsBuilder.init()
    
    return CaaAmazonRecord(this, id, propsBuilder.build())
}

fun Construct.cfnRecordSetGroup(id: String, init: CfnRecordSetGroupProps.Builder.() -> Unit): CfnRecordSetGroup {
    val propsBuilder = CfnRecordSetGroupProps.builder()
    propsBuilder.init()
    
    return CfnRecordSetGroup(this, id, propsBuilder.build())
}

fun Construct.mxRecord(id: String, init: MxRecordProps.Builder.() -> Unit): MxRecord {
    val propsBuilder = MxRecordProps.builder()
    propsBuilder.init()
    
    return MxRecord(this, id, propsBuilder.build())
}

fun Construct.aaaaRecord(id: String, init: AaaaRecordProps.Builder.() -> Unit): AaaaRecord {
    val propsBuilder = AaaaRecordProps.builder()
    propsBuilder.init()
    
    return AaaaRecord(this, id, propsBuilder.build())
}

fun Construct.zoneDelegationRecord(id: String, init: ZoneDelegationRecordProps.Builder.() -> Unit): ZoneDelegationRecord {
    val propsBuilder = ZoneDelegationRecordProps.builder()
    propsBuilder.init()
    
    return ZoneDelegationRecord(this, id, propsBuilder.build())
}

fun Construct.caaRecord(id: String, init: CaaRecordProps.Builder.() -> Unit): CaaRecord {
    val propsBuilder = CaaRecordProps.builder()
    propsBuilder.init()
    
    return CaaRecord(this, id, propsBuilder.build())
}

fun Construct.cnameRecord(id: String, init: CnameRecordProps.Builder.() -> Unit): CnameRecord {
    val propsBuilder = CnameRecordProps.builder()
    propsBuilder.init()
    
    return CnameRecord(this, id, propsBuilder.build())
}

fun Construct.txtRecord(id: String, init: TxtRecordProps.Builder.() -> Unit): TxtRecord {
    val propsBuilder = TxtRecordProps.builder()
    propsBuilder.init()
    
    return TxtRecord(this, id, propsBuilder.build())
}

fun Construct.cfnHostedZone(id: String, init: CfnHostedZoneProps.Builder.() -> Unit): CfnHostedZone {
    val propsBuilder = CfnHostedZoneProps.builder()
    propsBuilder.init()
    
    return CfnHostedZone(this, id, propsBuilder.build())
}

