package Test;

// upcasting, downcasting 과 instanceof 예제   v1.0
// 사용자의 요청에 의해 FireEngine 클래스 기능 추가함  v1.1 -- 2022.10-26 by 박보경
// car 클래스를 상속하여 .... 를 만들었고, casting 해보는 예제
/**
 * car 클래스
 */
class Car {
    int door;
    void drive(){
        System.out.println("drive");
    }
    void stop(){
        System.out.println("stop");
    }
}

/* v1.1 */
class FireEngine extends Car {
    void water(){
        System.out.println("water");
    };
}

class Ambulance extends Car{
    void siren(){
        System.out.println("siren");
    };
}

public class Casting_ex {
    public static void main(String[] args) {
        Car car = new Car();
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        Car car2 = new Car();
        Ambulance a = new Ambulance();
        Ambulance a2 = null;

        car2 = (Car)a;
        //car2.siren();
        a2 = (Ambulance)car2;
        a2.siren();
        a2.drive();


        car = (Car)fe; // 자손->조상, upcasting 의 경우에는 형변환 생략가능
        fe.water();
        fe.drive();
        car.drive();
        //car.water(); // Car 에 있던 기능만 사용 가능, water 사용 불가능

        fe2 = (FireEngine) car; // 조상->자손, downcasting의 경우는 생략불가
        fe2.water();  //  car 에 없던 water 사용 가능

        FireEngine f ;
        //Ambulance a;
        Car car1 = new Car();
        //car1 = (Car)a; // 선언만하고 인스턴스 생성안하면 형변환을 할 수 없다.

        Ambulance am = new Ambulance();
        //Car car2;
        car1 = (Car)am; // 선언과 인스턴스 생성안하면 형변환을 할 수 없다.
        car1.drive();
        //car1.siren();

        if (fe instanceof Car ){
            System.out.println("This is a Car instance");
        }
        if (am instanceof Car ){
            System.out.println("This is a Car instance");
        }
        if (fe instanceof FireEngine ){
            System.out.println("This is a FireEngine instance");
        }
        if (car instanceof Object){
            System.out.println("This is an Object instance");
        }

        method(fe);
        method(am);
        method(car1);
    }

    public static void method(Object obj) {
        if (obj instanceof FireEngine) {
            FireEngine f = (FireEngine) obj;
            f.water();
        } else if (obj instanceof Ambulance) {
            Ambulance a = (Ambulance) obj;
            a.siren();
        } else if (obj instanceof Car) {
            Car c = (Car) obj;
            c.drive();
        }
    }
}
