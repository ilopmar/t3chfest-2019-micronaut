package encrypt.service;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.tracing.annotation.NewSpan;
import io.micronaut.tracing.annotation.SpanTag;
import io.reactivex.Single;

@Controller("/")
public class EncryptController {

    private final EncryptionService encryptionService;

    public EncryptController(EncryptionService encryptionService) {
        this.encryptionService = encryptionService;
    }

    @NewSpan
    @Get("/encrypt/{text}")
    public Single<MyMessage> encrypt(@SpanTag("plainText") String text) {
        return encryptionService.encrypt(text);
    }
}
