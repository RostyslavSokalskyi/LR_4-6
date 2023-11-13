package knight.menu;

import knight.Interface.Command;
import knight.Interface.InfoCommand;
import knight.ammunition.Ammunition;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    private final Map<String, Command> commands = new LinkedHashMap<>();

    public void addCommand(String name, Command command) {
        commands.put(name, command);
    }

    public void addExitCommand(String name) {
        commands.put(name, () -> System.exit(0));
    }
    public void addInfoCommand(String name, List<Ammunition> ammunitionList) {
        commands.put(name, new InfoCommand(ammunitionList));
    }
    public void display() {
        while (true) {
            System.out.println("\n--------------- Меню ---------------");
            int index = 1;
            for (String name : commands.keySet()) {
                System.out.println(index + ". " + name);
                index++;
            }
            System.out.print("-------------------------------------\n► Ваш вибір: ");

            Scanner scanner = new Scanner(System.in);
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 0 && choice <= index) {
                    String commandName = (String) commands.keySet().toArray()[choice - 1];
                    Command command = commands.get(commandName);
                    if (command != null) {
                        command.execute();
                    }
                } else {
                    System.out.println("Неправильний вибір");
                }
            } catch (NumberFormatException e) {
                System.out.println("Уведіть валідне значення");
            }
        }
    }


}
