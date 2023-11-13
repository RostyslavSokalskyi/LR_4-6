package knight.ammunition.protective;

import knight.ammunition.Ammunition;

public class Chainmail extends Ammunition {
    private String material;  // Матеріал кольчуги
    private String weavingStyle; // Стиль плетіння кольчуги

    public Chainmail(String name, double weight, double price, String material, String weavingStyle) {
        super(name, weight, price);
        this.material = material;
        this.weavingStyle = weavingStyle;
    }

    public String getAdditionalInfo() {
        return String.format("Найменування - '%s', Вага - %.2f од., Ціна - %.2f од., Матеріал - %s, Стиль - %s",
                getName(), getWeight(), getPrice(), material, weavingStyle);
    }
    @Override
    public String toString() {
        return String.format("⇒ %s (Найменування - '%s', Вага - %.2f од., Ціна - %.2f од., Матеріал - %s, Стиль - %s)",
                getClass().getSimpleName(), getName(), getWeight(), getPrice(), getMaterial(), getWeavingStyle());
    }

    public String getMaterial() {
        return material;
    }

    public String getWeavingStyle() {
        return weavingStyle;
    }
}
