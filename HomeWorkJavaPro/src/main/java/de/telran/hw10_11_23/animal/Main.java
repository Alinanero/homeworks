package de.telran.hw10_11_23.animal;

// Базовый класс Животное
class Animal {
    // Характеристики животного
    protected String species;

    public Animal(String species) {
        this.species = species;
    }

    // Поведение животного
    public void makeSound() {
        System.out.println("Животное издает звук.");
    }
}

// Класс Домашнее животное наследуется от Животного
class Pet extends Animal {
    // Характеристики домашнего животного
    protected String name;

    public Pet(String species, String name) {
        super(species);
        this.name = name;
    }

    // Поведение домашнего животного
    public void play() {
        System.out.println(name + " играет.");
    }
}

// Класс Собака наследуется от Домашнего животного
class Dog extends Pet {
    // Дополнительные характеристики собаки
    private String breed;

    public Dog(String name, String breed) {
        super("Собака", name);
        this.breed = breed;
    }

    // Поведение собаки
    public void bark() {
        System.out.println(name + " лает.");
    }
}

// Класс Корова наследуется от Животного
class Cow extends Animal {
    public Cow() {
        super("Корова");
    }

    // Дополнительное поведение коровы
    public void moo() {
        System.out.println("Корова мычит.");
    }
}

// Класс Кот наследуется от Домашнего животного
class Cat extends Pet {
    public Cat(String name) {
        super("Кот", name);
    }

    // Дополнительное поведение кота
    public void meow() {
        System.out.println(name + " мяукает.");
    }
}

// Класс Тигр наследуется от Животного
class Tiger extends Animal {
    public Tiger() {
        super("Тигр");
    }

    // Дополнительное поведение тигра
    public void roar() {
        System.out.println("Тигр рычит.");
    }
}

// Класс Лев наследуется от Животного
class Lion extends Animal {
    public Lion() {
        super("Лев");
    }

    // Дополнительное поведение льва
    public void roar() {
        System.out.println("Лев рычит.");
    }
}

// Класс Обезьяна наследуется от Животного
class Monkey extends Animal {
    public Monkey() {
        super("Обезьяна");
    }

    // Дополнительное поведение обезьяны
    public void swing() {
        System.out.println("Обезьяна качается на лианах.");
    }
}

// Класс Орангутан наследуется от Обезьяны
class Orangutan extends Monkey {
    public Orangutan() {
        // Обезьяна в данном случае не имеет дополнительных характеристик или поведения
    }
}

// Класс Шимпанзе наследуется от Обезьяны
class Chimpanzee extends Monkey {
    public Chimpanzee() {
        // Обезьяна в данном случае не имеет дополнительных характеристик или поведения
    }
}

// Пример использования классов
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Барон", "Далматин");
        Cow cow = new Cow();
        Cat cat = new Cat("Мурзик");
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Monkey monkey = new Monkey();
        Orangutan orangutan = new Orangutan();
        Chimpanzee chimpanzee = new Chimpanzee();

        dog.play();
        dog.bark();

        cow.moo();

        cat.play();
        cat.meow();

        tiger.makeSound();
        tiger.roar();

        lion.makeSound();
        lion.roar();

        monkey.makeSound();
        monkey.swing();

        orangutan.makeSound();
        orangutan.swing();

        chimpanzee.makeSound();
        chimpanzee.swing();
    }
}
