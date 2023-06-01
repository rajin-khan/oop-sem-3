import java.util.*;

public class L11T1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nThis program will give you the best price (from either percentage discount or treshold discount),\nbased on the price, percentage discount, treshold (and its base discount) that you enter.\n");

        System.out.print("Price: $");
        double price = sc.nextDouble();

        System.out.print("Percentage Discount : ");
        double percentage = sc.nextDouble();

        System.out.print("Treshold: ");
        double threshold = sc.nextDouble();

        System.out.print("Base Discount for Treshold Discount: ");
        double discount = sc.nextDouble();

        BestForCustomer b = new BestForCustomer(percentage, threshold, discount);
        ThresholdDiscount t = new ThresholdDiscount(threshold, discount);

        if (t.discountedPrice(price)==b.discountedPrice(price))
        {
            System.out.println("The best possible price is with the treshold discount, and it is: $" + b.discountedPrice(price));
            System.out.println();
        }
        else {

            System.out.println("The best possible price is with the percentage discount, and it is: $" + b.discountedPrice(price));
            System.out.println();
        }

        sc.close();

    }
}

