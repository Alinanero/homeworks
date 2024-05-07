package de.telran.hw17_11_23;

// Интерфейс для безопасных игрушек
interface SafeToy {
    void ensureSafety();
}

// Интерфейс для радиоуправляемых игрушек
interface RemoteControlled {
    void remoteControl();
}

// Интерфейс для летающих игрушек
interface Flying {
    void fly();
}

// Интерфейс для плавающих игрушек
interface Floating {
    void floatOnWater();
}

// Интерфейс для игрушек с голосовым сигналом
interface VoiceSignaling {
    void emitVoiceSignal();
}

// Класс куклы, реализующий интерфейсы SafeToy и VoiceSignaling
class Doll implements SafeToy, VoiceSignaling {
    @Override
    public void ensureSafety() {
        System.out.println("Кукла безопасна для детей.");
    }

    @Override
    public void emitVoiceSignal() {
        System.out.println("Кукла издает голосовой сигнал.");
    }
}

// Класс самолета, реализующий интерфейсы SafeToy, RemoteControlled и Flying
class Airplane implements SafeToy, RemoteControlled, Flying {
    @Override
    public void ensureSafety() {
        System.out.println("Самолет безопасен для детей.");
    }

    @Override
    public void remoteControl() {
        System.out.println("Самолет управляется с помощью радиоуправления.");
    }

    @Override
    public void fly() {
        System.out.println("Самолет может летать.");
    }
}

// Класс машинки, реализующий интерфейсы SafeToy и RemoteControlled
class Car implements SafeToy, RemoteControlled {
    @Override
    public void ensureSafety() {
        System.out.println("Машинка безопасна для детей.");
    }

    @Override
    public void remoteControl() {
        System.out.println("Машинка управляется с помощью радиоуправления.");
    }
}

// Класс катера, реализующий интерфейсы SafeToy, RemoteControlled и Floating
class Boat implements SafeToy, RemoteControlled, Floating {
    @Override
    public void ensureSafety() {
        System.out.println("Катер безопасен для детей.");
    }

    @Override
    public void remoteControl() {
        System.out.println("Катер управляется с помощью радиоуправления.");
    }

    @Override
    public void floatOnWater() {
        System.out.println("Катер может плавать.");
    }
}

// Пример использования классов игрушек
public class ToyFactory {
    public static void main(String[] args) {
        Doll doll = new Doll();
        doll.ensureSafety();
        doll.emitVoiceSignal();

        Airplane airplane = new Airplane();
        airplane.ensureSafety();
        airplane.remoteControl();
        airplane.fly();

        Car car = new Car();
        car.ensureSafety();
        car.remoteControl();

        Boat boat = new Boat();
        boat.ensureSafety();
        boat.remoteControl();
        boat.floatOnWater();
    }
}
