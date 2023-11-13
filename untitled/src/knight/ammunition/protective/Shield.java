package knight.ammunition.protective;

import knight.ammunition.Ammunition;

public class Shield extends Ammunition {
    private String material;  // Матеріал щита
    private String shape;     // Форма щита

    public Shield(String name, double weight, double price, String material, String shape) {
        super(name, weight, price);
        this.material = material;
        this.shape = shape;
    }


    @Override
    public String getAdditionalInfo() {
        return String.format("Найменування - '%s', Вага - %.2f од., Ціна - %.2f од., Матеріал - %s, Форма - %s",
                getName(), getWeight(), getPrice(), material, shape);
    }
    @Override
    public String toString() {
        return String.format("⇒ %s (Найменування - '%s', Вага - %.2f од., Ціна - %.2f од., Матеріал - %s, Форма - %s)",
                getClass().getSimpleName(), getName(), getWeight(), getPrice(), getMaterial(), getShape());
    }

    public String getMaterial() {
        return material;
    }

    public String getShape() {
        return shape;
    }
}
