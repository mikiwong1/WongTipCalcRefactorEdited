import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main(String[] args) {

        // introduces Scanner and DecimalFormat
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        // asks questions for the user to input answers
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int numOfPeople = scan.nextInt();
        System.out.print("What's the tip percentage (0 - 100): ");
        int tipPercentage = scan.nextInt();

        TipCalculator calculate = new TipCalculator(numOfPeople, tipPercentage);

        // declares price and bill variable
        double price = 0;
        double totalBill = 0;

        // adds all the prices inputted together
        while (price != -1.0) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            price = scan.nextDouble();
            if (price != -1){
                calculate.addMeal(price);
            }
        }

        // prints out all the information
        System.out.println("------------------------------");
        System.out.println("Total Bill Before Tip: " + formatter.format(calculate.getTotalBillBeforeTip()));
        System.out.println("Tip Percentage: " + formatter.format(calculate.getTipPercentage()));
        System.out.println("Total Tip: " + formatter.format(calculate.tipAmount()));
        System.out.println("Total Bill With Tip: " + formatter.format(calculate.totalBill()));
        System.out.println("Per Person Cost Before Tip: " + formatter.format(calculate.perPersonCostBeforeTip()));
        System.out.println("Tip Per Person: " + formatter.format(calculate.perPersonTipAmount()));
        System.out.println("Total Cost Per Person: " + formatter.format(calculate.perPersonTotalCost()));



    }

}
