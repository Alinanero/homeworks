package de.telran.hw20_11_23;

// Интерфейс Worker, описывающий обязанности сотрудника на складе
interface Worker {
    void unloadGoods();
    void loadGoods();
    void receiveGoods();
    void releaseGoods();
    void determineStorageLocation();
    void createPickingTask();
    void createPlacementTask();
}

// Класс Warehouse, представляющий собой склад
public class Warehouse {
    public static void main(String[] args) {
        // Пример использования классов
        Worker loader = new Loader();
        loader.unloadGoods();
        loader.loadGoods();

        Worker storekeeper = new Storekeeper();
        storekeeper.receiveGoods();
        storekeeper.releaseGoods();
        storekeeper.determineStorageLocation();
        storekeeper.createPickingTask();
        storekeeper.createPlacementTask();

        Worker assembler = new Assembler();
        ((Assembler) assembler).placeGoodsOnShelf();
        ((Assembler) assembler).collectGoods();
    }
}

// Класс Loader, реализующий интерфейс Worker для грузчика
class Loader implements Worker {
    @Override
    public void unloadGoods() {
        System.out.println("Грузчик: Разгружает товар.");
    }

    @Override
    public void loadGoods() {
        System.out.println("Грузчик: Загружает товар.");
    }

    @Override
    public void receiveGoods() {
        throw new UnsupportedOperationException("Грузчик не принимает товар.");
    }

    @Override
    public void releaseGoods() {
        throw new UnsupportedOperationException("Грузчик не отпускает товар.");
    }

    @Override
    public void determineStorageLocation() {
        throw new UnsupportedOperationException("Грузчик не определяет место для хранения товара.");
    }

    @Override
    public void createPickingTask() {
        throw new UnsupportedOperationException("Грузчик не формирует задание на сборку товара.");
    }

    @Override
    public void createPlacementTask() {
        throw new UnsupportedOperationException("Грузчик не формирует задание на размещение товара.");
    }
}

// Класс Storekeeper, реализующий интерфейс Worker для кладовщика
class Storekeeper implements Worker {
    @Override
    public void unloadGoods() {
        throw new UnsupportedOperationException("Кладовщик не разгружает товар.");
    }

    @Override
    public void loadGoods() {
        throw new UnsupportedOperationException("Кладовщик не загружает товар.");
    }

    @Override
    public void receiveGoods() {
        System.out.println("Кладовщик: Принимает товар.");
    }

    @Override
    public void releaseGoods() {
        System.out.println("Кладовщик: Отпускает товар.");
    }

    @Override
    public void determineStorageLocation() {
        System.out.println("Кладовщик: Определяет место для хранения товара.");
    }

    @Override
    public void createPickingTask() {
        System.out.println("Кладовщик: Формирует задание на сборку товара со склада.");
    }

    @Override
    public void createPlacementTask() {
        System.out.println("Кладовщик: Формирует задание на размещение товара на складе.");
    }
}

// Класс Assembler, реализующий интерфейс Worker для сборщика
class Assembler implements Worker {
    @Override
    public void unloadGoods() {
        throw new UnsupportedOperationException("Сборщик не разгружает товар.");
    }

    @Override
    public void loadGoods() {
        throw new UnsupportedOperationException("Сборщик не загружает товар.");
    }

    @Override
    public void receiveGoods() {
        throw new UnsupportedOperationException("Сборщик не принимает товар.");
    }

    @Override
    public void releaseGoods() {
        throw new UnsupportedOperationException("Сборщик не отпускает товар.");
    }

    @Override
    public void determineStorageLocation() {
        throw new UnsupportedOperationException("Сборщик не определяет место для хранения товара.");
    }

    @Override
    public void createPickingTask() {
        throw new UnsupportedOperationException("Сборщик не формирует задание на сборку товара.");
    }

    @Override
    public void createPlacementTask() {
        throw new UnsupportedOperationException("Сборщик не формирует задание на размещение товара.");
    }

    public void placeGoodsOnShelf() {
        System.out.println("Сборщик: Размещает товар на складе.");
    }

    public void collectGoods() {
        System.out.println("Сборщик: Собирает товар на складе.");
    }
}
