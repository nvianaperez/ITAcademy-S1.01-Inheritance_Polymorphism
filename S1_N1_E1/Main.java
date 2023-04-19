package S1_N1_E1;

public class Main {

    public static void main(String[] args) {

        Instrument trombon = new WindInstrument("trombón", 102.50);
        System.out.println(trombon);
        System.out.println(trombon.play());

        Instrument violi = new StringInstrument("violín", 220.40);
        System.out.println(violi);
        System.out.println(violi.play());

        Instrument tabal = new PercussionInstrument("tabal", 85);
        System.out.println(tabal);
        System.out.println(tabal.play());

    }
}
