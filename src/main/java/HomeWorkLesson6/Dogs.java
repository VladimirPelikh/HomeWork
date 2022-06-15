package HomeWorkLesson6;

public class Dogs extends Animals {
    public Dogs(String name, int run, int swim) {
        super(name, run, swim);
    }

    @Override
    public void doRun() {
        if (getRun() >= 0 && getRun() <= 500) {
            System.out.printf("%s пробежал %d метров%n", getName(), getRun());
        } else {
            System.out.printf("%s так далеко не бегает! Пощади пёсика, ирод! Задай значение от 0 до 500м%n", getName());
        }
    }

    @Override
    public void doSwim() {
        if (getSwim() >= 0 && getSwim() <= 10) {
            System.out.printf("%s проплыл %d метров%n", getName(), getSwim());
        } else {
            System.out.printf("%s так далеко не плавает! Пощади пёсика, ирод! Задай значение от 0 до 10м%n", getName());
        }
    }

    @Override
    public void printInfo() {
        System.out.printf("%s умеет бегать на расстояние до 500 метров и умеет плавать на расстояние до 10 метров!%n", getName());
    }
}


