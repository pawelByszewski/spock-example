package eu.softisland.spock;


import java.math.BigDecimal;

public class Price {

    private BigDecimal buyNowPrice;
    private BigDecimal reserverPrice;
    private boolean isAuction;

    public Price() {
    }

    public Price(BigDecimal buyNowPrice, BigDecimal reserverPrice, boolean isAuction) {
        this.buyNowPrice = buyNowPrice;
        this.reserverPrice = reserverPrice;
        this.isAuction = isAuction;
    }

    public BigDecimal getReserverPrice() {
        return reserverPrice;
    }

    public void setReserverPrice(BigDecimal reserverPrice) {
        this.reserverPrice = reserverPrice;
    }

    public boolean isAuction() {
        return isAuction;
    }

    public void setAuction(boolean isAuction) {
        this.isAuction = isAuction;
    }

    public BigDecimal getBuyNowPrice() {
        return buyNowPrice;
    }

    public void setBuyNowPrice(BigDecimal buyNowPrice) {
        this.buyNowPrice = buyNowPrice;
    }

}
