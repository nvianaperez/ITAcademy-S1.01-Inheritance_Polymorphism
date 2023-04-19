package S1_N2_E1;

public class Smartphone extends Telephone implements Camera, Watch {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void photograph () {
        System.out.println("S'està fent una foto");
    }

    @Override
    public void alarm() {
        System.out.println("Està sonant l'alarma");
    }
}
