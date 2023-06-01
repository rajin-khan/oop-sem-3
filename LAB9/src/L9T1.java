import java.util.*;

public class L9T1 {

    static int count = 0, size = 10;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Plant[] plants = new Plant[size];

        System.out.println("\nPlease choose from the following options: ");

        while (true) {

            System.out.println("\n1. Add (a plant to the list)");
            System.out.println("2. Remove (a plant from the list)");
            System.out.println("3. Search (for a plant in the list)");
            System.out.println("4. Display (all plants in the list)");
            System.out.println("5: Exit");

            System.out.print("\nEnter a number to choose: ");
            int choice = sc.nextInt();

            sc.nextLine();

            System.out.println();

            if (choice == 1) {

                System.out.print("Enter the name of the plant to be added: ");
                String addname = sc.nextLine();
    
                System.out.print("Enter the color of the plant to be added: ");
                String addcolor = sc.nextLine();
    
                Plant p1 = new Plant(addname, addcolor);
    
                add(plants, p1);
            }
            else if (choice == 2) {
    
                System.out.print("Enter the name of the plant to be removed: ");
                String remname = sc.nextLine();
    
                remove(plants, remname);
            }
            else if (choice == 3) {
    
                System.out.print("Enter the name of the plant you want to search for: ");
                String skey = sc.nextLine();

                System.out.println(search(plants, skey).toString());
            }
            else if (choice == 4) {
    
                display(plants);
            }
            else if (choice == 5) {

                break;
            }
        }

        sc.close();
        
    }

    public static void add(Plant[] plants, Plant p) {

        if (count>=size) {

            System.out.print("You can only store "+size+" plants!");
            return;
        }
        else {

            plants[count] = p;
            count++;
            System.out.println("\nPlant added!");
        }
    }

    public static void remove(Plant[] plants, String n) {

        boolean found = false;

        for (int i=0; i<count; i++) {

            if ( n.equalsIgnoreCase(plants[i].getName()) ) {

                found = true;

                for (int j=i; j<size-1; j++) {

                    plants[j] = plants[j+1];
                }
                plants[size-1] = null;
                count--;

                System.out.println("\nPlant removed!");
            }
            else {

                continue;
            }
        }

        if (found == false) {

            System.out.println("Your entered name doesn't match any plants on the list!");
        }
    }
    
    public static Plant search(Plant[] plants, String n) {

        boolean found = false;

        Plant plant = new Plant();

        for (int i=0; i<count; i++) {

            if (n.equalsIgnoreCase(plants[i].getName())) {

                found = true;
                plant = plants[i];
            }
            else {

                continue;
            }
        }

        if (found==true) {
                
            System.out.println("\nPlant found!");
            return plant;
        }
        else {

            System.out.println("Your entered name didn't match any plants on the list!");
            return plant;
        }
        
    }

    public static void display(Plant[] plants) {

        for (int i=0; i<count; i++) {

            System.out.println((i+1) + ") " + plants[i].toString());
        }
    }

}
