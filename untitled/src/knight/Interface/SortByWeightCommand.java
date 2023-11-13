package knight.Interface;

import knight.ammunition.Ammunition;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByWeightCommand implements Command {
    private List<Ammunition> ammunitionList;

    public SortByWeightCommand(List<Ammunition> ammunitionList) {
        this.ammunitionList = ammunitionList;
    }

    @Override
    public void execute() {
        Collections.sort(ammunitionList, Comparator.comparingDouble(Ammunition::getWeight));
        System.out.println("Амуніція була відсортована за вагою.");
    }
}
