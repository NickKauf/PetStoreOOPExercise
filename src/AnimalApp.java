import java.util.Scanner;
import java.util.ArrayList;

public class AnimalApp {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        ArrayList<Frog> frogInventory = new ArrayList<>();
        ArrayList<Bird> birdInventory = new ArrayList<>();
        ArrayList<Hamster> hamsterInventory = new ArrayList<>();
        String answer;
        String formName;
        String formType;
        String formDescription;
        Double formPrice;
        boolean formIsInStock;



        do {
            System.out.println("What is the pet's name?");
            formName = kb.nextLine();
            System.out.println("What is the pet's breed?");
            formType = kb.nextLine();
            System.out.println("Describe the pet: ");
            formDescription = kb.nextLine();
            System.out.println("What is the pet's price?");
            formPrice = kb.nextDouble();
            kb.nextLine();
            System.out.println("Is the pet in stock?(y/n)");
            answer = kb.nextLine();
            if (answer.equalsIgnoreCase("y")){
                formIsInStock = true;
            }
            else{
                formIsInStock = false;
            }

            System.out.printf("What type of pet is %s?\n1. frog\t2. bird\t3. hamster", formName);
            answer = kb.nextLine();
            if(answer.equals("1")){
                Frog frog = new Frog(formName,formType,formDescription,formPrice,formIsInStock);
                System.out.println("a frog was added to the shop");
                frogInventory.add(frog);
            }
            else if(answer.equals("2")){
                Bird bird = new Bird(formName,formType,formDescription,formPrice,formIsInStock);
                System.out.println("a bird was added to the shop");
                birdInventory.add(bird);
            }
            else if(answer.equals("3")){
                Hamster hamster = new Hamster(formName,formType,formDescription,formPrice,formIsInStock);
                System.out.println("a hamster was added to the shop");
                hamsterInventory.add(hamster);
            }
            else{
                System.out.println("Enter a menu item");
            }
            System.out.println("Do you want to add a new pet? y/n");
        }while(kb.nextLine().equalsIgnoreCase("y"));

        System.out.println("****PET INVENTORY****");
        System.out.println("===FROGS===:");
        for(Frog frog : frogInventory){
            System.out.println(frog.getPet()+"\n");
        }
        System.out.println("\n===BIRDS===:");
        for(Bird bird : birdInventory){
            System.out.println(bird.getPet()+"\n");
        }
        System.out.println("\n===HAMSTERS===:");
        for(Hamster hamster : hamsterInventory){
            System.out.println(hamster.getPet()+"\n");
        }








    }

}
