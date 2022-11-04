package basic;

class Over {
    // Over(){ } 컴파일러가 추가해서 Overload_ex.class 에 만든다.
    static void prn(){
        System.out.println("prn");
    }
    static void prn(int i){
        System.out.println("prn" + i);
    }
    static void prn(char c){
        System.out.println("prn" + c);
    }
    static void prn(long l){
        System.out.println("prn" + l);
    }
}

public class Overload_ex {
    public static void main(String[] args) {
        Over.prn();
        Over.prn(3);
        Over.prn('c');
        Over.prn(200000000000L);
    }
}
