package eu.softisland.spock

import spock.lang.Specification


class OfferDetailsSpec extends Specification {

    def "has valid title"() {
        given:
            OfferDetails offerDetails = new OfferDetails()

        when:
            offerDetails.setTitle("test")
//            offerDetails.setTitle("Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
//                    "sed do eiusmod tempor incididunt ut labore")

        then:
            offerDetails.title == 'test'
//            offerDetails.title == 'Lorem ipsum dolor sit amet, consectetur adipicsing elit, sed do ' +
//                    'eiusmod tempor incididunt ut labore'
    }

}
