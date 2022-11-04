package basic;

class Blueprint{
    static int cnt = 0;
    private int count = 0;

    Blueprint(){
        cnt++;
        // 변수의 값 증가
        count = cnt;
    }

    public int getCount() {
        return count;
    }
}

public class InstanceCount {
    public static void main(String[] args) {
        Blueprint p1 =  new Blueprint();
        Blueprint p3 =  new Blueprint();
        Blueprint p4 =  new Blueprint();
        Blueprint p5 =  new Blueprint();
        Blueprint p2 =  new Blueprint();

        System.out.println(Blueprint.cnt + "개의 제품이 생성되었습니다.");
        System.out.println(p3.getCount() + "번째 제품입니다.");
    }
}
