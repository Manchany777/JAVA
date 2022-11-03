package basic;

class Init{
    static int cv = 1;     // 클래스 변수 선언
    int iv = 2;            // 인스턴스 변수 선언

    static { cv = 10; }    // 초기화 블록으로 클래스 변수 다시 초기화
    { iv = 20; }           // 초기화 블록으로 인스턴스 변수 다시 초기화

    Init() {             // 생성자를 이용하여 또 다시 초기화
        this.iv = 100;
    }

    int plus() {
        int a = 0, b = 0;      // 지역변수는 초기화 필수
        int sum = 0;
        sum = a + b;
        return sum;
    }

}


public class InitTest {
    public static void main(String[] args) {
        System.out.println(Init.cv);   // 클래스이름.클래스변수명
        Init init = new Init();
        System.out.println(init.iv);   // 레퍼런스변수명.인스턴스변수명
    }
}
