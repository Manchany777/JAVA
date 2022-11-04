package basic;

class MyMath {
    long a , b;

    long add() {
        return a+b;
    }
    MyMath () {
        a = 100;
        b = 200;
    }
    static long add(long a , long b){
        return a+b;
    }
}

public class classMethod {
    public static void main(String[] args) {
        System.out.println(MyMath.add(2L,3L));

        MyMath m = new MyMath();
        System.out.println(m.add());
        System.out.println(m.add(m.a,m.b));

        System.out.println(m.add(200,200));



        System.out.println();
        System.out.println();

    }
}
