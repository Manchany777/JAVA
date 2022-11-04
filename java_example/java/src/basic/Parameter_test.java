package basic;

class Data {
    int x;
}
public class Parameter_test {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        change(d.x);
        System.out.println("인스턴스변수 d.x ==> " + d.x); // before = 10, after = 10
    }

    static void change(int x){  // d.x => 10 이 매개변수로 전달
        x = 1000; // x = 1000 으로 변경
        System.out.println("지역변수 x ==> " + x);
    }
}
