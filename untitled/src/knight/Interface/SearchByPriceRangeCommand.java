package knight.Interface;

import knight.ammunition.Ammunition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchByPriceRangeCommand implements Command {
    private List<Ammunition> ammunitionList;

    public SearchByPriceRangeCommand(List<Ammunition> ammunitionList) {
        this.ammunitionList = ammunitionList;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Уведіть діапазон ціни, за яким шукатиметься амуніція");
        System.out.print("Мінімальна межа: ");
        double minPrice = scanner.nextDouble();
        System.out.print("Максимальна межа: ");
        double maxPrice = scanner.nextDouble();
        scanner.nextLine();  // Очистіть буфер введення

        List<Ammunition> result = new ArrayList<>();
        for (Ammunition ammo : ammunitionList) {
            if (ammo.getPrice() >= minPrice && ammo.getPrice() <= maxPrice) {
                result.add(ammo);
            }
        }

        System.out.println("Амуніція в діапазоні ціни від " + minPrice + " до " + maxPrice + ": ");
        for (Ammunition ammo : result) {
            System.out.println(ammo.getName() + " - " + ammo.getPrice());
        }
    }
}
