package com.brianyarr.cdk.iam

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.iam.User
import software.amazon.awscdk.services.iam.UserProps
import software.amazon.awscdk.services.iam.Role
import software.amazon.awscdk.services.iam.RoleProps
import software.amazon.awscdk.services.iam.CfnGroup
import software.amazon.awscdk.services.iam.CfnGroupProps
import software.amazon.awscdk.services.iam.CfnServiceLinkedRole
import software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps
import software.amazon.awscdk.services.iam.LazyRole
import software.amazon.awscdk.services.iam.LazyRoleProps
import software.amazon.awscdk.services.iam.ManagedPolicy
import software.amazon.awscdk.services.iam.ManagedPolicyProps
import software.amazon.awscdk.services.iam.CfnInstanceProfile
import software.amazon.awscdk.services.iam.CfnInstanceProfileProps
import software.amazon.awscdk.services.iam.Group
import software.amazon.awscdk.services.iam.GroupProps
import software.amazon.awscdk.services.iam.CfnManagedPolicy
import software.amazon.awscdk.services.iam.CfnManagedPolicyProps
import software.amazon.awscdk.services.iam.CfnRole
import software.amazon.awscdk.services.iam.CfnRoleProps
import software.amazon.awscdk.services.iam.Policy
import software.amazon.awscdk.services.iam.PolicyProps
import software.amazon.awscdk.services.iam.CfnUserToGroupAddition
import software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps
import software.amazon.awscdk.services.iam.CfnAccessKey
import software.amazon.awscdk.services.iam.CfnAccessKeyProps
import software.amazon.awscdk.services.iam.CfnPolicy
import software.amazon.awscdk.services.iam.CfnPolicyProps
import software.amazon.awscdk.services.iam.CfnUser
import software.amazon.awscdk.services.iam.CfnUserProps

fun Construct.user(id: String, init: UserProps.Builder.() -> Unit): User {
    val propsBuilder = UserProps.builder()
    propsBuilder.init()
    
    return User(this, id, propsBuilder.build())
}

fun Construct.role(id: String, init: RoleProps.Builder.() -> Unit): Role {
    val propsBuilder = RoleProps.builder()
    propsBuilder.init()
    
    return Role(this, id, propsBuilder.build())
}

fun Construct.cfnGroup(id: String, init: CfnGroupProps.Builder.() -> Unit): CfnGroup {
    val propsBuilder = CfnGroupProps.builder()
    propsBuilder.init()
    
    return CfnGroup(this, id, propsBuilder.build())
}

fun Construct.cfnServiceLinkedRole(id: String, init: CfnServiceLinkedRoleProps.Builder.() -> Unit): CfnServiceLinkedRole {
    val propsBuilder = CfnServiceLinkedRoleProps.builder()
    propsBuilder.init()
    
    return CfnServiceLinkedRole(this, id, propsBuilder.build())
}

fun Construct.lazyRole(id: String, init: LazyRoleProps.Builder.() -> Unit): LazyRole {
    val propsBuilder = LazyRoleProps.builder()
    propsBuilder.init()
    
    return LazyRole(this, id, propsBuilder.build())
}

fun Construct.managedPolicy(id: String, init: ManagedPolicyProps.Builder.() -> Unit): ManagedPolicy {
    val propsBuilder = ManagedPolicyProps.builder()
    propsBuilder.init()
    
    return ManagedPolicy(this, id, propsBuilder.build())
}

fun Construct.cfnInstanceProfile(id: String, init: CfnInstanceProfileProps.Builder.() -> Unit): CfnInstanceProfile {
    val propsBuilder = CfnInstanceProfileProps.builder()
    propsBuilder.init()
    
    return CfnInstanceProfile(this, id, propsBuilder.build())
}

fun Construct.group(id: String, init: GroupProps.Builder.() -> Unit): Group {
    val propsBuilder = GroupProps.builder()
    propsBuilder.init()
    
    return Group(this, id, propsBuilder.build())
}

fun Construct.cfnManagedPolicy(id: String, init: CfnManagedPolicyProps.Builder.() -> Unit): CfnManagedPolicy {
    val propsBuilder = CfnManagedPolicyProps.builder()
    propsBuilder.init()
    
    return CfnManagedPolicy(this, id, propsBuilder.build())
}

fun Construct.cfnRole(id: String, init: CfnRoleProps.Builder.() -> Unit): CfnRole {
    val propsBuilder = CfnRoleProps.builder()
    propsBuilder.init()
    
    return CfnRole(this, id, propsBuilder.build())
}

fun Construct.policy(id: String, init: PolicyProps.Builder.() -> Unit): Policy {
    val propsBuilder = PolicyProps.builder()
    propsBuilder.init()
    
    return Policy(this, id, propsBuilder.build())
}

fun Construct.cfnUserToGroupAddition(id: String, init: CfnUserToGroupAdditionProps.Builder.() -> Unit): CfnUserToGroupAddition {
    val propsBuilder = CfnUserToGroupAdditionProps.builder()
    propsBuilder.init()
    
    return CfnUserToGroupAddition(this, id, propsBuilder.build())
}

fun Construct.cfnAccessKey(id: String, init: CfnAccessKeyProps.Builder.() -> Unit): CfnAccessKey {
    val propsBuilder = CfnAccessKeyProps.builder()
    propsBuilder.init()
    
    return CfnAccessKey(this, id, propsBuilder.build())
}

fun Construct.cfnPolicy(id: String, init: CfnPolicyProps.Builder.() -> Unit): CfnPolicy {
    val propsBuilder = CfnPolicyProps.builder()
    propsBuilder.init()
    
    return CfnPolicy(this, id, propsBuilder.build())
}

fun Construct.cfnUser(id: String, init: CfnUserProps.Builder.() -> Unit): CfnUser {
    val propsBuilder = CfnUserProps.builder()
    propsBuilder.init()
    
    return CfnUser(this, id, propsBuilder.build())
}

