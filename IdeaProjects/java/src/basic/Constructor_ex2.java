package basic;


class EasyCar {             // this() 예시로 만든 간단한 자동차 코드
    String color;
    String gearType;
    int door;

//    EasyCar(){
//        this.color = "red";
//        this.gearType = "manual";
//        this.door = 4;
//    }   // 기본 생성자

    EasyCar() {
        this("red", "manual", 5);   // = EasyCar("red", "manual", 5);
        //year = 2022;    // 다른 변수를 쓰려면 this()에다 써라 (this()는 무조건 맨 앞에 써야함)
    }
    // 위의 2개는 동일한 내용 this() 함수의 법칙. 닥치고 외워라
    EasyCar(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class Constructor_ex2 {
    public static void main(String[] args) {


/*
        // 자동차 객체를 기본생성자를 이용해서 생성한 후, 자동차를 참조하는 변수 car에 객체의 주소를 저장한다.
        EasyCar car = new EasyCar();
        // 참조변수 c의 인스턴스 변수 3개에 각각 자동차의 색, 기어타입(auto,manual), 문의 개수(1,2,3,4,5??)를 초기화 하시오
        car.color = "blue";
        car.gearType = "auto";
        car.door = 3;
*/



/*        // 자동차 객체를 기본생성자를 이용해서 생성한 후, 자동차를 참조하는 변수 car1에 객체의 주소를 저장한다.
        // 단, 객체 생성시 인스턴스 변수의 초기값을 줄 것
        EasyCar car1 = new EasyCar("red", "manual", 4);


        // 각 객체의 멤버에 접근해서 값을 출력하시오.
        System.out.println(car.color);
        System.out.println(car1.color);*/


        EasyCar car1 = new EasyCar();
        EasyCar car2 = new EasyCar("red", "manual", 4);
        EasyCar car3 = new EasyCar("red", "manual", 4);
        EasyCar car4 = new EasyCar("red", "manual", 4);
        EasyCar car5 = new EasyCar("red", "manual", 4);
        EasyCar car6 = new EasyCar("red", "manual", 4);
        EasyCar car7 = new EasyCar("red", "manual", 4);
        EasyCar car8 = new EasyCar("red", "manual", 4);
        EasyCar car9 = new EasyCar("red", "manual", 4);


        EasyCar car10 = new EasyCar();
        EasyCar car11 = new EasyCar();
        EasyCar car12 = new EasyCar();
        EasyCar car13 = new EasyCar();
        EasyCar car14 = new EasyCar();
        EasyCar car15 = new EasyCar();
        EasyCar car16 = new EasyCar();
        EasyCar car17 = new EasyCar();
        EasyCar car18 = new EasyCar();
        EasyCar car19 = new EasyCar();
        EasyCar car20 = new EasyCar();

        System.out.println(car20.color);
        System.out.println(car10.color);
        System.out.println(car1.color);
    }
}

