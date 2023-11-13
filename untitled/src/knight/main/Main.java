package knight.main;

import knight.Interface.*;

import knight.ammunition.*;
import knight.menu.Menu;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Ammunition> ammunitionList = Ammunition.getAmmunitionList();

        Command equipCommand = new EquipKnightCommand(ammunitionList);
        Command searchCommand = new SearchByPriceRangeCommand(ammunitionList);
        Command sortCommand = new SortByWeightCommand(ammunitionList);
        Command defineHierarchyCommand = new DefineHierarchyCommand(ammunitionList);
        Command calculateCostCommand = new CalculateCostCommand(ammunitionList);

        Menu menu = new Menu();
        menu.addCommand("Екіпірувати", equipCommand);
        menu.addCommand("Пошук за ціною", searchCommand);
        menu.addCommand("Сортування за вагою", sortCommand);
        menu.addCommand("Визначити ієрархію", defineHierarchyCommand);
        menu.addCommand("Розрахувати загальну вартість", calculateCostCommand);
        menu.addInfoCommand("Інформація про амуніцію", ammunitionList);
        menu.addExitCommand("Вийти");

        menu.display();
    }
}
