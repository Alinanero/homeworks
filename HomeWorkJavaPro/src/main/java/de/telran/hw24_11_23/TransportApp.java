package de.telran.hw24_11_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Интерфейс для транспорта
interface Transport {
    String getName();
    double getCost();
    double getTravelTime();
}

// Класс для автобуса
class Bus implements Transport {
    private final String name;
    private final double cost;
    private final double travelTime;

    public Bus(String name, double cost, double travelTime) {
        this.name = name;
        this.cost = cost;
        this.travelTime = travelTime;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public double getTravelTime() {
        return travelTime;
    }
}

// Класс для самолета
class Airplane implements Transport {
    private final String name;
    private final double cost;
    private final double travelTime;

    public Airplane(String name, double cost, double travelTime) {
        this.name = name;
        this.cost = cost;
        this.travelTime = travelTime;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public double getTravelTime() {
        return travelTime;
    }
}

// Пример приложения для выбора транспорта
public class TransportApp {
    public static void main(String[] args) {
        // Создаем несколько видов транспорта
        Transport bus = new Bus("Автобус", 50.0, 5.0);
        Transport airplane = new Airplane("Самолет", 200.0, 2.0);

        // Создаем список транспорта
        List<Transport> transportList = new ArrayList<>();
        transportList.add(bus);
        transportList.add(airplane);

        // Сортируем транспорт по стоимости
        Collections.sort(transportList, (t1, t2) -> Double.compare(t1.getCost(), t2.getCost()));

        System.out.println("Транспорт отсортирован по стоимости:");
        for (Transport transport : transportList) {
            System.out.println(transport.getName() + ": Стоимость - " + transport.getCost() + ", Время - " + transport.getTravelTime());
        }

        // Сортируем транспорт по времени
        Collections.sort(transportList, (t1, t2) -> Double.compare(t1.getTravelTime(), t2.getTravelTime()));

        System.out.println("\nТранспорт отсортирован по времени:");
        for (Transport transport : transportList) {
            System.out.println(transport.getName() + ": Стоимость - " + transport.getCost() + ", Время - " + transport.getTravelTime());
        }
    }
}
