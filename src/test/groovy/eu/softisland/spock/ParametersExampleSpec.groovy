package eu.softisland.spock
import spock.lang.Specification

class ParametersExampleSpec extends Specification {

    def "should be not empty"() {
        given:
            String example = 'asdf'

        expect:
            example.isEmpty() == false
    }
}
