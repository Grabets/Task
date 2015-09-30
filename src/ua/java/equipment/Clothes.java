package ua.java.equipment;


/**
 * Created by bogdan on 10/1/2015.
 */

public class Clothes extends Equipment {
    private String name = "Clothes";
    private String type;
    private int size;

    public Clothes(String type, int size, int weight, int cost) {
        super(cost, weight);
        this.type = type;
        this.size = size;
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

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", " + ", type: " + type + ", size: " + size + super.toString() + '.';
    }
}
