package advanced;

class Point{
    int x;
    int y;
    //기본생성자
    Point() {
        this(0,0);
    }
    //생성자(매개변수,매개변수)
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle extends Point{
    int r;
}

class S {
    int x;
    int y;
    S(){
        this.x = 10;
        this.y = 10;
    }
    S(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Circle2 extends Shape{
    Point xy ;
    int r;

    Circle2 (){
//        xy = new Point();
//        r = 10;
        this(new Point(),10);
    }

    Circle2 (Point xy, int r){
        this.xy = xy;
        this.r = r;
    }
}

class Shape {
    String color ;
    void draw(){
        System.out.println("도형을 그리는 중입니다.");
    }
}

class Triangle extends Shape {
    int edge = 3;
}

class Rectangle extends Shape{
    int edge = 4;
}

public class Inherit_ex {
    public static void main(String[] args) {


        Circle2 c2 = new Circle2();
        System.out.println("X좌표 : "+c2.xy.x);
        System.out.println("Y좌표 : "+c2.xy.y);
        c2.draw();

        //        Point p = new Point();
        //        Circle c = new Circle();
        //
        //        System.out.println(p.x + ":" + p.y );
        //        System.out.println(c.x + ":" + c.y );
        //        System.out.println(c.r);
        //
        //        Triangle t = new Triangle();
        //        t.draw();
    }
}
