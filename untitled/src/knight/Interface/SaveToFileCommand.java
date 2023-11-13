package knight.Interface;

import knight.ammunition.Ammunition;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

public class SaveToFileCommand implements Command {
    private List<Ammunition> ammunitionList;

    public SaveToFileCommand(List<Ammunition> ammunitionList) {
        this.ammunitionList = ammunitionList;
    }

    @Override
    public void execute() {
        StringBuilder record = new StringBuilder();
        for (Ammunition ammunition : ammunitionList) {
            record.append(ammunition.toString());
        }

        try {
            PrintStream ps = new PrintStream(new File("C:\\Users\\Rostyslav\\OneDrive\\Desktop\\AmmunitionList.txt"));
            PrintStream standard = System.out;
            System.setOut(ps);
            ps.print(record.toString());
            System.setOut(standard);
            System.out.println("Амуніцію збережено у файл.");
        } catch (FileNotFoundException e) {
            System.out.println("Помилка: файл не знайдено.");
        }
    }
}
