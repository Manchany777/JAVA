package basic;

import org.w3c.dom.ls.LSOutput;

class Init {
    // 데이터타입이 정수형인 클래스 변수 cv 를 선언하고 명시적 초기화를 통해 초기값을 1 로 넣으시오.
    static int cv ;
    // 데이터타입이 정수형인 인스턴스 변수 iv 를 선언하고 명시적 초기화를 통해 초기값을 2로 넣으시오.
    int iv;

    // 초기화 블록을 이용하여 클래스변수와 인스턴스 변수를, cv 는 10으로, iv는 20으로 , 각각 초기화하시오.
    //static { cv = 10; }
    //{ iv = 20; }

    // 생성자를 이용하여 인스턴스 변수 iv 를 100으로 초기화하시오.
    Init(){
        //this.iv = 100;
    }

    int plus(){
        int a = 0, b = 0;
        int sum = 0;
        sum = a + b;
        return sum;
    }

}



public class InitTest {
    public static void main(String[] args) {
        System.out.println(Init.cv);
        Init init = new Init();
        System.out.println(init.iv);
    }

}
