package HomeWorkLesson6;

public class Main {
    public static void main(String[] args) {
        Cats cats = new Cats("Барсик", 190, 0);
        Dogs dogs = new Dogs("Бобик", 400, 9);
        Cats cats1 = new Cats("Мурчик", 550, 10);
        Dogs dogs1 = new Dogs("Шарик", 600, 18);

        cats.printInfo();
        dogs.printInfo();

        cats.doRun();
        cats.doSwim();

        dogs.doRun();
        dogs.doSwim();

        cats1.doRun();
        cats1.doSwim();

        dogs1.doRun();
        dogs1.doSwim();

    }
}
