package advanced;

class Point {
    int x;
    int y;
    //--------------------------------------------------
    // 기본생성자
    Point () {
       this(0,0);
    }
    // 생성자(매개변수, 매개변수)
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    //--------------------------------------------------
}

class Cirlcle extends Point{
    int r;
}

/*class S {              // 아래를 위한 예시
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
}*/


class Circle2 extends Shape {
    Point xy;   // 레퍼런스 변수 xy의 주소 "new Point()"를 기본 생성자에 넣어줌
                // Point xy = new Point();
    int r;

    Circle2 (){
//        xy = new Point();
//        r = 10;
        this(new Point(),10);    // 기본 생성자를 부름

    }

    Circle2 (Point xy, int r){       // 레퍼런스 변수의 주소값을 넘긴 것
        this.xy = xy;
        this.r = r;

    }
}
//--------------------------------------------------
class Shape {
    String color;
    void draw() {
        System.out.println("도형을 그리는 중입니다.");
    }
}

class Triangle extends Shape {
    //--------------------------------------------------삼각형 만들기
    Point p1 = new Point(0,0);
    Point p2 = new Point(100,100);
    Point p3 = new Point(20,80);
    //--------------------------------------------------
    // String color;         // 부모와 값이 중복됨
    int edge = 3;
    // void draw() {}        // 부모와 값이 중복됨
}

class Triangle2 extends Shape {
    Point[] p;            // Array 참조변수 ---- 배열선언 (Point 라고 하는 객체를 원소로 가지는 배열변수 p)
    int edge = 3;         // 인스턴스 변수선언
    // 포인트 객체를 원소로 가지는 크기 3의 배열 선언하고 초기화하라. 이 때 인스턴스 변수는 생성자에 의해 초기화되도록 한다.
    Triangle2 () {
        this(new Point(0,0),new Point(100,100),new Point(20,80));
    }
    // 생성자(매개변수, 매개변수)
    Triangle2(Point p1, Point p2, Point p3){  // p1~p3 : 객체를 참조하는 변수
        this.p = new Point[] {p1, p2, p3};  // 배열 a = {1,2,3}
        //  1) int[] a = {1,2,3};            -> 생성과 동시에 초기화된 배열
        //        System.out.println(a.length)로 출력시 값 3이 나옴
        //  2) int[] a = new int[3];         ->생성만 하고 초기화 안된 배열
        //  3) int[] a = new int[]{1,2,3};  -> 생성과 초기값 지정한 배열 (1번+2번 방식)
    }
}

class Square extends Triangle{
    int edge = 4;
}

public class Inherit_ex {
    public static void main(String[] args) {
        Point p = new Point();
        Cirlcle c = new Cirlcle();  // basic 프로젝트의 Circle 파일과 혼동 주의

        System.out.println(p.x + ":" + p.y);

        System.out.println(c.x + ":" + c.y);    // 위와 아래는 동일한 값을 가지고 있는 것
        System.out.println(c.r);

        Triangle t = new Triangle();
        t.draw();

        Circle2 c2 = new Circle2();
        System.out.println("x좌표 : " + c2.xy.x);
        System.out.println("y좌표 : " + c2.xy.y);
        c2.draw();

        Triangle tr = new Triangle();
        tr.draw();
        System.out.println(tr.p3.x + ":" + tr.p3.y);

        Triangle2 tr2 = new Triangle2();
        tr2.draw();
        System.out.println(tr2.p[0].x + ":" + tr2.p[0].y);
    }
}
