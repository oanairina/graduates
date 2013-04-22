package src;

public abstract class AnimalBuilder {

    public abstract AnimalBuilder buildAnimal();

    public abstract AnimalBuilder withType(String type);

    public abstract AnimalBuilder withGender(String gender);

    public abstract AnimalBuilder withAge(int age);

    public abstract AnimalBuilder withOrigin(String origin);

    public abstract AnimalBuilder withColor(String[] color);

    public abstract AnimalBuilder withPrice(double price);

    public abstract AnimalBuilder withWeight(int weight);

    public abstract Animal getAnimal();
}
