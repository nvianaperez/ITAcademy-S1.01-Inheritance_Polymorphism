package S1_N2_E1;

public class Telephone {

    private String brand;
    private String model;

    public Telephone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void phone(String telephoneNumber) {
        System.out.println("S'està trucant al número de telèfon: "+telephoneNumber);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
