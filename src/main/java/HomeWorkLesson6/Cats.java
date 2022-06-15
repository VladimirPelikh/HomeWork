package HomeWorkLesson6;

public class Cats extends Animals {
    public Cats(String name, int run, int swim) {
        super(name, run, swim);
    }

    @Override
    public void doRun() {
        if (getRun() >= 0 && getRun() <= 200) {
            System.out.printf("%s пробежал %d метров%n", getName(), getRun());
        } else {
            System.out.printf("%s так далеко не бегает! Задай значение от 0 до 200м%n", getName());
        }
    }

    @Override
    public void doSwim() {
        System.out.printf("Коты не плавают! Не бросай %sа в воду!%n", getName());
    }

    @Override
    public void printInfo() {
        System.out.printf("%s умеет бегать на расстояние до 200 метров, но не умеет плавать совсем!%n", getName());
    }
}

