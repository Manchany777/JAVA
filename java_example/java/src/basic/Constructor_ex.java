package basic;

class New {
    int i;

    New(){
        i=10;
    }

    New(int i){
        this.i = i;
    }
}

class EasyCar {
    String color;
    String gearType;
    int door;
    int year;

/*    EasyCar(){ //("white", "manual", 5);
        this.color = "white";
        this.gearType = "manual";
        this.door = 5;
    }*/
    EasyCar() { // 기본생성자
        this("white", "manual", 5);
        year = 2022;
    }
    EasyCar(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class Constructor_ex {
    public static void main(String[] args) {
        // 자동차 객체를 기본생성자를 이용해서 생성한 후, 자동차를 참조하는 변수 c 에 객체의 주소를 저장한다.
//        EasyCar c = new EasyCar();
//        // 참조변수 c 의 인스턴스 변수 3 개에 각각 자동차의 색, 기어타입(auto, manual), 문의 갯수(1,2,3,4,5??) 를 초기화하시오.
//        c.color = "red";
//        c.gearType = "auto";
//        c.door = 4;


// 자동차 객체를 생성자를 이용해서 생성한 후, 자동차를 참조하는 변수 c1 에 객체의 주소를 저장한다.
        // 단 객체 생성시 인스턴스 변수의 초기값을 줄 것.
        EasyCar c1 = new EasyCar();
        EasyCar c2 = new EasyCar();
        EasyCar c3 = new EasyCar("white", "manual", 5);
        EasyCar c4 = new EasyCar("white", "manual", 5);
        EasyCar c5 = new EasyCar("white", "manual", 5);
        EasyCar c6 = new EasyCar("white", "manual", 5);
        EasyCar c7 = new EasyCar("white", "manual", 5);
        EasyCar c8 = new EasyCar("white", "manual", 5);
        EasyCar c9 = new EasyCar("white", "manual", 5);
        EasyCar c10 = new EasyCar("white", "manual", 5);


        EasyCar c11 = new EasyCar();
        EasyCar c12 = new EasyCar();
        EasyCar c13 = new EasyCar();
        EasyCar c14 = new EasyCar();
        EasyCar c15 = new EasyCar();
        EasyCar c16 = new EasyCar();
        EasyCar c17 = new EasyCar();
        EasyCar c18 = new EasyCar();
        EasyCar c19 = new EasyCar();
        EasyCar c20 = new EasyCar();

        System.out.println(c20.color);
        System.out.println(c10.color);
        System.out.println(c1.color);





/*        New n = new New();   // 기본생성자에 의해 인스턴스 변수 i 에 10이 들어감
        System.out.println(n.i);

        New m = new New(100); // 매개변수가 있는 생성자에 의해, 인스턴스 변수 i 에 인자로 넘겨진 100이 들어감
        System.out.println(m.i);*/
    }
}

