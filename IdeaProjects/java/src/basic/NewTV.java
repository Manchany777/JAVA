package basic;

public class NewTV {
    static int volt = 110;  // 스태틱 변수
    public String color = "";  // 인스턴스 변수
    public boolean power = true;
    public int channel = 100;



    static { volt = 220;}  // static 초기화
    public NewTV(String color, boolean power, int channel){    // 생성자(인스턴스 초기화)
       this.color = color;
       this.power = power;
       this.channel = channel;
    }
    public void power(){
        this.power = !power;       // ! -> toggle 연산자
    }
    public void channelDown(){
        channel--;
    }
    public void channelUp(){
        channel++;
    }
}
