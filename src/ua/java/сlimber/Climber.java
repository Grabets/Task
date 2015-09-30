package ua.java.ñlimber;

import ua.java.equipment.Equipment;

import java.util.ArrayList;

/**
 * Created by bogdan on 9/30/2015.
 */
public class Climber extends HomoSapiens {
    private ArrayList<Equipment> equipments;
    private String rank;
    private int weightLimit;

    public Climber(String name, int age, String rank, ArrayList<Equipment> equipments){
        super(name, age);
        this.rank = rank;
        if (rank.equals("III"))
            this.weightLimit = 10000;
        if (rank.equals("II"))
            this.weightLimit = 15000;
        if (rank.equals("I"))
            this.weightLimit = 20000;
        if (rank.equals("KMS"))
            this.weightLimit = 25000;
        if (rank.equals("MS"))
            this.weightLimit = 25000;
        if (weightLimit == 0)
            System.out.println("Rank not matched correctly");
        this.equipments = equipments;
    }

    public void getCost(){

    }

    public void sortEquipmentsByWeight(){

    }

    public void findEquipmentsByCost(){

    }
}
