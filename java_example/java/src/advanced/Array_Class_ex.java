package advanced;

class Time {
    int hour;
    int minute;
    int second;
}

public class Array_Class_ex {
    public static void main(String[] args) {
        Time a = new Time();
        System.out.println(a.hour + a.minute + a.second);

        Time[] t = new Time[3];
        t[0] = new Time();
        t[1] = new Time();
        t[2] = new Time();

        System.out.println(t[0].hour + t[0].minute + t[0].second);
    }
}
