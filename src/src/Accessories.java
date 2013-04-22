package src;

import java.io.Serializable;

public class Accessories implements Serializable {

    private String name = null;
    private String description = null;
    private String producer = null;
    private double price = 0;
    
    public Accessories(){
        
    }

    public Accessories(String name, String description,  double price, String producer) {
        this.name = name;
        this.description = description;
        this.producer = producer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + "\n" + "Producer: " + producer
                + "\n" + "Price: " + price
                + "\n" + "Description: " + description + "\n";
    }
}
