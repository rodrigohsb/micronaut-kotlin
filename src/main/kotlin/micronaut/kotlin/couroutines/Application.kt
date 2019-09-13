package micronaut.kotlin.couroutines

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("micronaut.kotlin.couroutines")
                .mainClass(Application.javaClass)
                .start()
    }
}