package HomeWork;

public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        int a = 30;
        int b = -1992;
        int result = a + b;
        System.out.println("Сумма отрицательная = " + result);
    }

    private static void printColor() {
        int value = 150;
        if (value <= 0) {
            System.out.println("value = " + value + ", значит цвет - Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("value = " + value + ", значит цвет - Желтый");
        } else {
            System.out.println("value = " + value + ", значит цвет - Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = 5000;
        int b = 2315;
        if (a >= b) {
            System.out.println(a + " >= " + b);
        } else {
            System.out.println(a + " < " + b);
        }
    }
}
