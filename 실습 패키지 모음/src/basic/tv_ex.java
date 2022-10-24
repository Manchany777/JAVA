package basic;

public class tv_ex {  // 자바 파일명과 똑같은 클래스명 하나는 존재해야함
    public static void main(String[] args) {
        NewTV t, t2;
        t = new NewTV("black", false, 0);
        t2 = new NewTV("red", false, 0);
        System.out.println(t);
        System.out.println(t2);

        t2 = t;
        t.channel = 100;

        System.out.println(t);
        System.out.println(t2);
        System.out.println(t.channel);
        System.out.println(t2.channel);



       /* System.out.println(t.power);
        System.out.println(t.color);
        System.out.println(t.channel);
        t.power();
        t.channelUp();
        t.channelUp();
        t.channelUp();
        System.out.println(t.channel);
        t.channel = 15;
        t.channelDown();
        System.out.println(t.channel);*/

    }
}
