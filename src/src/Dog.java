package src;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Dog implements Animal, Serializable {

    private String type = "Dog";
    private String gender;
    private int age;
    private String origin;
    private Set<String> color = new HashSet<String>();
    private double price;
    private int weight;
    private int height;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getOrigin() {
        return origin;
    }

    @Override
    public Set<String> getColor() {
        return color;
    }

    @Override
    public double getPrice() {
        return price;
    }

   
    @Override
    public int getWeight() {
        return weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setColor(Set<String> color) {
        this.color = color;
    }

    public void addColor(String color) {
        this.color.add(color);
    }

    public void setPrice(double price) {
        this.price = price;
    }

  
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
    return "Type= " + type + 
                "\n" + "Gender = " + gender +
                 "\n" + "Age = " + age +
                 "\n" + "Origin = " + origin +
                 "\n" + "Color = " + color +
                 "\n" + "Price = " + price+ "\n";   
    }
    
    
}
