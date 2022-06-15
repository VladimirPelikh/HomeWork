package HomeWorkLesson7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    private String name;
    int maxAppetite; //сытость кота
    int appetite; // текущее состояние аппетита

    public Cat(String name, int maxAppetite) {
        this.name = name;
        this.maxAppetite = maxAppetite;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        int appetite = ThreadLocalRandom.current().nextInt(4) + 3;
        int deficitAppetite = maxAppetite - appetite;
        while (appetite <= maxAppetite) {
            if (appetite < maxAppetite) {
                plate.decreaseFood(appetite);
                System.out.println("Котик " + name + " съел " + appetite + " корма, но не наелся! Он хочет еще доесть " + deficitAppetite + " корма");
                plate.decreaseFood(deficitAppetite);
                System.out.println("Котик " + name + " доел " + deficitAppetite + " корма, и наконец-то полностью сыт!");
            } else if (appetite == maxAppetite) {
                plate.decreaseFood(appetite);
                System.out.println("Котик " + name + " съел " + maxAppetite + " корма и полностью сыт");
            }
            break;
        }
        if (appetite > maxAppetite) {
            System.out.printf("Кот %s сыт, к миске подходить ему еще не время%n", name);
        }
    }
}

