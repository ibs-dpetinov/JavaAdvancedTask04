import calculator.Calculator;
import calculator.Fraction;

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
        Fraction firstFraction = new Fraction(num1, num2);
        Fraction secondFraction = new Fraction(num3, num4);
        Calculator calculator = new Calculator(firstFraction, secondFraction, operation);
        System.out.print(calculator.getOperationDescription());
    }
}