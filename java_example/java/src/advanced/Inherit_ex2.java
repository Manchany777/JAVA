package advanced;

import java.util.Arrays;

class Tv extends Object{
    boolean power;
    int volume;
    int channel;
    void power(){
        power =  !power;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "power=" + power +
                ", volume=" + volume +
                ", channel=" + channel +
                '}';
    }
}

class SmartTv extends Tv {
    String s1 = "Netflix";
    String s2 = "Tving";
    void internet(){
        System.out.println("인터넷을 사용합니다.");
    }

    @Override
    public String toString() {
        return "SmartTv{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", power=" + power +
                ", volume=" + volume +
                '}';
    }
}

public class Inherit_ex2 {
    public static void main(String[] args) {
        Tv tv = new Tv();
        Object o = new Object();
        System.out.println(tv);

        int[] a = new int[]{10,20,30};
        System.out.println(Arrays.toString(a));

        SmartTv s = new SmartTv();
        System.out.println(s);
        System.out.println(s.toString());
    }
}
