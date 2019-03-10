package encrypt.service;

import io.micronaut.runtime.server.EmbeddedServer;
import io.reactivex.Single;

import javax.inject.Singleton;

@Singleton
public class EncryptionService {

    private final EmbeddedServer embeddedServer;

    public EncryptionService(EmbeddedServer embeddedServer) {
        this.embeddedServer = embeddedServer;
    }

    public Single<MyMessage> encrypt(String text) {
        String encrypted = new StringBuilder(text).reverse().toString();
        return Single.just(new MyMessage(encrypted + " -> " + embeddedServer.getPort()));
    }
}
