import operations.Addition;
import operations.Division;
import operations.Multiplication;
import operations.Subtraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number numerator:");
        int num1 = scanner.nextInt();
        System.out.println("Enter first number denominator:");
        int num2 = scanner.nextInt();
        System.out.println("Enter second number numerator:");
        int num3 = scanner.nextInt();
        System.out.println("Enter second number denominator:");
        int num4 = scanner.nextInt();
        System.out.println("Enter operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        double result;
        if (num2 != 0) {
            switch (operation) {
                case '+':
                    if (num4 != 0) {
                        result = new Addition().calculate(num1, num2, num3, num4);
                        System.out.printf("%d/%d + %d/%d = %.4f", num1, num2, num3, num4, result);
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                    }
                    break;
                case '-':
                    if (num4 != 0) {
                        result = new Subtraction().calculate(num1, num2, num3, num4);
                        System.out.printf("%d/%d - %d/%d = %.4f", num1, num2, num3, num4, result);
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                    }
                    break;
                case '*':
                    if (num4 != 0) {
                        result = new Multiplication().calculate(num1, num2, num3, num4);
                        System.out.printf("(%d/%d) * (%d/%d) = %.4f", num1, num2, num3, num4, result);
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                    }
                    break;
                case '/':
                    if (num3 != 0) {
                        result = new Division().calculate(num1, num2, num3, num4);
                        System.out.printf("(%d/%d) / (%d/%d) = %.4f", num1, num2, num3, num4, result);
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error! Invalid operation.");
            }
        } else {
            System.out.println("Error! Division by zero is not allowed.");
        }
    }
}