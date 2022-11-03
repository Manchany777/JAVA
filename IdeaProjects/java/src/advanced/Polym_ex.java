package advanced;


class TV {
    boolean power = false;
    int channel = 0;
    int volume = 0;
}

class SmartTV extends TV {
    String service = "Netflix";
}

class CaptionTV extends TV {
    String input = "Caption";
}

public class Polym_ex {
    public static void main(String[] args) {
        TV ts = new TV();
        TV tc = new CaptionTV();

        System.out.println(ts.power);
        //System.out.println(tc.input); // (x)

        //SmartTV s = new CaptionTV(); // (x)
    }
}
