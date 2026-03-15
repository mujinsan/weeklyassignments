import java.util.Scanner;

public class AgeofHarry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Harry's birth year: ");
        int birthYear = input.nextInt();

        System.out.print("Enter the current year: ");
        int currentYear = input.nextInt();

        int age = currentYear - birthYear;

        System.out.println("Harry's age is: " + age);
    }
}
