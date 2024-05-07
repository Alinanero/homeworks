package de.telran.hw10_11_23;

// Базовый класс Землянин
class Earthling {
    // Характеристики Землянина, например, имя
    protected String name;

    public Earthling(String name) {
        this.name = name;
    }

    // Поведение Землянина, например, приветствие
    public void greet() {
        System.out.println("Привет, я Землянин по имени " + name);
    }
}

// Класс Человек наследуется от Землянина
class Human extends Earthling {
    // Характеристики Человека, например, возраст
    protected int age;

    public Human(String name, int age) {
        super(name);
        this.age = age;
    }

    // Поведение Человека, например, описание возраста
    public void describeAge() {
        System.out.println("Мой возраст: " + age + " лет");
    }
}

// Класс Сотрудник наследуется от Человека
class Employee extends Human {
    // Характеристики Сотрудника, например, должность
    protected String position;

    public Employee(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    // Поведение Сотрудника, например, информация о должности
    public void displayPosition() {
        System.out.println("Я работаю на должности: " + position);
    }
}

// Класс Инженер наследуется от Сотрудника
class Engineer extends Employee {
    // Характеристики Инженера, например, область инженерии
    protected String engineeringField;

    public Engineer(String name, int age, String position, String engineeringField) {
        super(name, age, position);
        this.engineeringField = engineeringField;
    }

    // Поведение Инженера, например, информация об области инженерии
    public void displayEngineeringField() {
        System.out.println("Моя область инженерии: " + engineeringField);
    }
}

// Пример использования классов
public class Main {
    public static void main(String[] args) {
        Engineer engineer = new Engineer("Иван", 30, "Инженер-программист", "Программирование");
        engineer.greet();  // Привет, я Землянин по имени Иван
        engineer.describeAge();  // Мой возраст: 30 лет
        engineer.displayPosition();  // Я работаю на должности: Инженер-программист
        engineer.displayEngineeringField();  // Моя область инженерии: Программирование
    }
}
