package basic;

class Data2 {
    int x;
    static int y;

    static int getY() {
        return y;
    }
}

public class Parameter_test2 {
    public static void main(String[] args) {
        System.out.println(Data2.y);
        System.out.println(Data2.getY());

        System.out.println(Math.random());
        Data2 d = new Data2();
        d.x = 10;
        change(d);
        System.out.println("인스턴스변수 d.x ==> " + d.x); // before = 10, after = 10
    }

    static void change(Data2 d){  // d이 인스턴스객체의 주소값이 매개변수로 전달
        d.x = 1000; // x = 1000 으로 변경
        System.out.println("매개변수로 넘어온 참조변수.x ==> " + d.x);
    }
}
