package com.brianyarr.cdk.core

import software.amazon.awscdk.core.App
import software.amazon.awscdk.core.AppProps
import software.amazon.awscdk.core.Stack

fun app(init: App.() -> Unit): App {
    val app = App()
    app.init()
    return app
}

fun app(props: AppProps, init: App.() -> Unit): App {
    val app = App(props)
    app.init()
    return app
}

fun App.stack(id: String, init: Stack.() -> Unit): Stack {
    val stack = Stack(this, id)
    stack.init()
    return stack
}


fun stack(init: Stack.() -> Unit): Stack {
    val stack = Stack()
    stack.init()
    return stack
}
