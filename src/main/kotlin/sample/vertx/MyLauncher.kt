package sample.vertx

import io.vertx.core.Launcher
import io.vertx.core.Vertx
import io.vertx.core.VertxOptions

class MyLauncher : Launcher() {

    override fun beforeStartingVertx(options: VertxOptions?) {
        super.beforeStartingVertx(options)
    }

    override fun afterStartingVertx(vertx: Vertx?) {
        super.afterStartingVertx(vertx)
    }

    override fun getDefaultCommand(): String {
        return super.getDefaultCommand()
    }

    override fun getMainVerticle(): String {
        return super.getMainVerticle()
    }
}