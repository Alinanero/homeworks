package de.telran.hw17_11_23;

// Интерфейс Messenger
interface Messenger {
    void sendMessage(String message);
    String getMessage();
}

// Реализация для Viber
class Viber implements Messenger {
    private String message;

    @Override
    public void sendMessage(String message) {
        System.out.println("Отправляю сообщение через Viber: " + message);
    }

    @Override
    public String getMessage() {
        return "Получено сообщение из Viber: " + message;
    }
}

// Реализация для Telegram
class Telegram implements Messenger {
    private String message;

    @Override
    public void sendMessage(String message) {
        System.out.println("Отправляю сообщение через Telegram: " + message);
    }

    @Override
    public String getMessage() {
        return "Получено сообщение из Telegram: " + message;
    }
}

// Реализация для WhatsApp
class WhatsApp implements Messenger {
    private String message;

    @Override
    public void sendMessage(String message) {
        System.out.println("Отправляю сообщение через WhatsApp: " + message);
    }

    @Override
    public String getMessage() {
        return "Получено сообщение из WhatsApp: " + message;
    }
}

// Пример использования классов
public class MessengerExample {
    public static void main(String[] args) {
        // Пример использования Viber
        Messenger viber = new Viber();
        viber.sendMessage("Привет из Viber!");
        System.out.println(viber.getMessage());

        // Пример использования Telegram
        Messenger telegram = new Telegram();
        telegram.sendMessage("Привет из Telegram!");
        System.out.println(telegram.getMessage());

        // Пример использования WhatsApp
        Messenger whatsApp = new WhatsApp();
        whatsApp.sendMessage("Привет из WhatsApp!");
        System.out.println(whatsApp.getMessage());
    }
}
