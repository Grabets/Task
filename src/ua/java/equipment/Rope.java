package ua.java.equipment;


/**
 * Created by bogdan on 10/1/2015.
 */

public class Rope extends Equipment {
    private String name = "Rope";
    private boolean isDynamics;
    private int diameter;
    private int length;

    public Rope(boolean isDynamics, int diameter, int length, int weight, int cost) {
        super(cost, weight);
        this.isDynamics = isDynamics;
        this.diameter = diameter;
        this.length = length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsDynamics(boolean isDynamics) {
        this.isDynamics = isDynamics;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getName() {
        return name;
    }

    public boolean isDynamics() {
        return isDynamics;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Name: " + name +", type: " + (isDynamics ? "dynamic rope":"Non dynamic rope") + ", length: "+length+", diameter: " + diameter + " " +super.toString()+".\n";
    }
}
