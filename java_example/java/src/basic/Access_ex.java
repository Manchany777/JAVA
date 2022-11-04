package basic;

class Sample {
    public int a;
    private int b;
    int c;
}

public class Access_ex {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.a = 10;
        //s.b = 10;  // private 은 다른 클래스에서 접근 불가
        s.c = 10;
    }
}
