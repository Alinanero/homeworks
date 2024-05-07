package de.telran.hw24_11_23;

import java.util.LinkedList;
import java.util.Queue;

// Интерфейс для операций с принтером
interface PrinterOperations {
    void scanDocument(String document);
    void photocopyDocument(String document);
}

// Класс, представляющий принтер
class Printer implements PrinterOperations {
    private Queue<String> printQueue = new LinkedList<>();
    private boolean isPrinting = false;

    // Метод для добавления задания на печать в очередь
    private void addToPrintQueue(String document) {
        printQueue.offer(document);
    }

    // Метод для выполнения задания на печать
    private void processPrintQueue() {
        if (!printQueue.isEmpty()) {
            String document = printQueue.poll();
            System.out.println("Печать документа: " + document);
        }
    }

    // Метод для выполнения сканирования
    @Override
    public void scanDocument(String document) {
        System.out.println("Сканирование документа: " + document);
    }

    // Метод для выполнения ксерокопирования
    @Override
    public void photocopyDocument(String document) {
        System.out.println("Ксерокопирование документа: " + document);
    }

    // Метод для сотрудника, который хочет выполнить операцию на принтере
    public synchronized void employeeRequest(PrinterOperations employee, String document) {
        addToPrintQueue(document);

        if (!isPrinting) {
            isPrinting = true;
            processPrintQueue();
            isPrinting = false;
        }
    }
}

// Пример использования
public class PrinterAccessExample {
    public static void main(String[] args) {
        Printer printer = new Printer();

        // Сотрудник 1
        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                printer.employeeRequest(printer, "Документ " + i);
            }
        }).start();

        // Сотрудник 2
        new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                printer.employeeRequest(printer, "Документ " + i);
            }
        }).start();
    }
}
