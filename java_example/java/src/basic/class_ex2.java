package basic;

public class class_ex2 {
        public static void main(String[] args) {
            TV tv = new TV(3,10); // 1. 인스턴스 생성


            // setter 를 이용해 instance변수를 지정
            tv.setPower(true);

            // getter 를 이용해 instance변수를 가져옴
            System.out.println(tv.getChannel());
            System.out.println(tv.getVolume()); // 4. circle instance의 이름을 출력하시오.
            // setter 를 이용해 instance변수를 지정
            tv.setChannel(7);
            tv.setVolume(15);
            // getter 를 이용해 instance변수를 가져옴
            System.out.println(tv.getChannel());
            System.out.println(tv.getVolume());

            tv.setMute();
            tv.setPower(false);

        }

}
