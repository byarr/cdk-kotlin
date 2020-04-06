package com.brianyarr.cdk.acmpca

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps
import software.amazon.awscdk.services.acmpca.CfnCertificate
import software.amazon.awscdk.services.acmpca.CfnCertificateProps
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityProps

fun Construct.cfnCertificateAuthorityActivation(id: String, init: CfnCertificateAuthorityActivationProps.Builder.() -> Unit): CfnCertificateAuthorityActivation {
    val propsBuilder = CfnCertificateAuthorityActivationProps.builder()
    propsBuilder.init()
    
    return CfnCertificateAuthorityActivation(this, id, propsBuilder.build())
}

fun Construct.cfnCertificate(id: String, init: CfnCertificateProps.Builder.() -> Unit): CfnCertificate {
    val propsBuilder = CfnCertificateProps.builder()
    propsBuilder.init()
    
    return CfnCertificate(this, id, propsBuilder.build())
}

fun Construct.cfnCertificateAuthority(id: String, init: CfnCertificateAuthorityProps.Builder.() -> Unit): CfnCertificateAuthority {
    val propsBuilder = CfnCertificateAuthorityProps.builder()
    propsBuilder.init()
    
    return CfnCertificateAuthority(this, id, propsBuilder.build())
}

