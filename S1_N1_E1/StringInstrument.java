package S1_N1_E1;

public class StringInstrument extends Instrument {

    public StringInstrument(String name, double price) {
        super(name, price);
        //Instance code block inside of constructor
        {
            System.out.println("Bloc d'inicalització: comencem a crear instruments de "+this.getClass().getSimpleName());
        }
    }

    @Override
    public String play() {
        return "Està sonant un instrument de corda";
    }
}
