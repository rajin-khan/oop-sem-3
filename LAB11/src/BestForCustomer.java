public class BestForCustomer implements Discountable{

    private double percentage, threshold, discount;

    BestForCustomer(double percentage, double threshold, double discount) {

        this.percentage = percentage;
        this.threshold = threshold;
        this.discount = discount;
    }

    public double discountedPrice(double price) {

        PercentageDiscount p = new PercentageDiscount(percentage);
        ThresholdDiscount t = new ThresholdDiscount(threshold, discount);

        if (t.discountedPrice(price)<=p.discountedPrice(price)) {

            return t.discountedPrice(price);
        }
        else {

            return p.discountedPrice(price);
        }
    }

}