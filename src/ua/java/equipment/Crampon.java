package ua.java.equipment;


/**
 * Created by bogdan on 10/1/2015.
 */

public class Crampon extends Equipment {
    private String name = "Crampon";
    private String type;
    private int size;
    private int numberOfPoints;

    public Crampon(String type, int size, int numberOfPoints, int weight, int cost) {
        super(cost, weight);
        this.type = type;
        this.size = size;
        this.numberOfPoints = numberOfPoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", " + ", type: " + type + ", size: " + size + ", number of points: " + numberOfPoints + super.toString() + '.';
    }
}
