package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {}

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Scientific Calculator using DevOps. \n Choose operation:");
            System.out.print("1. Factorial\n2. Square root\n3. Power\n4. Natural Logarithm\n" +
                    "5. Exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                logger.error("Invalid input: " + error.getMessage());
                return;
            }

            switch (choice) {
                case 1:
                    // Factorial
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    logger.info("Calculating factorial of " + number1);
                    System.out.println("Factorial of "+number1+" is : " + calculator.factorial(number1));
                    logger.info("Result of factorial calculation: " + calculator.factorial(number1));
                    System.out.println("\n");
                    break;
                case 2:
                    // Square root
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    logger.info("Calculating square root of " + number1);
                    System.out.println("Square root of "+number1+" is : " + calculator.squareRoot(number1));
                    logger.info("Result of square root calculation: " + calculator.squareRoot(number1));
                    System.out.println("\n");
                    break;
                case 3:
                    // Power
                    System.out.print("Enter the base number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the exponent : ");
                    number2 = scanner.nextDouble();
                    logger.info("Calculating " + number1 + " raised to the power of " + number2);
                    System.out.println(number1+ " raised to power "+number2+" is : " + calculator.power(number1, number2));
                    logger.info("Result of power calculation: " + calculator.power(number1, number2));
                    System.out.println("\n");
                    break;
                case 4:
                    // Natural log
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    logger.info("Calculating natural log of " + number1);
                    System.out.println("Natural log of "+number1+" is : " + calculator.naturalLog(number1));
                    logger.info("Result of natural log calculation: " + calculator.naturalLog(number1));
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }

    public double factorial(double number1) {
        double result = fact(number1);
        return result;
    }

    public double squareRoot(double number1) {
        double result = Math.sqrt(number1);
        return result;
    }

    public double power(double number1, double number2) {
        double result = Math.pow(number1, number2);
        return result;
    }

    public double naturalLog(double number1) {
        double result = Math.log(number1);
        return result;
    }

    public double fact(double num) {
        double facto = 1;
        for(int i = 1; i <= num; i++) {
            facto *= i;
        }
        return facto;
    }
}





