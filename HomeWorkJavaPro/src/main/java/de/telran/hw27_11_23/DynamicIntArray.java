package de.telran.hw27_11_23;

import java.util.Arrays;

public class DynamicIntArray {
    private static final int DEFAULT_CAPACITY = 10;
    private static final int PERCENT_CHANGE = 50;

    private int length;
    private int capacity;
    private int[] arr;

    // Конструктор по умолчанию
    public DynamicIntArray() {
        this.capacity = DEFAULT_CAPACITY;
        this.arr = new int[capacity];
    }

    // Конструктор с параметром capacity
    public DynamicIntArray(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity should be greater than 0");
        }
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    // Метод добавления одного элемента в конец
    public void add(int element) {
        ensureCapacity();
        arr[length++] = element;
    }

    // Метод добавления массива элементов в конец
    public void add(int[] elements) {
        ensureCapacity(elements.length);
        System.arraycopy(elements, 0, arr, length, elements.length);
        length += elements.length;
    }

    // Метод вставки элемента по индексу
    public void insert(int index, int element) {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        ensureCapacity();

        // Смещаем элементы вправо
        System.arraycopy(arr, index, arr, index + 1, length - index);
        arr[index] = element;
        length++;
    }

    // Метод удаления элемента по индексу
    public void delete(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        // Смещаем элементы влево
        System.arraycopy(arr, index + 1, arr, index, length - index - 1);
        length--;
    }

    // Метод получения значения элемента по индексу
    public int get(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return arr[index];
    }

    // Приватный метод для проверки и изменения размера массива
    private void ensureCapacity() {
        if (length == capacity) {
            int newCapacity = capacity + capacity * PERCENT_CHANGE / 100;
            arr = Arrays.copyOf(arr, newCapacity);
            capacity = newCapacity;
        }
    }

    // Приватный метод для проверки и изменения размера массива
    private void ensureCapacity(int required) {
        int requiredCapacity = length + required;
        if (requiredCapacity > capacity) {
            int newCapacity = Math.max(capacity + capacity * PERCENT_CHANGE / 100, requiredCapacity);
            arr = Arrays.copyOf(arr, newCapacity);
            capacity = newCapacity;
        }
    }

    // Тестовый метод для вывода текущего состояния массива (для демонстрации)
    public void printArray() {
        System.out.println(Arrays.toString(Arrays.copyOf(arr, length)));
    }

    // Пример использования
    public static void main(String[] args) {
        DynamicIntArray array = new DynamicIntArray();

        array.add(1);
        array.add(2);
        array.add(new int[]{3, 4, 5});

        array.printArray(); // Вывод: [1, 2, 3, 4, 5]

        array.insert(2, 10);
        array.printArray(); // Вывод: [1, 2, 10, 3, 4, 5]

        array.delete(3);
        array.printArray(); // Вывод: [1, 2, 10, 4, 5]

        System.out.println("Element at index 2: " + array.get(2)); // Вывод: Element at index 2: 10
    }
}
