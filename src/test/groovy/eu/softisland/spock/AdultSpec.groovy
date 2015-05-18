package eu.softisland.spock

import spock.lang.Specification


class AdultSpec extends Specification {

    def "could not buy if product only for adults"() {
        given:
            OfferDetails offerDetails = new OfferDetails()
            AdultChecker adultChecker = Stub(AdultChecker)
            offerDetails.adultChecker = adultChecker
            adultChecker.canBuy(offerDetails) >> false

        when:
            offerDetails.buy()

        then:
            thrown(IllegalStateException)
    }

    def "could not buy if product only for adults2"() {
        given:
        OfferDetails offerDetails = new OfferDetails()
        AdultChecker adultChecker = Stub(AdultChecker)
        offerDetails.adultChecker = adultChecker
        adultChecker.canBuy(_) >> false

        when:
        offerDetails.buy()

        then:
        thrown(IllegalStateException)
    }

    def "should check if can buy"() {
        given:
            OfferDetails offerDetails = new OfferDetails()
            AdultChecker adultChecker = Mock(AdultChecker)
            offerDetails.adultChecker = adultChecker

        when:
            offerDetails.buy()

        then:
            1 * adultChecker.canBuy(_) >> true
    }

    def "should check if can buy2"() {
        given:
            OfferDetails offerDetails = new OfferDetails()
            offerDetails.title = 'test'
            AdultChecker adultChecker = Mock(AdultChecker)
            offerDetails.adultChecker = adultChecker

        when:
            offerDetails.buy()

        then:
            1 * adultChecker.canBuy { it.title == 'test' } >> true
    }

    def "should allow everything if hacker"() {
        given:
        OfferDetails offerDetails = new OfferDetails()
        offerDetails.title = 'test'
        AdultChecker adultChecker = Mock(AdultChecker)
        offerDetails.adultChecker = adultChecker

        when:
        offerDetails.buyAsHacker()

        then:
        0 *_._
    }

    def "try to check status once again if fail"() {
        given:
            OfferDetails offerDetails = new OfferDetails()
            StatusChecker statusChecker = Mock(StatusChecker)
            offerDetails.statusChecker = statusChecker;

        when:
            def result = offerDetails.checkStatus()

        then:
            2 * statusChecker.checkStatus(_ as OfferDetails) >>> ['error', 'success']
            result == 'success'
    }



}
