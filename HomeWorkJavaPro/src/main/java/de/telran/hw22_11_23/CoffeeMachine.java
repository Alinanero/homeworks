package de.telran.hw22_11_23;

public class CoffeeMachine {
    // Приватное статическое поле для хранения единственного экземпляра
    private static CoffeeMachine instance;

    // Приватный конструктор, чтобы предотвратить создание экземпляров извне
    private CoffeeMachine() {
        // Здесь можно добавить инициализацию, если необходимо
    }

    // Статический метод для получения единственного экземпляра CoffeeMachine
    public static CoffeeMachine getInstance() {
        // Если экземпляр еще не создан, создаем его
        if (instance == null) {
            instance = new CoffeeMachine();
        }
        // Возвращаем созданный или уже существующий экземпляр
        return instance;
    }

    // Метод для приготовления кофе
    public String prepareCoffee(String coffeeType) {
        // Логика приготовления кофе
        return "Приготовлено " + coffeeType + ". Приятного кофепития!";
    }

    public static void main(String[] args) {
        // Пример использования
        CoffeeMachine coffeeMachine1 = CoffeeMachine.getInstance();
        CoffeeMachine coffeeMachine2 = CoffeeMachine.getInstance();

        System.out.println(coffeeMachine1 == coffeeMachine2); // Должно быть true
    }
}
