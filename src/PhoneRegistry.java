import java.util.HashMap;
import java.util.Scanner;

public class PhoneRegistry {
    /* A somewhat unnecessary class, so far. Why not use the hashmap directly? Because
    I need to practice!
     */
    private HashMap<String, String> personPhoneNumber;
    Scanner userInput = new Scanner(System.in);

    public PhoneRegistry() {
        this.personPhoneNumber = new HashMap<>();
    }

    public void addEntry() {
        String name;
        String number;

        System.out.println("Enter name:");
        name = userInput.nextLine();
        System.out.println("Enter phone number:");
        number = userInput.nextLine();

        personPhoneNumber.put(name, number);
    }

    public void getPhoneNumber() {

        System.out.println("Enter name:");
        String name = userInput.nextLine();

        String number = personPhoneNumber.get(name);

        if(number == null) {
            System.out.println("No such entry!");
        }
        else {
            System.out.println(number);
        }
    }

    public void menu() {
        boolean exit = false;


        do {
            System.out.println("""
                    1. Get phone number
                    2. Add a new entry
                    3. Exit
                    """);


            int selection = userInput.nextInt();
            userInput.nextLine();
            switch(selection) {
                case 1 -> getPhoneNumber();
                case 2 -> addEntry();
                case 3 -> exit = true;
                default -> System.out.println("Please enter an integer between 1 and 3.");
            }
        } while(!exit);


    }

}
