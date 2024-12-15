package operations;

public class Subtraction extends AbstractOperation {
    @Override
    public double calculate(int num1, int num2, int num3, int num4) {
        return (double) (num1 * num4 - num2 * num3) / (num2 * num4);
    }
}