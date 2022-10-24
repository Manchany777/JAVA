package basic;             // 기본형 매개변수 - 함수 (read only)

class Data {
    int x;                // 인스턴스 변수 x
}
public class Parameter_test {
    public static void main(String[] args) {
        Data d = new Data();     // Data 객체를 가리키는 변수 d(참조형 변수) (like 데이터 타입)
        d.x = 10;
        change(d.x);                // 해봤자 안바뀜
        System.out.println("인스턴스변수 d.x ==>" + d.x);    // before = 10, after = 10
    }


    static void change(int x) { // static 메소드   d.x => 10이 매개변수로 전달
        x = 1000;               // x = 1000으로 변경
        System.out.println("지역변수 x ==>" + x);  // 지역변수
    }
}
