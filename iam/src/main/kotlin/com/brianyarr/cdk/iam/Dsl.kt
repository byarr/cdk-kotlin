package com.brianyarr.cdk.iam

import software.amazon.awscdk.core.Construct
import software.amazon.awscdk.services.iam.Role
import software.amazon.awscdk.services.iam.RoleProps
import software.amazon.awscdk.services.iam.User
import software.amazon.awscdk.services.iam.UserProps
import software.amazon.awscdk.services.iam.ManagedPolicy
import software.amazon.awscdk.services.iam.ManagedPolicyProps
import software.amazon.awscdk.services.iam.LazyRole
import software.amazon.awscdk.services.iam.LazyRoleProps
import software.amazon.awscdk.services.iam.Group
import software.amazon.awscdk.services.iam.GroupProps
import software.amazon.awscdk.services.iam.Policy
import software.amazon.awscdk.services.iam.PolicyProps

fun Construct.role(id: String, init: RoleProps.Builder.() -> Unit): Role {
    val propsBuilder = RoleProps.builder()
    propsBuilder.init()
    
    return Role(this, id, propsBuilder.build())
}


fun Construct.user(id: String, init: UserProps.Builder.() -> Unit): User {
    val propsBuilder = UserProps.builder()
    propsBuilder.init()
    
    return User(this, id, propsBuilder.build())
}


fun Construct.managedPolicy(id: String, init: ManagedPolicyProps.Builder.() -> Unit): ManagedPolicy {
    val propsBuilder = ManagedPolicyProps.builder()
    propsBuilder.init()
    
    return ManagedPolicy(this, id, propsBuilder.build())
}


fun Construct.lazyRole(id: String, init: LazyRoleProps.Builder.() -> Unit): LazyRole {
    val propsBuilder = LazyRoleProps.builder()
    propsBuilder.init()
    
    return LazyRole(this, id, propsBuilder.build())
}


fun Construct.group(id: String, init: GroupProps.Builder.() -> Unit): Group {
    val propsBuilder = GroupProps.builder()
    propsBuilder.init()
    
    return Group(this, id, propsBuilder.build())
}


fun Construct.policy(id: String, init: PolicyProps.Builder.() -> Unit): Policy {
    val propsBuilder = PolicyProps.builder()
    propsBuilder.init()
    
    return Policy(this, id, propsBuilder.build())
}


