package de.telran.hw20_11_23;

// HenFactory.java
public class HenFactory {
    public Hen getHen(String country) {
        switch (country.toLowerCase()) {
            case "russian":
                return new RussianHen();
            case "ukrainian":
                return new UkrainianHen();
            case "moldovan":
                return new MoldovanHen();
            case "belarusian":
                return new BelarusianHen();
            default:
                throw new IllegalArgumentException("Invalid country: " + country);
        }
    }
}
