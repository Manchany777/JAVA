package basic;

public class class_example {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "동그라미"); // 3. 수정된 생성자 에 맞게 인스턴스 생성하도록 수정

        System.out.println(circle.getArea());

        // setter 를 이용해 instance변수를 지정
        circle.setName("피자");
        circle.setRadius(3);

        // getter 를 이용해 instance변수를 가져옴
        System.out.println(circle.getName());
        System.out.println(circle.getName()); // 4. circle instance의 이름을 출력하시오.
    }
}

