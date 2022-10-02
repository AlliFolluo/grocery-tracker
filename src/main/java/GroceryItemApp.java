import java.sql.SQLOutput;
import java.util.Scanner;

public class GroceryItemApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GroceryItem grapes = new GroceryItem("Grapes", "Produce", 5, false);

        System.out.println("Welcome to GroceryTracker");
        System.out.println("Press 1 to see the details of your item");
        System.out.println("Press 2 to activate a sale on your item");
        System.out.println("Press 3 to exit");
        String userChoice = input.nextLine();

        while(!userChoice.equals("3")) {
            if(userChoice.equals("1")) {
                System.out.println(grapes);
            } else if (userChoice.equals("2")){
                System.out.println("Please enter the sale percentage as a decimal");
                double salePercentage = input.nextDouble();
                grapes.activateSale(salePercentage);
                input.nextLine();
            } else{
                System.out.println("Sorry invalid command");
            }
            System.out.println("Press 1 to see the details of your item");
            System.out.println("Press 2 to activate a sale on your item");
            System.out.println("Press 3 to exit");
            userChoice = input.nextLine();
        }
        System.out.println("Thanks for using GroceryTracker");
    }
}
