package knight.Interface;

import knight.ammunition.Ammunition;

import java.util.List;

public class CalculateCostCommand implements Command {

    private List<Ammunition> ammunitions;

    public CalculateCostCommand(List<Ammunition> ammunitions) {
        this.ammunitions = ammunitions;
    }

    @Override
    public void execute() {
        double totalCost = 0;

        for(Ammunition ammo : ammunitions) {
            totalCost += ammo.getPrice();
        }

        System.out.println("Сумарна вартість амуніції: " + totalCost);
    }
}
