package micronaut.kotlin.couroutines

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.reactivex.Single

@Controller("/hello")
class HelloController {

    @Get("/{name}")
    fun index(name: String): Single<String> {
        return Single.just("Hello, $name")
    }
}