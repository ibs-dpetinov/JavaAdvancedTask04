import operations.Addition;
import operations.Division;
import operations.Multiplication;
import operations.Subtraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Enter operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        double result = 0;
        switch (operation) {
            case '+':
                result = new Addition().calculate(num1, num2);
                break;
            case '-':
                result = new Subtraction().calculate(num1, num2);
                break;
            case '*':
                result = new Multiplication().calculate(num1, num2);
                break;
            case '/':
                if (num2 != 0) {
                    result = new Division().calculate(num1, num2);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error! Invalid operation.");
                return;
        }

        System.out.println("Result: " + result);
    }
}