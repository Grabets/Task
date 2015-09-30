package ua.java.equip;

import ua.java.equipment.Equipment;
import ua.java.equipment.IceAxe;

/**
 * Created by bogdan on 10/1/2015.
 */
public class Equip {

    public Equip(){

    }

    private Equipment fillEquipment(String type){
        // TODO : price and weight - double???
        return new IceAxe("A", 70, 600, 1200);
    }

}
