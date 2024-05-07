package de.telran.hw08_11_23;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public static void receiveCall(String callerName) {
        System.out.println("звонит " + callerName);
    }

    public String getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("911413233", "Apple", 89.5);
        Phone phone2 = new Phone("911756434", "Samsung", 109.3);
        Phone phone3 = new Phone("911765849", "Redmi", 149.5);

        System.out.println("Phone1 number: " + phone1.getNumber());
        System.out.println("Phone2 number: " + phone2.getNumber());
        System.out.println("Phone3 number: " + phone3.getNumber());

        Phone.receiveCall("Anna");
        Phone.receiveCall("Bob");
        Phone.receiveCall("Sara");
    }
}
