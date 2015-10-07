package ua.java.climber;

import ua.java.equipment.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bogdan on 10/1/2015.
 */
public class PrepareToClimb {
    public static void main(String[] args) {
        List<Equipment> equip = new ArrayList<>();
        equip.add(new Boots("hiking", 43, 2300, 350));
        equip.add(new Helmet("plastic", 50, 320, 60));
        equip.add(new Clothes("full wear", "XL", 5300, 800));
        equip.add(new Rucksack(80, 1300, 60));
        equip.add(new IceAxe("B", 70, 650, 120));
        equip.add(new Crampon("attachable", 43, 14, 860, 190));
        equip.add(new Rope(true, 10, 50, 3200, 80));

        Climber climber = new Climber("Anatoliy Bukreev", 32, "MS", equip);
        System.out.println(climber);
        System.out.println("Price of all equipments: " + climber.getCost() + "$");
        System.out.println("\nSorted equipments by weight:");
        climber.sortEquipmentsByWeight();
        System.out.print("\nGet elements of equipment by range of cost:\n");
        List<Equipment> equipmentsByCost = climber.findEquipmentsByCost(100, 200);
        for (Equipment equipment : equipmentsByCost)
            System.out.print(equipment);
    }
}
