package calculator;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {}

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
//        try {
//            Properties properties = new Properties();
//            InputStream resourceAsStream =  Calculator.class.getClassLoader().getResourceAsStream("log4j.properties");
//            if (resourceAsStream != null) {
//                properties.load(resourceAsStream);
//            }
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        BasicConfigurator.configure();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Scientific calculator.Calculator using DevOps. \n Choose operation:");
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
                    logger.info("INPUT: Calculating factorial of " + number1);
                    System.out.println("Factorial of "+number1+" is : " + calculator.factorial(number1));
                    logger.info("OUTPUT: Result of factorial calculation: " + calculator.factorial(number1));
                    System.out.println("\n");
                    break;
                case 2:
                    // Square root
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    logger.info("INPUT: Calculating square root of " + number1);
                    System.out.println("Square root of "+number1+" is : " + calculator.squareRoot(number1));
                    logger.info("OUTPUT: Result of square root calculation: " + calculator.squareRoot(number1));
                    System.out.println("\n");
                    break;
                case 3:
                    // Power
                    System.out.print("Enter the base number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the exponent : ");
                    number2 = scanner.nextDouble();
                    logger.info("INPUT: Calculating " + number1 + " raised to the power of " + number2);
                    System.out.println(number1+ " raised to power "+number2+" is : " + calculator.power(number1, number2));
                    logger.info("OUTPUT: Result of power calculation: " + calculator.power(number1, number2));
                    System.out.println("\n");
                    break;
                case 4:
                    // Natural log
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    logger.info("INPUT: Calculating natural log of " + number1);
                    System.out.println("Natural log of "+number1+" is : " + calculator.naturalLog(number1));
                    logger.info("OUTPUT: Result of natural log calculation: " + calculator.naturalLog(number1));
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }

    public int factorial(double number1) {
        int result = fact(number1);
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

    public int fact(double num) {
        int facto = 1;
        for(int i = 1; i <= num; i++) {
            facto *= i;
        }
        return facto;
    }
}





