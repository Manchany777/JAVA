package basic;

public class Polygon_ex {
    public static void main(String[] args) {

        // 인스턴스 생성, 단 생성시 몇각형으로 만들지 지정하시오.
//        Poly poly = new Poly(3);  <-> 아래와 같은 거
        Poly p1; // 레퍼런스 변수 생성, null
        p1 = new Poly(3); // Poly 설계도를 가지고 인스턴스 생성
                            // 레퍼런스 변수와 연결

        // 본인이 생성한 다각형의 정보를 출력하시오. (getter 함수 이용)
        System.out.println(p1.poly);
        System.out.println(p1.getPoly() + "각형입니다.");




        // 인스턴스 생성, 단 생성시 몇각형으로 만들지 지정하시오.
        Poly p2; // 레퍼런스 변수 생성, null
        p2 = new Poly(5); // Poly 설계도를 가지고 인스턴스 생성
        // 레퍼런스 변수와 연결

        // 본인이 생성한 다각형의 정보를 출력하시오. (getter 함수 이용)
        System.out.println(p2.poly);
        System.out.println(p2.getPoly() + "각형입니다.");

    }


}
