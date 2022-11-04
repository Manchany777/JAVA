package basic;

public class tv_ex {
    public static void main(String[] args) {
        NewTv t = new NewTv("black", false, 0);
        NewTv t2 = new NewTv("red", false, 0);

        System.out.println(t);
        System.out.println(t2);

        t2 = t;
        t.channel = 100;

        System.out.println(t);
        System.out.println(t2);
        System.out.println(t.channel);
        System.out.println(t2.channel);

        /*System.out.println(t.power);
        System.out.println(t.color);
        System.out.println(t.channel);
        t.power();
        System.out.println(t.power);
        t.channelUp();
        t.channelUp();
        t.channelUp();
        System.out.println(t.channel);
        t.channel = 15;
        t.channelDown();
        System.out.println(t.channel);*/
    }
}
