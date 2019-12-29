package com.brianyarr.cdk.certificatemanager

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.certificatemanager.Certificate
import software.amazon.awscdk.services.certificatemanager.CertificateProps
import software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificate
import software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps

fun Construct.certificate(id: String, init: CertificateProps.Builder.() -> Unit): Certificate {
    val propsBuilder = CertificateProps.builder()
    propsBuilder.init()
    
    return Certificate(this, id, propsBuilder.build())
}


fun Construct.dnsValidatedCertificate(id: String, init: DnsValidatedCertificateProps.Builder.() -> Unit): DnsValidatedCertificate {
    val propsBuilder = DnsValidatedCertificateProps.builder()
    propsBuilder.init()
    
    return DnsValidatedCertificate(this, id, propsBuilder.build())
}


