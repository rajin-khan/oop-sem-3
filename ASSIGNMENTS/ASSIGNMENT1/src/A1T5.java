public class A1T5 {

    public static void main(String[] args) {

        System.out.println("\nAll the Armstrong numbers between 1 and 999 are: ");

        System.out.println();
        
        for (int i=1; i<=999; i++) {

            int lastdig = i%10; //for a single digit, it reads it as, e.g, 001
            int middig = (i/10)%10; //for a double digit, it reads it as e.g, 029
            int firstdig = (i/10)/10; //for a triple digit, it reads it as it is

        if (i == Math.pow(firstdig, 3) + Math.pow(middig, 3) + Math.pow(lastdig, 3)) {

                System.out.print(i + " ");
            }
        }

        System.out.println("\n");
    }
    
}
