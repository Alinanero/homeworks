package de.telran.hw10_11_23.box;

public class Box {
    private double width;
    private double length;
    private double height;

    // Конструктор класса
    public Box(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    // Метод для рассчета объема коробки
    public double calculateVolume() {
        return width * length * height;
    }

    // Метод для подсчета, сколько коробок нужно для заданного объема товара
    public int calculateBoxesNeeded(double totalVolumeOfGoods) {
        if (totalVolumeOfGoods <= 0) {
            return 0; // Возвращаем 0, если объем товара некорректный или отрицательный
        }
        
        double volumeOfOneBox = calculateVolume();
        return (int) Math.ceil(totalVolumeOfGoods / volumeOfOneBox);
    }

    // Геттеры и сеттеры для характеристик коробки (инкапсуляция)
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Пример использования класса
    public static void main(String[] args) {
        // Создаем коробку с заданными размерами
        Box box = new Box(2.0, 3.0, 1.5);

        // Рассчитываем объем коробки
        double volume = box.calculateVolume();
        System.out.println("Объем коробки: " + volume + " кубических единиц");

        // Подсчитываем, сколько таких коробок нужно для размещения определенного объема товара
        double totalVolumeOfGoods = 30.0;
        int boxesNeeded = box.calculateBoxesNeeded(totalVolumeOfGoods);
        System.out.println("Для размещения " + totalVolumeOfGoods + " кубических единиц товара нужно " + boxesNeeded + " коробок");
    }
}
