package basic;

public class Poly { // 클래스 정의
    // 멤버 변수 1개 정의 ==> 설계
    public int poly ;

    // 생성자 정의 ==> 자동완성
    public Poly (int poly) {
        if(poly < 3) {
            this.poly = -1;
        } else {
            this.poly  = poly;
        }
    }

    // 게터 함수 정의 ==> 자동완성
    public int getPoly(){
        return poly;
    }

    public void setPoly(int poly) {
        if(poly < 3) {
            this.poly = -1;
        } else {
            this.poly  = poly;
        }
    }
}
