package ua.java.ñlimber;

/**
 * Created by bogdan on 9/30/2015.
 */
public abstract class HomoSapiens {
    private String name;
    private int age;

    public HomoSapiens(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Name: " + name + ". Age: "+ age + '.';
    }
}
