package knight.ammunition.additional;

import knight.ammunition.Ammunition;

public class Cloak extends Ammunition {
    private String material;  // Матеріал плаща
    private String color;     // Колір плаща

    public Cloak(String name, double weight, double price, String material, String color) {
        super(name, weight, price);
        this.material = material;
        this.color = color;
    }

    @Override
    public String getAdditionalInfo() {
        return String.format("Найменування - '%s', Вага - %.2f од., Ціна - %.2f од., Матеріал плаща - %s, Колір - %s",
                getName(), getWeight(), getPrice(), material, color);
    }

    @Override
    public String toString() {
        return String.format("⇒ %s (Найменування - '%s', Вага - %.2f од., Ціна - %.2f од., Матеріал плаща - %s, Колір - %s)",
                getClass().getSimpleName(), getName(), getWeight(), getPrice(), getMaterial(), getColor());
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
}
