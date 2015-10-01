package ua.java.climber;

import java.util.ArrayList;

/**
 * Created by bogdan on 10/1/2015.
 */
public class PrepareToClimb {
    public static void main(String[] args) {
        Climber climber = new Climber("Anatoliy Bukreev", 32, "MS", new ArrayList<>());
        climber.equip("Clothes", "Boots", "Crampon", "Helmet", "IceAxe", "Rucksack", "Rope");
        System.out.println(climber);
        System.out.println("Price of all equipments: " + climber.getCost() + "$");
        System.out.println("\nSorted equipments by weight:");
        climber.sortEquipmentsByWeight();
        System.out.print("\nGet elements of equipment by range of cost:\n");
        climber.findEquipmentsByCost(100, 200);
    }
}
