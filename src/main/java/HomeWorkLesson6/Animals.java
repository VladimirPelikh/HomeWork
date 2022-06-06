package HomeWorkLesson6;

public abstract class Animals {
    private String name;
    private int run;
    private int swim;

    public Animals(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("%s умеет бегать и плавать", name);
    }

    public void doRun() {
        System.out.printf("%s пробежал %d метров%n", name, run);
    }

    public void doSwim() {
        System.out.printf("%s проплыл %d метров%n", name, swim);
    }

    public void doAction() {
        System.out.printf("%s пробежал %d метров и проплыл %d метров%n", name, run, swim);
    }
}
