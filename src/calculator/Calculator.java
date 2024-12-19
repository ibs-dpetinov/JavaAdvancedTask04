package calculator;

public class Calculator {
    private final Fraction firstFraction;
    private final Fraction secondFraction;
    private final char operation;
    private double operationResult;
    private String operationDescription;

    public Calculator(Fraction firstFraction, Fraction secondFraction, char operation) {
        this.firstFraction = firstFraction;
        this.secondFraction = secondFraction;
        this.operation = operation;
        calculate();
    }

    public Fraction getFirstFraction() {
        return firstFraction;
    }

    public Fraction getSecondFraction() {
        return secondFraction;
    }

    public char getOperation() {
        return operation;
    }
    public void calculate() {
        switch (operation) {
            case '+':
                operationResult = firstFraction.add(secondFraction).toDouble();
                break;
            case '-':
                operationResult = firstFraction.subtract(secondFraction).toDouble();
                break;
            case '*':
                operationResult = firstFraction.multiply(secondFraction).toDouble();
                break;
            case '/':
                operationResult = firstFraction.divide(secondFraction).toDouble();
                break;
            default:
                operationDescription = "Invalid operation! Cannot calculate.";
        }
        if (operationDescription == null) {
            operationDescription = String.format("%s %s %s = %.4f", firstFraction, operation, secondFraction, operationResult);
        }
    }

    public double getOperationResult() {
        return operationResult;
    }

    public String getOperationDescription() {
        return operationDescription;
    }
}
