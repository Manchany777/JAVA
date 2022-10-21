package basic;

public class Circle {
    public int radius;   // 전역변수
    public String name;

    public Circle(int radius, String name) {   //public Circle - 원의 생성자 메소드, (int radius) - 지역변수
        this.radius = radius;
        this.name = name;
    }

    public double getArea() {    // 게더 함수 alt + insert (게더, 세터 함수를 자등올 만들어주는 함수)
        return 3.14 * radius * radius;
    }

    /*public  String getName(){ // 2.인스턴스의 이름을 리턴해 주는 메소드 생성
        return name;
    }*/

    public int getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }

    //-------------------------------------------------------------
    public void setRadius(int radius) {   // 세터 함수
        this.radius = radius;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//인스턴스 변수 name이 인스턴스 생성시 초기화 되도록 수정


