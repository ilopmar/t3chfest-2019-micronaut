package encrypt.service;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;

@Controller("/")
public class EncryptController {

    @Get("/encrypt/{text}")
    public Single<MyMessage> encrypt(String text) {
        String encrypted = new StringBuilder(text).reverse().toString();
        return Single.just(new MyMessage(encrypted));
    }
}
