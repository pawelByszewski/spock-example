package eu.softisland.spock;

public class OfferDetails {

    private String title;
    private String category;
    private Price pice;

    public OfferDetails() {
    }

    AdultChecker adultChecker;

    StatusChecker statusChecker;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Price getPice() {
        return pice;
    }

    public void setPice(Price pice) {
        this.pice = pice;
    }

    public boolean isOnlyForAdult() {
        return !adultChecker.canBuy(this);
    }

    public String buy() {
        if (isOnlyForAdult()) {
            throw new IllegalStateException("asfd");
        } else {
            return "success";
        }
    }

    public String buyAsHacker() {
        if (isOnlyForAdult()) {
            throw new IllegalStateException("asfd");
        } else {
            return "success";
        }
    }

    public String checkStatus() {
        String status = statusChecker.checkStatus(this);
        if ("error".equals(status)) {
            status = statusChecker.checkStatus(this);
        }
        return status;
    }
}
