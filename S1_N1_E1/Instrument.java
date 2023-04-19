package S1_N1_E1;

public abstract class Instrument {
    private String name;
    private double price;

    public Instrument(String name, double price) {
        setName(name);
        setPrice(price);
    }

    //Static block --> Must be executed once when class is loaded
    static {
        System.out.println("Bloc estàtic a la classe Instrument");
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

    protected abstract String play();


    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
