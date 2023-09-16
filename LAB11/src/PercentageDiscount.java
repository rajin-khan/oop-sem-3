public class PercentageDiscount implements Discountable {

    private double percentage;

    PercentageDiscount(double percentage) {

        this.percentage = percentage;
    }

    public double getPercentage() {

        return percentage;
    }

    public void setPercentage(double percentage) {

        this.percentage = percentage;
    }

    public double discountedPrice(double price) {

        return price - ((price*percentage)/100);
    }

}