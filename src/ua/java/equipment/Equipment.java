package ua.java.equipment;

/**
 * Created by bogdan on 10/1/2015.
 */
public abstract class Equipment {
    private int cost;
    private int weight;

    public Equipment(int cost, int weight){
        this.cost = cost;
        this.weight = weight;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getCost(){
        return cost;
    }

    public int getWeight(){
        return weight;
    }

    @Override
    public String toString() {
        return "cost: " + cost + ", weight: "+ weight;
    }
}
