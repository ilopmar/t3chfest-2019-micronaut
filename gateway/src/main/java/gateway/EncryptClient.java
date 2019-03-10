package gateway;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

@Client(id = "encrypt-service")
public interface EncryptClient extends EncryptOperations {

}
