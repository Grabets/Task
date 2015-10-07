package ua.java.climber;

import ua.java.equipment.*;
import java.util.*;

/**
 * Created by bogdan on 9/30/2015.
 */

public class Climber {
    private String name;
    private int age;
    private List<Equipment> equipments;
    private String rank;

    public Climber(String name, int age, String rank, List<Equipment> equipments) {
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.equipments = equipments;

    }

    public int getCost() {
        int price = 0;
        for (Equipment equipment : equipments) {
            price += equipment.getCost();
        }
        return price;
    }

    //TODO: lambda?
    public void sortEquipmentsByWeight() {
        Collections.sort(equipments, new Comparator<Equipment>() {
            public int compare(Equipment o1, Equipment o2) {
                if (o1.getWeight() > o2.getWeight())
                    return 1;
                if (o1.getWeight() < o2.getWeight())
                    return -1;
                return 0;
            }
        });
        for (Equipment equipment : equipments)
            System.out.print(equipment);
    }

    public List findEquipmentsByCost(int low, int high) {
        List<Equipment> eq = new ArrayList<>();
        for (Equipment equipment : equipments) {
            if (equipment.getCost() > low & equipment.getCost() < high)
                eq.add(equipment);
        }
        if (eq.size()==0){
            System.out.println("No match found");
            return null;
        }
        else return eq;
    }

    @Override
    public String toString() {
        StringBuilder climberToText = new StringBuilder();
        climberToText.append("Name: " + name + ", age: " + age + ", rank: " + rank);
        climberToText.append("\n" + "Equipments:\n");
        for (Equipment equipment : equipments)
            climberToText.append(new StringBuilder(equipment.toString()));
        return new String(climberToText);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEquipments(List<Equipment> equipments) {
        this.equipments = equipments;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

}
