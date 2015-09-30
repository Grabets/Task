package ua.java.equipment;


/**
 * Created by bogdan on 10/1/2015.
 */

public class Rucksack extends Equipment {
    private String name = "Rucksack";
    private int volume;

    public Rucksack(int volume, int weight, int cost) {
        super(cost, weight);
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", " + ", volume: " + volume + ", " + super.toString() + '.';
    }
}
