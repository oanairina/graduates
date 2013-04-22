package src;

import java.util.HashSet;

public class CatBuilder extends AnimalBuilder {

    private Cat cat;

    @Override
    public AnimalBuilder buildAnimal() {
        this.cat = new Cat();
        return this;
    }

    @Override
    public Animal getAnimal() {
        return cat;
    }

    @Override
    public AnimalBuilder withGender(String gender) {
        cat.setGender(gender);
        return this;
    }

    @Override
    public AnimalBuilder withAge(int age) {
        cat.setAge(age);
        return this;
    }

    @Override
    public AnimalBuilder withOrigin(String origin) {
        cat.setOrigin(origin);
        return this;
    }

    @Override
    public AnimalBuilder withColor(String[] color) {
        cat.setColor(new HashSet<String>());
        for (String s : color) {
            cat.addColor(s);
        }
        return this;
    }

    @Override
    public AnimalBuilder withPrice(double price) {
        cat.setPrice(price);
        return this;
    }

    @Override
    public AnimalBuilder withWeight(int weight) {
        cat.setWeight(weight);
        return this;
    }

    @Override
    public AnimalBuilder withType(String type) {
        cat.setType(type);
        return this;
    }
}
