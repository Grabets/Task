package ua.java.equipment;


/**
 * Created by bogdan on 10/1/2015.
 */

public class IceAxe extends Equipment {
    private String name = "IceAxe";
    private String category;
    private int length;

    public IceAxe(String category, int length, int weight, int cost) {
        super(cost, weight);
        this.category = category;
        this.length = length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Name: "+name+", category: "+category+", "+super.toString()+", length: "+length+".";
    }
}
