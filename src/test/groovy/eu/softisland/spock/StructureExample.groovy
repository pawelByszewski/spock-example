package eu.softisland.spock

import spock.lang.Specification


class StructureExample extends Specification {

    def someTest() {
        given:
            int a = 5;

        when:
            int b = a + 8;

        then:
            b == 13;
    }
}
