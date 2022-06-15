package HomeWorkLesson7;

import java.util.Scanner;

public class Plate {
    private int foodCount; //кол-во еды в тарелке
    public int addCatEatFoodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
        this.addCatEatFoodCount = addCatEatFoodCount;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "В миске осталось " + foodCount + " корма";
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void decreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;
    }

    public void setAddCatEatFoodCount(int addCatEatFoodCount) {
        this.addCatEatFoodCount = addCatEatFoodCount;
    }
    public void addFood (int addCatEatFoodCount) {
        System.out.println("Введите число корма, которое хотите добавить в миску: ");
        Scanner scanner = new Scanner(System.in);
        addCatEatFoodCount = scanner.nextInt();
        foodCount += addCatEatFoodCount;
        System.out.printf("Вы добавили %d корма в миску и теперь там %d корма!", addCatEatFoodCount, foodCount);
    }
}
