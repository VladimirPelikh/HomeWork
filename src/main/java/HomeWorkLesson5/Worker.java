package HomeWorkLesson5;


import java.util.Arrays;

public class Worker {
    //    ФИО, должность, email, телефон, зарплата, возраст.
    private String name;
    private String jobTitle;
    private String email;
    private String phone;

    private int salary;

    private int age;
    public Worker(String name, String jobTitle, String email, String phone, int salary, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        setSalary(salary);
        setAge(age);
    }

    public Worker(String name) {
        this(name, "default", "default", "default", 0, 0);
    }

    void printInfo() {
        System.out.print(this);
    }

    public String toString() {
        return String.format("Сотрудник ФИО: ---%s%nДолжность: %s%nЭмейл: %s%nНомер телефона: %s%nРазмер зарплаты: %d руб%nВозраст: %d%n", name, jobTitle, email, phone, salary, age);
    }



    public void setSalary(int salary) {
        this.salary = Math.abs(salary);
    }

    public void setAge(int age) {
        this.age = Math.abs(age);
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        if (age > 40) {
            printInfo();
        }
        return age;
    }
}
