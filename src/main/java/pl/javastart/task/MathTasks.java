package pl.javastart.task;

public class MathTasks {
    @SuppressWarnings({"checkstyle:WhitespaceAround", "checkstyle:NeedBraces", "checkstyle:RightCurly"})
    boolean isEven(int enterIntegerNumber) {
        return enterIntegerNumber % 2 == 0;
    }

    boolean isOdd(int enterIntegerNumber) {
        return enterIntegerNumber % 2 != 0;
    }

    double circleField(double enterRadius) {
        return Math.PI * Math.pow(enterRadius, 2);
    }

    int power(int enterIntegerNumber) {
        return (int) Math.pow(enterIntegerNumber, 2);
    }
}
