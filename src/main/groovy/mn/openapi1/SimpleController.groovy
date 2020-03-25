package mn.openapi1

import groovy.transform.CompileStatic
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/fop")
@CompileStatic
class SimpleController {

    @Post('/')
    HttpResponse<MyResponse> foo(Long someId) {

    }
}
