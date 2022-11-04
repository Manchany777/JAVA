package basic;

public class Circle {
    public int radius;
    public String name;

    public Circle(int radius, String name) { // 1. 인스턴스 변수 name 이 인스턴스 생성시 초기화 되도록 수정
        this.radius = radius;
        this.name = name;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

//    public String getName() {     // 2. 인스턴스의 이름을 리턴해주는 메소드 생성 와 자동생성~~
//        return name;
//    }

    public int getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }

    // setter 자동생성
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setName(String name) {
        this.name = name;
    }
}
