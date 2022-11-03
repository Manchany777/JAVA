package advanced;

class Time {
    int hour;
    int minute;
    int second;
}

public class Array_Class_ex {
    public static void main(String[] args) {
        Time a = new Time();  // Time 클래스를 하나만 가짐
        System.out.println(a.hour + a.minute + a.second);

        Time[] t = new Time[3]; // Time 클래스를 배열의 원소수만큼 가짐
        t[0] = new Time(); // 배열의 주소를 객체를 가리키도록 객체를 생성
        t[1] = new Time();
        t[2] = new Time(); // 객체를 3번 만든 것과 마찬가지 (마치 Time a = new Time(); x3 한것과 같은 효과!)

        System.out.println(t[0].hour + t[0].minute + t[0].second);
    }
}
