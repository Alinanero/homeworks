package de.telran.hw17_11_23;

// Интерфейс Worker, описывающий обязанности сотрудника
interface Worker {
    void takeOrder();
    void serveCustomer();
    void handlePayment();
}

// Класс Cashier, реализующий интерфейс Worker для кассира
class Cashier implements Worker {
    @Override
    public void takeOrder() {
        System.out.println("Кассир: принимает заказ и выставляет счет.");
    }

    @Override
    public void serveCustomer() {
        System.out.println("Кассир: обслуживает клиента.");
    }

    @Override
    public void handlePayment() {
        System.out.println("Кассир: принимает оплату.");
    }
}

// Класс Waiter, реализующий интерфейс Worker для официанта
class Waiter implements Worker {
    @Override
    public void takeOrder() {
        System.out.println("Официант: принимает заказ.");
    }

    @Override
    public void serveCustomer() {
        System.out.println("Официант: выносит заказ и обслуживает клиента.");
    }

    @Override
    public void handlePayment() {
        System.out.println("Официант: принимает оплату.");
    }

    // Дополнительный метод для уборки стола
    public void cleanTable() {
        System.out.println("Официант: убирает стол.");
    }
}

// Класс Cook, реализующий интерфейс Worker для повара
class Cook implements Worker {
    @Override
    public void takeOrder() {
        System.out.println("Повар: принимает заказ и начинает готовить.");
    }

    @Override
    public void serveCustomer() {
        System.out.println("Повар: выносит заказ.");
    }

    @Override
    public void handlePayment() {
        System.out.println("Повар: не занимается оплатой (обычно).");
    }

    // Дополнительный метод для мойки посуды
    public void washDishes() {
        System.out.println("Повар: моет посуду.");
    }
}

// Класс Cleaner, реализующий интерфейс Worker для уборщика
class Cleaner implements Worker {
    @Override
    public void takeOrder() {
        System.out.println("Уборщик: не принимает заказы.");
    }

    @Override
    public void serveCustomer() {
        System.out.println("Уборщик: не обслуживает клиентов.");
    }

    @Override
    public void handlePayment() {
        System.out.println("Уборщик: не принимает оплату.");
    }

    // Дополнительные методы для уборки стола и мойки посуды
    public void cleanTable() {
        System.out.println("Уборщик: убирает стол.");
    }

    public void washDishes() {
        System.out.println("Уборщик: моет посуду.");
    }
}

// Класс PizzaRestaurant, представляющий процесс работы пиццерии
public class PizzaRestaurant {
    public static void main(String[] args) {
        // Пример использования классов
        Cashier cashier = new Cashier();
        cashier.takeOrder();
        cashier.serveCustomer();
        cashier.handlePayment();

        Waiter waiter = new Waiter();
        waiter.takeOrder();
        waiter.serveCustomer();
        waiter.handlePayment();
        waiter.cleanTable(); // Дополнительный метод для уборки стола

        Cook cook = new Cook();
        cook.takeOrder();
        cook.serveCustomer();
        cook.washDishes(); // Дополнительный метод для мойки посуды

        Cleaner cleaner = new Cleaner();
        cleaner.cleanTable(); // Дополнительный метод для уборки стола
        cleaner.washDishes(); // Дополнительный метод для мойки посуды
    }
}
