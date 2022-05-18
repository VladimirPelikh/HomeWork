package HomeWorkLesson2;


public class HomeWorkApp2 {

    public static void main(String[] args) {

        summChek(5, 10);
        positiveOrNegativeNumber(-5);
        booleanChek(1);
        printLine("Напечатай меня", 3);
        leapYear();

    }

    private static boolean summChek(int a, int b) {
        int result = a + b;
        if (result > 10 && result <= 20) {
            System.out.println("Сумма чисел находится в пределах от 10 до 20 и равняется = " + result);
            return true;
        } else {
            System.out.println("Сумма чисел находится ВНЕ пределах от 10 до 20 и равняется = " + result);
            return false;
        }
    }

    private static int positiveOrNegativeNumber(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
            return a;
        } else {
            System.out.println("Число отрицательное");
            return a;
        }
    }

    private static boolean booleanChek(int a) {
        if (a < 0) {
            System.out.println("Заданное число отрицательное");
            return false;
        } else {
            System.out.println("Заданное число положительное");
            return true;
        }
    }

    private static void printLine(String print, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(print);
        }
    }

    private static boolean leapYear() {
        int year = 300;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Год " + year + " высокосный");
            return true;
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("Год " + year + " невысокосный");
            return false;
        } else if (year % 400 == 0) {
            System.out.println("Год " + year + " высокосный");
            return true;
        } else {
            System.out.println("Год " + year + " невысокосный");
        }
        return false;
    }
}