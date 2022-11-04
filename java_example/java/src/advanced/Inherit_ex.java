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
    Point p1 = new Point(0,0);
    Point p2 = new Point(100,100);
    Point p3 = new Point(20,80);
    int edge = 3;
}

class Triangle2 extends Shape {
    // 포인트 객체를 원소로 가지는 크기 3의 배열 선언하고 초기화하라.  이 때 인스턴스 변수는 생성자에 의해 초기화되록 한다.
    Point[] p ; // Array 참조변수
    int edge = 3;

    Triangle2(){
        this(new Point(0, 0),new Point(100, 100),new Point(20, 80));
    }

    Triangle2(Point p1, Point p2, Point p3) { // p1~p3 : 객체를 참조하는 변수
        p = new Point[]{p1, p2, p3};
    }
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

        Triangle tr = new Triangle();
        tr.draw();
        System.out.println(tr.p3.x + ":" + tr.p3.y);

        Triangle2 tr2 = new Triangle2();
        tr2.draw();
        System.out.println(tr2.p[0].x + ":" + tr2.p[0].y);

        // 1) int[] a = {1,2,3}      2) int[] a = new int[3];
        int[] a = new int[]{1,2,3}; // 생성과 초기값 지정한 배열
        int[] b = new int[3]; // 생성만 하고 초기화 안된 배열
        int[] c = {1,2,3};// 생성과 동시에 초기화된 배열

        System.out.println(a.length);
    }
}
