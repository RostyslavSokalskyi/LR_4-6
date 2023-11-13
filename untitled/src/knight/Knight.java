package knight;

import knight.ammunition.Ammunition;
import java.util.ArrayList;
import java.util.List;

public class Knight {
    private String name;
    private List<Ammunition> equippedAmmunition; // список амуніції, якою споряджений лицар

    public Knight(String name) {
        this.name = name;
        this.equippedAmmunition = new ArrayList<>();
    }

    public void equip(List<Ammunition> ammunitionList) {
        this.equippedAmmunition.clear();  // очищаємо поточну амуніцію
        this.equippedAmmunition.addAll(ammunitionList); // додаємо нову амуніцію
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ammunition> getEquippedAmmunition() {
        return equippedAmmunition;
    }

    @Override
    public String toString() {
        return "Лицар {" +
                "Ім'я='" + name + '\'' +
                ", Амуніція=" + equippedAmmunition +
                '}';
    }
}
