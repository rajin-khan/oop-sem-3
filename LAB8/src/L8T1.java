public class L8T1 {

    public static void main(String[] args) {

        PartTimeEmployee p1 = new PartTimeEmployee("Naruto", 17, "Japan", "Martial Arts", "Chief Fighter", 12, 7);

        System.out.println(p1.toString());

        FullTimeEmployee p2 = new FullTimeEmployee("Goku", 31, "America", "Cooking", "Chief Chef", 1500, 25);
        
        System.out.println(p2.toString());
    }
    
}
