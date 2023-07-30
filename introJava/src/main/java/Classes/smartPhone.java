package Classes;

public class smartPhone {
    private String brand = "samsung";
    private String model = "s10";
    private double price = 1000.00;
    public smartPhone(){
        brand = "samsung";
        model = "s10";
        price = 1000.00;
    }
    public smartPhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }


    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
}
