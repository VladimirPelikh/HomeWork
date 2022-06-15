package HomeWorkLesson7;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat("Ричард", 5);
        Plate plate = new Plate(44);
        Cat cat2 = new Cat("Барсик", 3);
        Cat cat3 = new Cat("Рыжик", 2);
        Cat cat4 = new Cat("Мурчик", 6);

        plate.printInfo();

        while (plate.getFoodCount() > 0) {
            if (cat.maxAppetite <= plate.getFoodCount()) {
                cat.eat(plate);
                plate.printInfo();
                Thread.sleep(500);
            } else {
                System.out.println("В миске недостаточно корма, добавьте корм котику");
                plate.addFood(plate.addCatEatFoodCount);
                break;
            }
        }
//        Cat[] cats = {cat, cat2, cat3, cat4};
//        cat.eat(plate);
    }
}
