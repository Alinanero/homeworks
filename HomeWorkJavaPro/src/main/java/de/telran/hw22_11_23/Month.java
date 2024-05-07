package de.telran.hw22_11_23;

// Перечисление для хранения месяцев в году
public enum Month {
    JANUARY("Январь"),
    FEBRUARY("Февраль"),
    MARCH("Март"),
    APRIL("Апрель"),
    MAY("Май"),
    JUNE("Июнь"),
    JULY("Июль"),
    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь"),
    DECEMBER("Декабрь");

    private final String russianName;

    Month(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }
}

// Класс для рекомендации режима питания
class DietRecommendation {
    public static void recommendDiet(Month month) {
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("Рекомендуется употреблять питательные продукты, богатые витаминами.");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("Весной рекомендуется увеличить потребление свежих фруктов и овощей.");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("Летом рекомендуется употреблять легкие и освежающие блюда.");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("Осенью рекомендуется включить в рацион питания продукты, богатые железом.");
                break;
            default:
                System.out.println("Неизвестный месяц.");
        }
    }

    public static void main(String[] args) {
        Month currentMonth = Month.JUNE;
        recommendDiet(currentMonth);
    }
}
