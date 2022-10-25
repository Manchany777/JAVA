package basic;                 // 참조형 매개변수 - 객체 (read & write)(실제 그 주소로 넘어가서 바꿔버림)

class Data2 {
    int x;
    static int y;   // 클래스 변수
    static int getY(){  // 클래스 메소드 (둘 다 인스턴스 생성하지 않아도 사용 가능)
        return y;
    }
}
public class Parameter_test2 {
    public static void main(String[] args) {
        System.out.println(Data2.y);
        System.out.println(Data2.getY());

        System.out.println(Math.random());    // Math는 자바도 자바스크립트도 둘 다 static (클래스 메소드)

        Data2 d = new Data2();     // Data2 객체를 가리키는 변수 d(참조형 변수) like 데이터 타입
        d.x = 10;
        change(d);                // 해봤자 안바뀜
        System.out.println("인스턴스변수 d.x ==>" + d.x);    // before = 10, after = 10
    }


    static void change(Data2 d) { // d라고 하는 인스턴스객체의 주소값이 매개변수로 전달
        d.x = 1000;               // x = 1000으로 변경
        System.out.println("매개변수로 넘어온 참조변수.x ==>" + d.x);  // 지역변수
        System.out.println("인스턴스변수 d.x ==>" + d.x); // 인스턴트 변수 (지역변수 x가 1000으로 변경되나, 인스턴스 변수는 변하지 않음)
    }
}
