package de.telran.hw20_11_23;

// RussianHen.java
public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Моя страна - Россия. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

// UkrainianHen.java
class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 40;
    }

    @Override
    public String getDescription() {
        return "Моя страна - Украина. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

// MoldovanHen.java
class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Моя страна - Молдова. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

// BelarusianHen.java
class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 35;
    }

    @Override
    public String getDescription() {
        return "Моя страна - Беларусь. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}