package knight.ammunition.weapon;

import knight.ammunition.Ammunition;

public class Bows extends Ammunition {
    private double shootingRange;  // Дальність стрільби
    private double drawWeight;     // Сила натягу

    public Bows(String name, double weight, double price, double shootingRange, double drawWeight) {
        super(name, weight, price);
        this.shootingRange = shootingRange;
        this.drawWeight = drawWeight;

    }

    // Гетери
    public double getShootingRange() {
        return shootingRange;
    }

    public double getDrawWeight() {
        return drawWeight;
    }


    // Сетери
    public void setShootingRange(double shootingRange) {
        this.shootingRange = shootingRange;
    }

    public void setDrawWeight(double drawWeight) {
        this.drawWeight = drawWeight;
    }


    public String getAdditionalInfo() {
        return String.format("Найменування - '%s', Вага - %.2f од., Ціна - %.2f од., Дальність стрільби - %.2f, Сила натягу - %.2f",
                getName(), getWeight(), getPrice(), shootingRange, drawWeight);
    }

    @Override
    public String toString() {
        return String.format("⇒ %s (Найменування - '%s', Вага - %.2f од., Ціна - %.2f од., Дальність стрільби - %.2f, Сила натягу - %.2f)",
                getClass().getSimpleName(), getName(), getWeight(), getPrice(), getShootingRange(), getDrawWeight());
    }
}
