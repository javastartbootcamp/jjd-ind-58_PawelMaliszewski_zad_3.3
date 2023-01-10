package pl.javastart.task;

public class Main {
    
    public static void main(String[] args) {
        int evenOddNumber = 4;
        double circleRadius = 4.5;
        int toTheSecondPower = 8;

        MathTasks mathTasks = new MathTasks();
        boolean evenResult = mathTasks.isEven(evenOddNumber);
        boolean oddResult = mathTasks.isOdd(evenOddNumber);
        double circleField = mathTasks.circleField(circleRadius);
        int power = mathTasks.power(toTheSecondPower);

        System.out.println("Liczba: " + evenOddNumber + " jest parzysta: " + evenResult);
        System.out.println("Liczba: " + evenOddNumber + " jest nieparzysta: " + oddResult);
        System.out.printf("%s%.2f%s%.2f\n", "Jeżeli promień koła wynosi: ", circleRadius, " to pole kola = ", circleField);
        System.out.println("Liczba " + toTheSecondPower + " do potęgi 2 = " + power);

    }
}
