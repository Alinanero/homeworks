package de.telran.hw10_11_23.car;

// Базовый класс Транспортное средство
class Vehicle {
    // Характеристики транспортного средства
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Поведение транспортного средства
    public void start() {
        System.out.println("Транспортное средство марки " + brand + " запущено.");
    }

    public void stop() {
        System.out.println("Транспортное средство марки " + brand + " остановлено.");
    }
}

// Класс Автомобиль наследуется от Транспортного средства
class Car extends Vehicle {
    // Характеристики автомобиля
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Поведение автомобиля
    public void drive() {
        System.out.println("Автомобиль марки " + brand + " движется.");
    }
}

// Класс Автобус наследуется от Транспортного средства
class Bus extends Vehicle {
    // Характеристики автобуса
    private int passengerCapacity;

    public Bus(String brand, int year, int passengerCapacity) {
        super(brand, year);
        this.passengerCapacity = passengerCapacity;
    }

    // Поведение автобуса
    public void announceNextStop() {
        System.out.println("Следующая остановка для автобуса марки " + brand + ".");
    }
}

// Класс Велосипед наследуется от Транспортного средства
class Bicycle extends Vehicle {
    // Характеристики велосипеда
    private int numberOfGears;

    public Bicycle(String brand, int year, int numberOfGears) {
        super(brand, year);
        this.numberOfGears = numberOfGears;
    }

    // Поведение велосипеда
    public void pedal() {
        System.out.println("Велосипед марки " + brand + " крутит педали.");
    }
}

// Класс Мотоцикл наследуется от Транспортного средства
class Motorcycle extends Vehicle {
    // Характеристики мотоцикла
    private String type;

    public Motorcycle(String brand, int year, String type) {
        super(brand, year);
        this.type = type;
    }

    // Поведение мотоцикла
    public void accelerate() {
        System.out.println("Мотоцикл марки " + brand + " ускоряется.");
    }
}

// Пример использования классов
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 4);
        Bus bus = new Bus("Mercedes", 2020, 40);
        Bicycle bicycle = new Bicycle("Trek", 2021, 21);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 2019, "Cruiser");

        car.start();
        car.drive();
        car.stop();

        bus.start();
        bus.announceNextStop();
        bus.stop();

        bicycle.start();
        bicycle.pedal();
        bicycle.stop();

        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.stop();
    }
}
