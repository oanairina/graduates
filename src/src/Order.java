package src;

import java.util.List;

public class Order {

    private List<Animal> listaAnimal;
    private List<Food> listaFood;
    private List<Accessories> listaAccessories;

    public Order(List<Animal> listaAnimal, List<Food> listaFood, List<Accessories> listaAccessories) {
        this.listaAnimal = listaAnimal;
        this.listaFood = listaFood;
        this.listaAccessories = listaAccessories;
    }

    public List<Animal> getListaAnimal() {
        return listaAnimal;
    }

    public void setListaAnimal(List<Animal> listaAnimal) {
        this.listaAnimal = listaAnimal;
    }

    public List<Food> getListaFood() {
        return listaFood;
    }

    public void setListaFood(List<Food> listaFood) {
        this.listaFood = listaFood;
    }

    public List<Accessories> getListaAccessories() {
        return listaAccessories;
    }

    public void setListaAccessories(List<Accessories> listaAccessories) {
        this.listaAccessories = listaAccessories;
    }

    @Override
    public String toString() {
        StringBuilder mesaj = new StringBuilder("Order: " + "\n" + "Pets: ");
        if (listaAnimal != null) {
            for (Animal a : listaAnimal) {
                mesaj.append(a.toString());
                mesaj.append("\n");
            }
        }
        mesaj.append("\n" + "Food: ");
        if (listaFood != null) {
            for (Food f : listaFood) {
                mesaj.append(f.toString());
                mesaj.append("\n");
            }
        }
        mesaj.append("\n" + "Accessories: ");
        if (listaAccessories != null) {
            for (Accessories a : listaAccessories) {
                mesaj.append(a.toString());
                mesaj.append("\n");
            }
        }
        return mesaj.toString();
    }
}
