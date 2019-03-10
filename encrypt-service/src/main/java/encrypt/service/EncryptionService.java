package encrypt.service;

import io.reactivex.Single;

import javax.inject.Singleton;

@Singleton
public class EncryptionService {

    public Single<MyMessage> encrypt(String text) {
        String encrypted = new StringBuilder(text).reverse().toString();
        return Single.just(new MyMessage(encrypted));
    }
}
