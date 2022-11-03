package advanced;      // 최상위 상속값 Object

import java.util.Arrays;

class Tv extends Object {    // = class Tv
    boolean power;          // 인스턴스 변수 생성
    int volume;
    int channel;
    void  power() {         // 메소드 생성
        power = !power;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "power=" + power +
                ", volume='" + volume +
                ", channel=" + channel +
                '}';
    }
}

class SmartTv extends Tv {
    String s1 = "Netflix";
    String s2 = "AmazonPrime";
    void internet(){
        System.out.println("인터넷을 사용합니다.");
    }

    @Override
    public String toString() {
        return "SmartTv{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }
}

public class Inherit_ex2 {
    public static void main(String[] args) {
        Tv tv = new Tv();
        Object o = new Object();
        System.out.println(tv.toString());   // tv라고 하는 레퍼런스 변수의 주소값 = System.out.println(tv);
        System.out.println(tv);              // 객체처럼 보여줌

        int[] a = new int[] {10,20,30};
        System.out.println(Arrays.toString(a));       // 배열처럼 깔끔하게 보여줌


        //----------------------------------------------------------
        SmartTv s = new SmartTv();
        System.out.println(s);
        System.out.println(s.toString());
    }
}
