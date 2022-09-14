import java.util.Scanner;

public class sysOutWorking {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for name
        System.out.print("Enter your name: ");

        // Save Persons name from input
        String name = sc.nextLine();

        // Welcome message with persons name
        System.out.println("Welcome, "+ name);

        // Start user shopping cart explaination

        // Declare double cart total
        double total = 0;
        
        // Save/grab users input (1-4)
        int selection = 0;

        //Describe users options

        System.out.println("blah");

        // Allow user to increase cart total based on option


        while (selection != 4)
        {
            
            //selection variable save
            selection = sc.nextInt();
            if (selection == 1)
            {
                total += 1.99;
                System.out.println("total = " + total);
                continue;
            }
            else if (selection == 2)
            {
                total += 6.99;
                System.out.println("total = " + total);
                continue;
            }
            else if (selection == 3)
            {
                total += 12.99;
                System.out.println("total = " + total);
                continue;
            }
            // Allow user to exit with checkout option
            else if (selection == 4)
            {
                System.out.println("final total = " + total);
                break;
            }
            else {
                System.out.println("not valid");
                continue;
            }

        // Catch if user entered value that isn't an option.

        // Tell user their current total
    }
}
}