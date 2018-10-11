package app;

import org.bson.types.ObjectId;

public class Drink
{
    private ObjectId id;
    private String name;
    private double price;

    public Drink() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Drink{" +
                "objectId=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
