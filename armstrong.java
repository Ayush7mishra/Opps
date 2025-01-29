package opps;
import java.util.Scanner;

public class armstrong {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number to check if it is an Armstrong number:");
            int number = scanner.nextInt();

            int originalNumber = number;
            int result = 0;
            int numberOfDigits = String.valueOf(number).length();

            while (number != 0) {
                int remainder = number % 10;
                result += Math.pow(remainder, numberOfDigits);
                number /= 10;
            }
            if (result == originalNumber) {
                System.out.println(originalNumber + " is an Armstrong number.");
            } else {
                System.out.println(originalNumber + " is not an Armstrong number.");
            }

            scanner.close();
        }
    }


