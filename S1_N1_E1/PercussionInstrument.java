package S1_N1_E1;

public class PercussionInstrument extends Instrument{

    private String model;

    //Instance code block outside of constructor
    {
        System.out.println("Bloc d'inicalització: comencem a crear instruments de "+this.getClass().getSimpleName());
    }
    public PercussionInstrument(String name, double price) {
        super(name, price);
    }
    //Instance code block
    {
        this.model = "tradicional";
        System.out.println("I am instance init() of model percussion: "+this.model);
    }

    @Override
    public String play() {
        return "Està sonant un instrument de percussió";
    }
}
