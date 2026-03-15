import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n (number of terms): ");
        int n = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
}
