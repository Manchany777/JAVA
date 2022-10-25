package advanced;

class Parent {
    int x;

    Parent(){
        x = 10;
    }
}

class Child extends Parent {
    int x;

    Child(){                 // 기본 생성자
        super.x = 10;      // 모든 생성자에서 맨 위로 와야함 (this() 보다도 더 위에)
        this.x = 20;
    }

    void method() {
        System.out.println("x= " + x);                // x
        System.out.println("this.x= " + this.x);      // 나 자신(x)
        System.out.println("super.x= " + super.x);    // 조상 (Parent)
    }
}

class Child2 extends Parent {
    void method() {
        System.out.println("x= " + x);                // x
        System.out.println("this.x= " + this.x);      // 나 자신(x)
        System.out.println("super.x= " + super.x);    // 조상 (Parent)
    }
}


public class Super_This_ex {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
        Child2 c2 = new Child2();
        c2.method();
    }
}
