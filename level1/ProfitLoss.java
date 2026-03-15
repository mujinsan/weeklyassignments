import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        double costPrice = input.nextDouble();

        System.out.print("Enter Selling Price: ");
        double sellingPrice = input.nextDouble();

        double profitOrLoss = sellingPrice - costPrice;

        if (profitOrLoss > 0) {
            System.out.println("Profit: " + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("Loss: " + Math.abs(profitOrLoss));
        } else {
            System.out.println("No Profit, No Loss.");
        }
    }
}
