package knight.ammunition.weapon;

import knight.ammunition.Ammunition;

public class Sword extends Ammunition {
    private double bladeLength;

    public Sword(String name, double weight, double price, double bladeLength) {
        super(name, weight, price);
        this.bladeLength = bladeLength;
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }


    @Override
    public String getAdditionalInfo() {
        return String.format("Найменування - '%s', Вага - %.2f од., Ціна - %.2f од., Довжина леза - %.2f",
                getName(), getWeight(), getPrice(), bladeLength);
    }

    @Override
    public String toString() {
        return String.format("⇒ %s (Найменування - '%s', Вага - %.2f од., Ціна - %.2f од., Довжина леза - %.2f)",
                getClass().getSimpleName(), getName(), getWeight(), getPrice(), getBladeLength());
    }
}
