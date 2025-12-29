import java.util.Scanner;
public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double espressoPrice = 120.0;
        double lattePrice =150.0;
        double cappuccinoPrice =180.0;

        final double GST_RATE = 0.18;
        System.out.println("Welcome to Ravi's Coffee Cafe");
        System.out.println("Type 'exit' anytime to stop ordering.\n");
        while(true){
            System.out.println("Enter coffee type (espresso / latte / cappuccino):");
            String coffeeType = sc.next().toLowerCase();
            if (coffeeType.equals("exit")){
                System.out.println("Thank you for visiting. Come again!");
                break;
            }
            System.out.println("Enter quantity:");
            int quantity =sc.nextInt();
            double price =0;
            switch(coffeeType){
                case "espresso":
                    price = espressoPrice;
                    break;
                case "latte":
                    price = lattePrice;
                    break;
                case "cappuccino":
                    price =cappuccinoPrice;
                    break;
                default:
                    System.out.println("Invalid coffee type. Try again.\n");
                    continue;
            }

            // Calculate bill using operators
            double totalAmount =price * quantity;
            double gstAmount =totalAmount * GST_RATE;
            double finalBill =totalAmount + gstAmount;

            // Display bill
            System.out.println("\n------------- Bill Details -------------");
            System.out.println("Coffee Type     : "+ coffeeType);
            System.out.println("Quantity        : "+ quantity);
            System.out.println("Base Amount     : "+ totalAmount);
            System.out.println("GST (18%)       : "+ gstAmount);
            System.out.println("Total Payable   : "+ finalBill);
            System.out.println("----------------------------------------\n");
        }
        sc.close();
    }
}
