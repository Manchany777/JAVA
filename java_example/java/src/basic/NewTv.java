package basic;

public class NewTv {
    static int volt = 110;
    public String color = "";
    public boolean power = true;
    public int channel =100;

    static { volt = 220;}
    public NewTv(String color, boolean power, int channel ){
        this.color = color;
        this.power = power;
        this.channel = channel;
    }
    public void power(){
        power = !power;
    }

    public void channelDown(){
       channel--;
    }

    public void channelUp(){
        channel++;
    }
}
