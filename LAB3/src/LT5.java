public class LT5 {

    public static void main(String[] args) {

        int randNum1 = (int)(1/*min*/ + Math.random() * (/*max*/1000-1/*min*/ + 1));
        int randNum2 = (int)(1/*min*/ + Math.random() * (/*max*/1000-1/*min*/ + 1));

        int upper = Math.max(randNum1, randNum2);
        int lower = Math.min(randNum1, randNum2);

        System.out.println("\nUpper: " + upper + "\tLower: "+lower);
        System.out.println();

        int i = upper;

        while (i>=lower) {

            if (i%5==0||i%8==0) {

                System.out.print(i + " ");
            }
            i--;
        }

    }
    
}
