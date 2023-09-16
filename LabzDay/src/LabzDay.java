import java.util.*;

public class LabzDay {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            String[] dumbasses = {"Aritha", "Zayana", "Faiaz", "Avirup", "Faiyaz", "Zaima", "Jahin", "Awsaf", "Talha", "Mursalin", "Nawal", "Aronee", "Maisoon", "Shaswata", "Zuzu"};

            System.out.println("\nHAPPY BIRTHDAY NOSHU!");
            System.out.println("\nAs your smartass may already have predicted, your wishes have been stored in this program!");
            System.out.println("Now don't hate me, but it wouldn't really be any fun if the wishes just landed in front of you, would it?");
            System.out.println("So, let's play a game.");

            System.out.println();

            System.out.println("(UNLOCK DIFFICULTY: HARD)");

            for (int i=0; i<=4; i++) {
                    
                System.out.println(dumbasses[i]+" ");
            }

            System.out.println("\n(UNLOCK DIFFICULTY: MEDIUM)");

            for (int i=5; i<=9; i++) {
                    
                System.out.println(dumbasses[i]+" ");
            }

            System.out.println("\n(UNLOCK DIFFICULTY: EASY)");

                for (int i=10; i<=14; i++) {
                    
                    System.out.println(dumbasses[i]+" ");
                }

            System.out.println();

            System.out.println("Above are your wishes, locked in their difficulty prison.");
            System.out.println("The rules are simple: \n");

            System.out.println("~ Select a difficulty. ");
            System.out.println("~ Answer a question. ");
            System.out.println("~ And unlock your wishes!!! ");
            System.out.print("\nBEST OF LUCK! <3\n");

