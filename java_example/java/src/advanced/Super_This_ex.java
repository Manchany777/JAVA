package advanced;

class Parent{
    int x ;

    Parent(){
        x = 10;
    }
}

class Child extends Parent {
    int x ;

    Child(){

        //super();
        this.x = super.x;
        super.x = 10;

    }
    void method(){
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}

class Child2 extends Parent {
    void method(){
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
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
