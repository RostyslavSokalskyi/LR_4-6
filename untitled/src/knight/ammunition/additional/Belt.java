package knight.ammunition.additional;

import knight.ammunition.Ammunition;

public class Belt extends Ammunition {
    private String material;

    public Belt(String name, double weight, double price, String material) {
        super(name, weight, price);
        this.material = material;
    }

    @Override
    public String getAdditionalInfo() {
        return String.format("Найменування - '%s', Вага - %.2f од., Ціна - %.2f од., Матеріал - %s",
                getName(), getWeight(), getPrice(), material);
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return String.format("⇒ %s (Найменування - '%s', Вага - %.2f од., Ціна - %.2f од., Матеріал - %s)",
                getClass().getSimpleName(), getName(), getWeight(), getPrice(), getMaterial());
    }
}
