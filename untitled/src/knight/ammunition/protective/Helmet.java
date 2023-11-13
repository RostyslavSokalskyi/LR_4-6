package knight.ammunition.protective;

import knight.ammunition.Ammunition;

public class Helmet extends Ammunition {
    private String material;
    private String visorType;


    public Helmet(String name, double weight, double price, String material, String visorType, boolean hasFeather) {
        super(name, weight, price);
        this.material = material;
        this.visorType = visorType;

    }

    @Override
    public String getAdditionalInfo() {
        return String.format("Найменування - '%s', Вага - %.2f од., Ціна - %.2f од., Матеріал - %s, VisorType - %s",
                getName(), getWeight(), getPrice(), material, visorType);
    }

    public String getMaterial() {
        return material;
    }

    public String getVisorType() {
        return visorType;
    }

    @Override
    public String toString() {
        return String.format("⇒ %s (Найменування - '%s', Вага - %.2f од., Ціна - %.2f од., Матеріал - %s, VisorType - %s)",
                getClass().getSimpleName(), getName(), getWeight(), getPrice(), getMaterial(), getVisorType());
    }
}
