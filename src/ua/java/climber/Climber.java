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
    private int weightLimit;

    public Climber(String name, int age, String rank, List<Equipment> equipments){
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.equipments = equipments;
        //setWeightLimit(rank);
        //TODO: check weight limit
    }

    public int getCost(){
        int price = 0;
        for (Equipment equipment : equipments){
            price += equipment.getCost();
        }
        return price;
    }

    public void sortEquipmentsByWeight(){
        Collections.sort(equipments, new Comparator() {
            public int compare(Object o1, Object o2) {
                Equipment equipment1 = (Equipment) o1;
                Equipment equipment2 = (Equipment) o2;
                if (equipment1.getWeight() > equipment2.getWeight())
                    return 1;
                if (equipment1.getWeight() < equipment2.getWeight())
                    return -1;
                return 0;
            }
        });
        for (Equipment equipment : equipments)
            System.out.print(equipment);
    }

    public void findEquipmentsByCost(int low, int high){
        for (Equipment equipment : equipments){
            if (equipment.getCost() > low & equipment.getCost() < high)
                System.out.print(equipment.toString());
        }
    }

    public void equip(String... equip){
        for (int i = 0; i < equip.length; i++){
            if (fillEquipment(equip[i]) != null)
                equipments.add(fillEquipment(equip[i]));
        }
    }

    private Equipment fillEquipment(String type) {
        switch (type) {
            case "Boots":
                return new Boots("hiking", 43, 2300, 350);
            case "Helmet":
                return new Helmet("plastic", 50, 320, 60);
            case "Clothes":
                return new Clothes("full wear", "XL", 5300, 800);
            case "Rucksack":
                return new Rucksack(80, 1300, 60);
            case "IceAxe":
                return new IceAxe("B", 70, 650, 120);
            case "Crampon":
                return new Crampon("attachable", 43, 14, 860, 190);
            case "Rope":
                return new Rope(true, 10, 50, 3200, 80);
            default: {
                System.out.println("Equipment not matched correctly!");
                return null;
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder climberToText = new StringBuilder();
        climberToText.append("Name: " + name + ", age: " + age + ", rank: " + rank);
        climberToText.append("\n"+"Equipments:\n");
        for (Equipment equipment : equipments)
            climberToText.append(new StringBuilder(equipment.toString()));
        return new String(climberToText);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setEquipments(List<Equipment> equipments) {
        this.equipments = equipments;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    public int getWeightLimit() {
        return weightLimit;
    }

    private void setWeightLimit(String rank){
        switch (rank){
            case "III":
                this.weightLimit = 10000;
            case "II":
                this.weightLimit = 15000;
            case "I":
                this.weightLimit = 20000;
            case "KMS":
                this.weightLimit = 25000;
            case "MS":
                this.weightLimit = 30000;
            default:{
                System.out.println("Rank not matched correctly");
                this.weightLimit = 0;
            }
        }
    }
}
