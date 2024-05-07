package de.telran.hw29_11_23;

public class UnidirectionIntLinkedList {
    private int size;
    private Node head;

    // Структура для хранения элемента списка
    private static class Node {
        int item;
        Node next;

        Node(int item) {
            this.item = item;
            this.next = null;
        }
    }

    // Добавление элемента в конец списка
    public void add(int value) {
        addLast(value);
    }

    // Добавление элемента по индексу в список
    public void add(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node newNode = new Node(value);
            Node current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    // Добавление элемента в начало списка
    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Добавление элемента в конец списка
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Получение элемента по индексу
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.item;
    }

    // Установка значения элемента по индексу
    public int set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        int oldValue = current.item;
        current.item = value;
        return oldValue;
    }

    // Удаление элемента по индексу
    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        int removedValue;
        if (index == 0) {
            removedValue = head.item;
            head = head.next;
        } else {
            Node current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            removedValue = current.next.item;
            current.next = current.next.next;
        }
        size--;
        return removedValue;
    }

    // Удаление элемента с начала списка
    public int removeFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        int removedValue = head.item;
        head = head.next;
        size--;
        return removedValue;
    }

    // Удаление элемента с конца списка
    public int removeLast() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        if (size == 1) {
            int removedValue = head.item;
            head = null;
            size--;
            return removedValue;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        int removedValue = current.next.item;
        current.next = null;
        size--;
        return removedValue;
    }

    // Поиск индекса первого вхождения элемента
    public int indexOf(int value) {
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.item == value) {
                return i;
            }
            current = current.next;
        }
        return -1; // Элемент не найден
    }

    // Проверка наличия элемента в списке
    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    // Очистка списка
    public void clear() {
        head = null;
        size = 0;
    }

    // Получение текущего размера списка
    public int size() {
        return size;
    }

    // Тестовый метод для вывода списка (для демонстрации)
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        UnidirectionIntLinkedList list = new UnidirectionIntLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.printList(); // Вывод: 1 2 3

        list.add(1, 10);
        list.printList(); // Вывод: 1 10 2 3

        list.addFirst(5);
        list.printList(); // Вывод: 5 1 10 2 3

        list.addLast(7);
        list.printList(); // Вывод: 5 1 10 2 3 7

        System.out.println("Element at index 2: " + list.get(2)); // Вывод: Element at index 2: 10

        list.set(2, 20);
        list.printList(); // Вывод: 5 1 20 2 3 7

        System.out.println("Removed element at index 3: " + list.remove(3)); // Вывод: Removed element at index 3: 2
        list.printList(); // Вывод: 5 1 20 3 7

        System.out.println("Removed first element: " + list.removeFirst()); // Вывод: Removed first element: 5
        list.printList(); // Вывод: 1 20 3 7

        System.out.println("Removed last element: " + list.removeLast()); // Вывод: Removed last element: 7
        list.printList(); // Вывод: 1 20 3

        System.out.println("Index of element 20: " + list.indexOf(20)); // Вывод: Index of element 20: 1

        System.out.println("List contains element 10: " + list.contains(10)); // Вывод: List contains element 10: false

        list.clear();
        list.printList(); // Вывод: (empty list)
    }
}
