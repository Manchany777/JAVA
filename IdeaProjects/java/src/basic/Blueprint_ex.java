package basic;

class Blueprint {
    static int cnt = 0;
    int count = 0;

    Blueprint () {
        cnt++;  // 변수의 값 증가
        count = cnt;
    }
}

public class Blueprint_ex {
    public static void main(String[] args) {
        Blueprint B1 = new Blueprint();
        Blueprint B2 = new Blueprint();
        Blueprint B3 = new Blueprint();
        Blueprint B4 = new Blueprint();
        Blueprint B5 = new Blueprint();


        System.out.println(Blueprint.cnt + " 개의 제품이 생성되었습니다.");  // 클래스명.클래스변수명
        System.out.println(B3.count + " 번째 제품입니다.");                // 레퍼런스변수명.인스턴스변수명
    }
}
