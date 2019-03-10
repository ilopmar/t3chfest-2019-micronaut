package encrypt.service

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class EncryptControllerSpec extends Specification {

    @Inject
    EncryptClient encryptClient

    void 'test encrypt controller'() {
        expect:
            encryptClient.encrypt('Hola T3chFest').blockingGet().getText() == 'tseFhc3T aloH'
    }
}
