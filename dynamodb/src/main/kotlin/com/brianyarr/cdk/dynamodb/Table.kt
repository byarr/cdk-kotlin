package com.brianyarr.cdk.dynamodb

import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.AttributeType
import software.amazon.awscdk.services.dynamodb.Table

fun attribute(name: String, type: AttributeType): Attribute {

    return Attribute.builder().name(name).type(type).build()

}