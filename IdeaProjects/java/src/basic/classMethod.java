package basic;                     // 오버로딩 (다형성)

class MyMath {
    long a , b ;                  // 인스턴스 변수 생성

    long add(){                   // 인스턴스 메소드                  // 원래는 같은 이름의 변수 2개를 동시에 쓸 수 없다
        return a+b;
    }

    MyMath () {                  // 생성자
        a = 100;
        b = 200;
    }

    static long add(long a, long b) {           // 스태틱 메소드    // 매개변수가 없는 add와 매개변수가 있는 add는 별개로 취급
        return a+b;
    }
}

public class classMethod {
    public static void main(String[] args) {
        System.out.println(MyMath.add(2,3));

        MyMath m = new MyMath();
        System.out.println(m.add());
        System.out.println(m.add(2,3));

    }
}