            for (int j=0; j<3; j++) {

                System.out.println("_______________________________________\n");

                System.out.print("Select your difficulty: ");
                String choice = sc.next();

                if (choice.equalsIgnoreCase("hard")) {

                    System.out.print("\nQUESTION:");
                    System.out.println(" Who's the prettiest girl in the world? (Just the first name)");
                    System.out.print("\nANSWER: ");
                    String answer = sc.next();
                    
                    if (answer.equalsIgnoreCase("labz") || answer.equalsIgnoreCase("labbaiqua") || answer.equalsIgnoreCase("lebu") || answer.equalsIgnoreCase("me") || answer.equalsIgnoreCase("myself") || answer.equalsIgnoreCase("labs")) {

                        System.out.println("_______________________________________\n");

                        System.out.println("Congratulations!!! You've unlocked the hard wishes! <3");

                        System.out.println("\nUNLOCKED: ");

                        while (true) {

                            System.out.println();

                            for (int i=0; i<=4; i++) {
                        
                                System.out.println(dumbasses[i]+" ");
                            }

                            System.out.print("\nGo ahead and enter one of their names: ");
                            String name = sc.next();

                            for (int i=0; i<5; i++) {

                                if (dumbasses[i].contains(name) || dumbasses[i].toLowerCase().contains(name) || dumbasses[i].toUpperCase().contains(name)) {

                                    if (i==0) {

                                        System.out.println("\nAritha has sent you a video! Copy and paste this link in your browser to see it: \nhttps://drive.google.com/file/d/1gtYsznAmi6dK2pUgU-Ros3CCoI9bLuoZ/view?usp=sharing\n");
                                        dumbasses[i] = "Aritha (Viewed)";
                                        break;
                                    }
                                    else if (i==1) {
                    
                                        System.out.println("\nZayana has sent you a video! Copy and paste this link in your browser to see it: \nhttps://drive.google.com/file/d/1CgZtosfkD6AnlRqEPb99tjXijq2dEnWi/view?usp=sharing\n(Zayana: \"P.S: Video er ending ta ektu abrupt but PLEASE TEXT ME WILL TELL YOU EVERYTHING<3\")\n");
                                        dumbasses[i] = "Zayana (Viewed)";
                                        break;
                                    }
                                    else if (i==2) {
                            
                                        System.out.println("\nFaiaz has sent you a video! Copy and paste this link in your browser to see it: \nhttps://drive.google.com/file/d/1Cldx2tuWmVSKdClHH_sqdWVymoSjRy25/view?usp=sharing\n");
                                        dumbasses[i] = "Faiaz (Viewed)";
                                        break;
                                    }
                                    else if (i==3) {
                        
                                        System.out.println("\nAvirup has sent you a video! Copy and paste this link in your browser to see it: \nhttps://drive.google.com/file/d/1Jgw5ZblJWW3yJdC3hSdTIbpjOoI1RR3O/view?usp=sharing\n");
                                        dumbasses[i] = "Avirup (Viewed)";
                                        break;
                                    }
                                    else if (i==4) {
                        
                                        System.out.println("\nFaiyaz has sent you a video! Copy and paste this link in your browser to see it:\nhttps://drive.google.com/file/d/193XUXM7zlBTXsy3vXSWw4eKPa-299lgz/view?usp=sharing\n");
                                        dumbasses[i] = "Faiyaz (Viewed)";
                                        break;
                                    }
                                }
                            }
                            System.out.print("Onto more wishes! Enter anything to continue! (or \"stobit\" when you're done):  ");
                            String c = sc.next();

                            if (c.equalsIgnoreCase("ok")) {

                                System.out.println("_______________________________________\n");
                                
                                System.out.println("\t\tYou know I love you.");

                                System.out.println("_______________________________________");

                            }
                            else if (c.equalsIgnoreCase("stobit")) {

                                if (j==2) {

                                    System.out.println();
                                }
                                else {

                                    System.out.println("\nOnto the next challenge!");
                                }   
                                break;
                            }
                        }
                    }
                    else {

                        System.out.println("\nTry again. (psst, it's you dumbass!)");
                    }
                }  
                else if (choice.equalsIgnoreCase("medium")) {

                    System.out.print("\nQUESTION:");
                    System.out.println(" Who's the cutest girl in the world? (Just the first name)");
                    System.out.print("\nANSWER: ");
                    String answer = sc.next();

                    if (answer.equalsIgnoreCase("labz") || answer.equalsIgnoreCase("labbaiqua") || answer.equalsIgnoreCase("lebu") || answer.equalsIgnoreCase("me") || answer.equalsIgnoreCase("myself") || answer.equalsIgnoreCase("labs")) {

                        System.out.println("_______________________________________\n");

                        System.out.println("Congratulations!!! You've unlocked the medium wishes! <3");

                        System.out.println("\nUNLOCKED: ");

                        while (true) {

                            System.out.println();

                            for (int i=5; i<=9; i++) {
                        
                                System.out.println(dumbasses[i]+" ");
                            }

                            System.out.print("\nGo ahead and enter one of their names: ");
                            String name = sc.next();

                            for (int i=5; i<=9; i++) {

                                if (dumbasses[i].contains(name) || dumbasses[i].toLowerCase().contains(name) || dumbasses[i].toUpperCase().contains(name)) {

                                    if (i==5) {

                                        System.out.println("\nZaima: \"Happiest Birthday to my one and only bof. Thank you amake always jhari dewar jonno before I do sth stupid and always being there for me 🥰. I really miss doing classes w you at brac and missing having cokes as our breakfast. School thekei ashole bestie howa uchit chilo but better late than never. Will come to your house tomorrow tokhon khaway amar 1 kg barais  xD\"\n \"Lovu soo much and happy birthday againn❤️ Will gift you fish and chips.\"\n");
                                        dumbasses[i] = "Zaima (Read)";
                                        break;
                                    }
                                    else if (i==6) {
                    
                                        System.out.println("\nJahin has sent you a video! Copy and paste this link in your browser to see it: \nhttps://drive.google.com/file/d/1UVKePXKwMt1ov8DGuyfVUjyBtzQjngzV/view?usp=sharing\n");
                                        dumbasses[i] = "Jahin (Viewed)";
                                        break;
                                    }
                                    else if (i==7) {
                            
                                        System.out.println("\nAwsaf: \"Happy Birthday labibaa❤️. Missing the 8 am random convos in brac. Hope you have an amazing day and praying u dont fall break something again 🤞\"\n");
                                        dumbasses[i] = "Awsaf (Read)";
                                        break;
                                    }
                                    else if (i==8) {
                        
                                        System.out.println("\nTalha: \"Happy birthday khalamma. I don't know where to start but thank you for the all the effort you've put behind me and I don't think there's any way that I'd be able to pay you back for all those things you've done for me. I always appreciate how you're always ready to help me with the tiniest of things. I hope you know how much you mean to us. I've annoyed you a lot by being irresponsible in the past 2 years but you still keep trying bring me back on the track. Ar kisu mathay ashtese na. Onek bolsi ebar treat dao. I love you khalamma 🥺🥰🥰\"\n");
                                        dumbasses[i] = "Talha (Read)";
                                        break;
                                    }
                                    else if (i==9) {
                        
                                        System.out.println("\nMursalin has sent you a video! Copy and paste this link in your browser to see it: \nhttps://drive.google.com/file/d/14fgaoSCpa7MFpu4MJJL5Gmn-cljMV72U/view?usp=sharing\n");
                                        dumbasses[i] = "Mursalin (Viewed)";
                                        break;
                                    }
                                }
                            }
                            System.out.print("Onto more wishes! Enter anything to continue! (or \"stobit\" when you're done):  ");
                            String c = sc.next();

                            if (c.equalsIgnoreCase("ok")) {

                                System.out.println("_______________________________________\n");
                                
                                System.out.println("\t\tYou know I love you.");

                                System.out.println("_______________________________________");

                            }
                            else if (c.equalsIgnoreCase("stobit")) {

                                if (j==2) {

                                    System.out.println();
                                }
                                else {

                                    System.out.println("\nOnto the next challenge!");
                                }
                                break;
                            }
                        }
                    }
                    else {

                        System.out.println("\nTry again. (psst, it's you dumbass!)");
                    }
                }
                else if (choice.equalsIgnoreCase("easy")) {

                    System.out.print("\nQUESTION:");
                    System.out.println(" Who's the hottest girl in the world? (Just the first name)");
                    System.out.print("\nANSWER: ");
                    String answer = sc.next();

                    if (answer.equalsIgnoreCase("labz") || answer.equalsIgnoreCase("labbaiqua") || answer.equalsIgnoreCase("lebu") || answer.equalsIgnoreCase("me") || answer.equalsIgnoreCase("myself") || answer.equalsIgnoreCase("labs")) {

                        System.out.println("_______________________________________\n");

                        System.out.println("Congratulations!!! You've unlocked the easy wishes! <3");

                        System.out.println("\nUNLOCKED: ");

                        while (true) {

                            System.out.println();

                            for (int i=10; i<=14; i++) {
                                
                                System.out.println(dumbasses[i]+" ");
                            }

                            System.out.print("\nGo ahead and enter one of their names: ");
                            String name = sc.next();

                            for (int i=10; i<=14; i++) {
                                
                                if (dumbasses[i].contains(name) || dumbasses[i].toLowerCase().contains(name) || dumbasses[i].toUpperCase().contains(name)) {

                                    if (i==10) {

                                        System.out.println("\nNawal: \"Happy Birthday Lebu, love you a lot can't wait to attend the nsu convocation with you! 🥳🥳🥳\"\n");
                                        dumbasses[i] = "Nawal (Read)";
                                        break;
                                    }
                                    else if (i==11) {
                    
                                        System.out.println("\nAronee: \"Happy Birthday lebu. Can't thank you enough for always being there for us. I love youuu ❤️\"\n");
                                        dumbasses[i] = "Aronee (Read)";
                                        break;
                                    }
                                    else if (i==12) {
                            
                                        System.out.println("\nMaisoon has sent you a video! Copy and paste this link in your browser to see it: \nhttps://drive.google.com/file/d/14fCMM1cbiA0UFLUs_XzMguqBLNe_Yol6/view?usp=sharing\n");
                                        dumbasses[i] = "Maisoon (Viewed)";
                                        break;
                                    }
                                    else if (i==13) {
                        
                                        System.out.println("\nShaswata: \"Happy Birthday Shamputki. Miss you very much and joldi arekta biye organize kor. Love you, and stay violent.\"\n");
                                        dumbasses[i] = "Shaswata (Read)";
                                        break;
                                    }
                                    else if (i==14) {
                        
                                        System.out.println("\nZuzu: \"Happy birthday Labbibubibu, Hope you have an amazing day ar when you give adoption papers for me to sign?? I\'m waiting with a cup on my hands, waiting mother labz. Testy ke salam janiyo. Ei paragraph ekdom ee rushed na ar ekdom ee last moment e ditesi na trust me, preety sure rajjin deri korse, ami kisu jani na bhai. Please don\'t throw me out.\nAnyways bhalo thakish bondhu and good luck with nsu psyco.\"\nLove tere pyaare lal bacha Zuzu\n");
                                        dumbasses[i] = "Zuzu (Read)";
                                        break;
                                    }
                                }
                            }
                            System.out.print("Onto more wishes! Enter anything to continue! (or \"stobit\" when you're done):  ");
                            String c = sc.next();

                            if (c.equalsIgnoreCase("ok")) {
                                
                                System.out.println("_______________________________________\n");
                                
                                System.out.println("\t\tYou know I love you.");

                                System.out.println("_______________________________________");

                            }
                            else if (c.equalsIgnoreCase("stobit")) {

                                if (j==2) {

                                    System.out.println();
                                }
                                else {

                                    System.out.println("\nOnto the next challenge!");
                                }
                                break;
                            }
                        }
                    }
                    else {

                        System.out.println("\nTry again. (psst, it's you dumbass!)");
                    }
                }
                else {

                    System.out.println("\nI couldn't code in what'd happen for a wrong input, but mwah ilovu.");
                    j--;
                }
            }
        }

        System.out.println("_______________________________________\n");

        System.out.println("CONGRATULATIONS!!!<333");
        System.out.println("You've unlocked all your wishes!");
        System.out.println("Now, what are you waiting for? Get back to opening your gifts!!! <3\n");
            
    }
}