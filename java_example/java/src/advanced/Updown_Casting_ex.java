package advanced;

class Car {
    int door;
    void drive(){
        System.out.println("Drive");
    }
}
class Fireengine extends Car {
    void water(){
        System.out.println("Water");
    }
}

class Ambulance extends Car {
    void siren(){
        System.out.println("Siren");
    }
}

public class Updown_Casting_ex {
    public static void main(String[] args) {
        Car c = new Car();

        Fireengine f = new Fireengine();
        Fireengine fe2 = null;

        Ambulance a = new Ambulance();

    }
}
