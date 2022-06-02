package HomeWorkLesson5;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Иванов Иван Иванович", "Главный инженер", "ivanov@mail.ru", "81112223341", 80000, 45);
        Worker worker2 = new Worker("Петров Петр Петрович", "Главный механик", "petrov@mail.ru", "81112223342", 75000, 38);
        Worker worker3 = new Worker("Сидоров Сидр Сидорович", "Главный энергетик", "sidorov@mail.ru", "81112223343", -73000, 41);
        Worker worker4 = new Worker("Васильев Василий Васильевич", "Главный метролог", "vasilev@mail.ru", "81112223344", 70000, 35);
        Worker worker5 = new Worker("Романов Роман Романович", "Генеральный директор", "romanov@mail.ru", "81112223345", 100000, 47);

        worker1.printInfo();
        worker2.printInfo();
        worker3.printInfo();
        worker4.printInfo();
        worker5.printInfo();

        System.out.println("\nВыводим информацию о сотрудниках старше 40 лет:\n");

        Worker[] workersArray = {worker1, worker2, worker3, worker4, worker5};
        for (Worker worker : workersArray) {
            worker.getAge();
        }
    }
}
