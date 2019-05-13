package ua.lviv.iot.models;

public class Berries extends FruitShop {
    private SummerBerries summerBerries;
    private boolean sweet;

    public Berries() {
    }

    public Berries(String name, Color color, double price, boolean availability, Vitamin vitamin, double weight,
            SummerBerries summerBerries, boolean sweet) {
        super(name, color, price, availability, vitamin, weight);
        this.summerBerries = summerBerries;
        this.sweet = sweet;
    }

    public SummerBerries getSummerBerries() {
        return summerBerries;
    }

    public void setSummerBerries(SummerBerries summerBerries) {
        this.summerBerries = summerBerries;
    }

    public boolean isSweet() {
        return sweet;
    }

    public void setSweet(boolean sweet) {
        this.sweet = sweet;
    }

}