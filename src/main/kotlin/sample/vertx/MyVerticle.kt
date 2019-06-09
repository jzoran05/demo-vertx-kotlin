package sample.vertx

import io.vertx.core.AbstractVerticle

class MyVerticle : AbstractVerticle() {

    // Called when verticle is deployed
    override fun start() {
        vertx.createHttpServer()
            .requestHandler { req -> req.response().end("Hello from ${Thread.currentThread().name}")
            }.listen(8080)
    }

    // Optional - called when verticle is undeployed
    override fun stop() {
    }


}