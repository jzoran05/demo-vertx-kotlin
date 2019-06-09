package sample.vertx

import io.vertx.rxjava.core.AbstractVerticle
import io.vertx.rxjava.core.http.HttpServer

class MyFirstRXVerticle : AbstractVerticle() {

    override fun start() {
        val server:HttpServer = vertx.createHttpServer()

        /*
        server.requestio.vertxtStream()
            .toObservable()
            .subscribe {req -> req.response().end("Hello from ${Thread.currentThread().name}")}
         server
             .rxListen(8080)
             .subscribe()

        super.start()

         */
    }

    override fun stop() {
        super.stop()
    }
}