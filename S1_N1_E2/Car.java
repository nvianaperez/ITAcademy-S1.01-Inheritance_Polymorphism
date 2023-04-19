package S1_N1_E2;

public class Car {

    private static final String BRAND;
    private static String model;
    private final int POWER;

    static {
        BRAND = "Peugeot";
        model = "5008";
    }

    public Car(int power) {
        this.POWER = power;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public int getPOWER() {
        return POWER;
    }

    public static String getBrand() {
        return BRAND;
    }

    public static String brake() {
        return "El vehicle està frenant";
    }

    public String accelerate() {
        return "El vehicle està accelerant";
    }

    @Override
    public String toString() {
        return "Car{" +
                "POWER=" + POWER +
                "BRAND=" + BRAND +
                "MODEL=" + model +
                '}';
    }
}
