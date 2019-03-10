package gateway;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;

@Controller("/api/${api.version:v1}")
public class GatewayController {

    private final EncryptClient encryptClient;

    public GatewayController(EncryptClient encryptClient) {
        this.encryptClient = encryptClient;
    }

    @Get("/encrypt/{text}")
    public Single<MyMessage> encrypt(String text) {
        return encryptClient.encrypt(text);
    }
}
