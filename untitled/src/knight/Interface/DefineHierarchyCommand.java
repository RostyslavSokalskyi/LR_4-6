package knight.Interface;

import knight.ammunition.Ammunition;

import java.util.List;

public class DefineHierarchyCommand implements Command {
    private List<Ammunition> ammunitionList;


    public DefineHierarchyCommand(List<Ammunition> ammunitionList) {
        this.ammunitionList = ammunitionList;
    }

    @Override
    public void execute() {
        System.out.println("Ієрархія амуніції:");

        for (Ammunition ammunition : ammunitionList) {
            System.out.println(ammunition.getName());
        }
    }
}
