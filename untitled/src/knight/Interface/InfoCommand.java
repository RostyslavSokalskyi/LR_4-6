package knight.Interface;

import knight.ammunition.Ammunition;

import java.util.List;

public class InfoCommand implements Command {

    private List<Ammunition> ammunitionList;

    public InfoCommand(List<Ammunition> ammunitionList) {
        this.ammunitionList = ammunitionList;
    }

    @Override
    public void execute() {
        System.out.println("Інформація про амуніцію:");
        for (Ammunition ammo : ammunitionList) {
            System.out.println(ammo);
        }
    }
}
