package S1_N1_E1;

public class WindInstrument extends Instrument{

    //Instance code block outside of constructor
    {
        System.out.println("Bloc d'inicalització: comencem a crear instruments de "+this.getClass().getSimpleName());
    }
    public WindInstrument(String name, double price) {

        super(name, price);
        {
            System.out.println("Bloc d'inicalització: comencem a crear instruments de "+this.getClass().getSimpleName());
        }
    }

    @Override
    public String play() {
        return "Està sonant un instrument de vent";
    }

}
