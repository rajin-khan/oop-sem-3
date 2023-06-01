public class ThresholdDiscount implements Discountable{

    private double threshold, discount;

    ThresholdDiscount(double threshold, double discount) {

        this.threshold = threshold;
        this.discount = discount;
    }

    public double getThreshold() {

        return threshold;
    }

    public double getDiscount() {

        return discount;
    }

    public void setThreshold(double threshold) {

        this.threshold = threshold;
    }

    public void setDiscount(double discount) {

        this.discount = discount;
    }

    public double discountedPrice(double price) {

        if (price>=threshold) {

            return price - ((double)(price*10)/100) - discount;
        }
        else {

            return price - discount;
        }
    }
    
}
