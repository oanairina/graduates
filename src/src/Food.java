package src;

import java.io.Serializable;

public class Food implements Serializable{

    private String name;
    private double price;
    private String producer;
    private double weight;
    private String description;

    public Food(String name, double price, String producer, double weight, String description) {
        this.name = name;
        this.price = price;
        this.producer = producer;
        this.weight = weight;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + "\n" + "Producer: " + producer
                + "\n" + "Price: " + price
                + "\n" + "Weight: " + weight
                + "\n" + "Description: " + description + "\n";
    }
}
