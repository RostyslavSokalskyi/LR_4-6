package knight.Interface;

import knight.Knight;
import knight.ammunition.Ammunition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EquipKnightCommand implements Command {
    private Knight knight;
    private List<Ammunition> ammunitionList;

    public EquipKnightCommand(List<Ammunition> ammunitionList) {
        this.ammunitionList = ammunitionList;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Уведіть ім'я рицаря: ");
        String knightName = scanner.nextLine().trim();

        System.out.println("Виберіть амуніцію для екіпірування рицаря " + knightName + ":");

        int index = 1;
        for (Ammunition ammo : ammunitionList) {
            System.out.println(index + ". " + ammo.getName());
            index++;
        }

        System.out.println("Введіть номери амуніції, яку бажаєте додати (через пробіл): ");
        String[] choices = scanner.nextLine().split("\\s+");

        List<Ammunition> selectedAmmoList = new ArrayList<>();
        for (String choice : choices) {
            int num = Integer.parseInt(choice);
            if (num > 0 && num <= ammunitionList.size()) {
                selectedAmmoList.add(ammunitionList.get(num - 1));
            }
        }

        if (!selectedAmmoList.isEmpty()) {
            // Створити нового лицаря і екіпірувати його обраною амуніцією
            this.knight = new Knight(knightName);
            this.knight.equip(selectedAmmoList);

            System.out.println("Лицаря " + knightName + " було екіпіровано з обраною амуніцією.");
        } else {
            System.out.println("Неправильний вибір амуніції.");
        }
    }
}
