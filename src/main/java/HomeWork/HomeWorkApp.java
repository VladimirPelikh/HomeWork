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
        int a = 5;
        int b = 10;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная = " + result);
        }else {
            System.out.println("Сумма отрицательная = " + result);
        }
    }

    private static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("value = " + value + ", значит цвет - Красный");
        }else if (value > 0 && value <= 100) {
            System.out.println("value = " + value + ", значит цвет - Желтый");
        }else {
            System.out.println("value = " + value + ", значит цвет - Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = 110;
        int b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }
}
