package building

import grails.test.mixin.integration.Integration
import spock.lang.Specification

/**
 * Created by Albert van Veen on 30-Aug-16.
 */

@Integration
class DummyIntegrationSpec extends Specification{

    def "dummy"(){
        when:
        def x = 0;
        then:
        true
    }

}
