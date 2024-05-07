package de.telran.hw20_11_23.pizza;

public class PizzaCalculator {
    // Калорийность для 1 квадратного см пиццы
    private static final int CALORIES_PER_SQUARE_CM = 40;

    // Метод для вычисления калорийности круглой пиццы
     public static int calculateCalories(int diameter) {
        double radius = diameter / 2.0;
        double area = Math.PI * radius * radius;
        return (int) (CALORIES_PER_SQUARE_CM * area);
    }

    // Метод для вычисления калорийности прямоугольной пиццы
    public static int calculateCalories(int length, int width) {
        int area = length * width;
        return CALORIES_PER_SQUARE_CM * area;
    }

    // Метод для вычисления калорийности квадратной пиццы
    public static int calculateCaloriesSquare(int sideLength) {
        int area = sideLength * sideLength;
        return CALORIES_PER_SQUARE_CM * area;
    }

    public static void main(String[] args) {
        // Пример использования
        int roundPizzaDiameter = 20;
        int rectangularPizzaLength = 15;
        int rectangularPizzaWidth = 25;
        int squarePizzaSideLength = 18;

        int caloriesRoundPizza = calculateCalories(roundPizzaDiameter);
        int caloriesRectangularPizza = calculateCalories(rectangularPizzaLength, rectangularPizzaWidth);
        int caloriesSquarePizza = calculateCalories(squarePizzaSideLength);

        System.out.println("Калорийность круглой пиццы: " + caloriesRoundPizza + " калорий");
        System.out.println("Калорийность прямоугольной пиццы: " + caloriesRectangularPizza + " калорий");
        System.out.println("Калорийность квадратной пиццы: " + caloriesSquarePizza + " калорий");
    }
}
