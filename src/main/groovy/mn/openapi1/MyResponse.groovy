package mn.openapi1

import groovy.transform.CompileStatic
import io.swagger.v3.oas.annotations.media.Schema

@CompileStatic
class MyResponse {

    @Schema(oneOf = [PayloadFoo, PayloadBar])
    Payload payload
}
