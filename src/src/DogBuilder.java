package src;

import java.util.HashSet;

public class DogBuilder extends AnimalBuilder {

    private Dog dog;

    @Override
    public AnimalBuilder buildAnimal() {
        this.dog = new Dog();
        return this;
    }

    @Override
    public Animal getAnimal() {
        return dog;
    }

    @Override
    public AnimalBuilder withGender(String gender) {
        dog.setGender(gender);
        return this;
    }

    @Override
    public AnimalBuilder withAge(int age) {
        dog.setAge(age);
        return this;
    }

    @Override
    public AnimalBuilder withOrigin(String origin) {
        dog.setOrigin(origin);
        return this;
    }

    @Override
    public AnimalBuilder withColor(String[] color) {
        dog.setColor(new HashSet<String>());
        for (String s : color) {
            dog.addColor(s);
        }
        return this;
    }

    @Override
    public AnimalBuilder withPrice(double price) {
        dog.setPrice(price);
        return this;
    }

    @Override
    public AnimalBuilder withWeight(int weight) {
        dog.setWeight(weight);
        return this;
    }

    @Override
    public AnimalBuilder withType(String type) {
        dog.setType(type);
        return this;
    }
}
