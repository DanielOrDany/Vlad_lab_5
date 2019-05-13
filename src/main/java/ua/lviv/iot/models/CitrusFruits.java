package ua.lviv.iot.models;

public class CitrusFruits extends FruitShop {
    private SummerCitrusFruits summerCitrusFruits;
    private boolean sour;

    public CitrusFruits() {
    }

    public CitrusFruits(String name, Color color, double price, boolean availability, Vitamin vitamin, double weight,
            SummerCitrusFruits summerCitrusFruit, boolean sour) {
        super(name, color, price, availability, vitamin, weight);
        this.summerCitrusFruits = summerCitrusFruit;
        this.sour = sour;
    }

    public SummerCitrusFruits getSummerCitrusFruits() {
        return summerCitrusFruits;
    }

    public void setSummerCitrusFruits(SummerCitrusFruits summerCitrusFruits) {
        this.summerCitrusFruits = summerCitrusFruits;
    }

    public boolean isSour() {
        return sour;
    }

    public void setSour(boolean sour) {
        this.sour = sour;
    }

}