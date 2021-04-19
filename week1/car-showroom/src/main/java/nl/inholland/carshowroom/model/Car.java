package nl.inholland.carshowroom.model;

public class Car {

    private long id;
    private String company;
    private String color;
    private double price;
    private String model;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(int id, String name, String color, double price, String model) {
        this.id = id;
        this.company = name;
        this.color = color;
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}
