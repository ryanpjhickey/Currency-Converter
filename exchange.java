import java. util.Scanner;


public class exchange {

    public static void main(String[] args) {

        System.out.println("1: SouthKoreanWon");
        System.out.println("2: USD");
        System.out.println("3: Euros");
        System.out.println("4: Yuan");

        Scanner scr = new Scanner(System.in);

        System.out.println("Choose the currency");

        int choice = scr.nextInt();

        System.out.println("Enter the amount");
        
        double amount = scr.nextDouble();

        // convert the amount
        switch (choice) {
            case 1:
                SouthKoreanWon_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
            case 4:
                Yuan_to_other(amount);
            default:
                System.out.println("Invalid choice");
        }

    }

    public static void SouthKoreanWon_to_other(double amt) {
        //SKW to USD
        System.out.println("1 South Korean Won = " + 0.00080 + " USD");
        System.out.println();
        System.out.println(amt+" South Korean Won = " + (amt*0.00080) + " USD");
        System.out.println();
        

        //SKW to Euros
        System.out.println("1 South Korean Won = " + 0.00075 + " Euros");
        System.out.println();
        System.out.println(amt+" South Korean Won = " + (amt*0.00075) + " Euros");
        System.out.println();
        

        //SKW to Yuan
        System.out.println("1 South Korean Won = " + 0.0054 + " Yuan");
        System.out.println();
        System.out.println(amt+" South Korean Won = " + (amt*0.0054) + " Yuan");
        System.out.println();
    }
        

    public static void Dollar_to_other(double amt) {
        //USD to SKW
        System.out.println("1 USD = " + 1242.31 + " SouthKoreanWon");
        System.out.println();
        System.out.println(amt+" USD = " + (amt*1242.31) + " SouthKoreanWon");
        System.out.println();
        

        //USD to Euros
        System.out.println("1 USD= " + 0.93 + " Euros");
        System.out.println();
        System.out.println(amt+" USD = " + (amt*0.93) + " Euros");
        System.out.println();

        
        //USD to Yuan
        System.out.println("1 USD = " + 6.77 + " Yuan");
        System.out.println();
        System.out.println(amt+" USD = " + (amt*6.77) + " Yuan");
        System.out.println();
    }

        

    public static void Euro_to_other(double amt){
        //Euro to SKW
        System.out.println("1 Euro = " + 1336.53 + " SouthKoreanWon");
        System.out.println();
        System.out.println(amt+" Euro = " + (amt*1336.53) + " SouthKoreanWon");
        System.out.println();

        
        //Euro to USD
        System.out.println("1 Euro = " + 1.08 + " USD");
        System.out.println();
        System.out.println(amt+" Euro = " + (amt*1.08) + " USD");
        System.out.println();
        

        //Euro to Yuan
        System.out.println("1 Euro = " + 7.28 + " Yuan");
        System.out.println();
        System.out.println(amt+" Euro = " + (amt*7.28) + " Yuan");
        System.out.println();
    }

    public static void Yuan_to_other(double amt){
        //Yuan to SKW
        System.out.println("1 Yuan = " + 183.49 + " SouthKoreanWon");
        System.out.println();
        System.out.println(amt+" Yuan = " + (amt*183.49) + " SouthKoreanWon");
        System.out.println();
        

        //Yuan to USD
        System.out.println("1 Yuan = " + 0.15 + " USD");
        System.out.println();
        System.out.println(amt+" Yuan = " + (amt*0.15) + " USD");
        System.out.println();

        
        //Yuan to Euros
        System.out.println("1 Yuan = " + 0.14 + " Euros");
        System.out.println();
        System.out.println(amt+" Yuan = " + (amt*0.14) + " Euros");
        System.out.println();
    }
}