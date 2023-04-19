package S1_N1_E2;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car(150);
        System.out.println(c1.getClass().getSimpleName());

        //because brake() method is static --> accessible only from the Class Car
        //all car objects brake the same way
        System.out.println(Car.brake());

        //because accelerate() method is instantiated --> accessible only from the object c1
        //every car objects can accelerate in a different way
        System.out.println(c1.accelerate());

        Car c2 = new Car(200);
        Car c3 = new Car(220);

        //because model attribute is static --> accessible from Car class, and all the objects have same model
        System.out.println(c2);
        System.out.println(c3);
        Car.setModel("2008");
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("El model de tots els cotxes és: "+Car.getModel());

        //because POWER attribute is final --> it can not be changed, and is accessible from car objects
        System.out.println("La potència del cotxe 2 és: "+c2.getPOWER()+" i la potència del cotxe 3 és: "+c3.getPOWER());

        //because BRAND attribute is final and static --> it can not be changed, accessible from Car class and car objects, and all the objects have same BRAND
        System.out.println(c2.getBrand());
        System.out.println(c3.getBrand());
        System.out.println(Car.getBrand());

    }



}
