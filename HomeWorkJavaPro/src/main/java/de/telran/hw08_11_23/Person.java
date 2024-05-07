package de.telran.hw08_11_23;

public class Person { public static void main(String[] args) {
    Person person = new Person();
    person.move();
    person.talk();
    Person person1 = new Person(person.fullName, person.age);
    person1.move();
    person1.talk();
}
    private static String fullName;
    private int age;

    public Person() {
        this.fullName = "Bob";
        this.age = 18;
    }

    public Person(String fullName, Integer age) {
        this.fullName = "Anna";
        this.age = 15;
    }

    public static void move() {

        System.out.println(fullName + " делает");
    }
    public static void talk() {

        System.out.println(fullName + " говорит");
    }

}
