package level_2;

public class Calculator {
    public static float operate(final float a, final float b, MathOperation operation) {
        return operation.operate(a, b);
    }
}
