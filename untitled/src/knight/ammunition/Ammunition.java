package knight.ammunition;

import knight.ammunition.additional.Belt;
import knight.ammunition.additional.Cloak;
import knight.ammunition.protective.Chainmail;
import knight.ammunition.protective.Helmet;
import knight.ammunition.protective.Shield;
import knight.ammunition.weapon.Bows;
import knight.ammunition.weapon.Sword;

import java.util.ArrayList;
import java.util.List;

public abstract class Ammunition {
    private String name;
    private double weight;
    private double price;

    public Ammunition(String name, double weight, double price) {
        if (weight < 0 || price < 0) {
            throw new IllegalArgumentException("Weight and price must be non-negative.");
        }
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    // Гетери
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getAdditionalInfo();

    public static List<Ammunition> getAmmunitionList() {
        List<Ammunition> ammunitions = new ArrayList<>();

        // Ініціалізація амуніції
        ammunitions.add(new Belt("Залізний ремінь", 1.5, 12.0, "Залізо"));
        ammunitions.add(new Cloak("Вовняний плащ", 2.5, 18.0, "Вовна", "Червоний"));

        ammunitions.add(new Helmet("Бронзовий шолом", 2.0, 35.0, "Бронза", "Звичайний", true));
        ammunitions.add(new Shield("Дубовий щит", 4.0, 30.0, "Дуб", "Круглий"));
        ammunitions.add(new Chainmail("Сталева кольчуга", 10.0, 80.0, "Сталь", "Європейський 4 в 1"));

        ammunitions.add(new Bows("Лісовий лук", 1.5, 25.0, 100.0, 50.0));
        ammunitions.add(new Sword("Бойовий меч", 3.0, 60.0, 70.0));

        return ammunitions;
    }

    public static List<Ammunition> getKnightKit() {
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("%s {Найменування='%s', Вага=%.2f од., Ціна=%.2f од., %s}",
                getClass().getSimpleName(), getName(), getWeight(), getPrice(), getAdditionalInfo());
    }
}
