package basic;

public class compute {
    public static void main(String[] args) {
       /* int a = 10;
        int b = 3;

        int s = 0 ;
        float f = 0.0f;

        s = a/b;
        f = (float)a/(float)b;

        System.out.println("정수 나누기 결과 : " + s);
        System.out.println("실수 나누기 결과 : " + f);
        System.out.printf("실수 나누기 결과 : %f %n", f);
        System.out.printf("실수 나누기 결과 : %.2f ", f);*/

/*        int i = 1_000_000_000 , j = 2_000_000_000;
        long k = 8_000_000_000L , l = 9_000_000_000L ;

        System.out.printf("정수 더하기 결과 (int) => (long) 형변환: %d %n" ,(long)i + j);
        System.out.printf("정수 더하기 결과 (int): %d %n" ,i+j);
        System.out.printf("정수 더하기 결과 (long): %d", k+l);*/

      /*  char c1 = '0' , c2 = '2'; // 48 + 50 = 98
        char c3 = 48 , c4 = 50 ;
        short i = 32767 ; // 32767

        System.out.printf("문자 더하기 결과 (char): %c %n", c1+c2);
        System.out.printf("문자 c (char): %c %n", c3);
        System.out.printf("문자 더하기 결과 (char): %c %n", c3+c4);
        System.out.printf("문자와 short 숫자 더하기 결과 (int): %d", c3+i);
        System.out.printf("short 숫자 더하기 결과 (int): %d", i + i);*/

 /*       System.out.println(Math.round(3.12345678f));
        System.out.println((int)3.12345678f);
        System.out.println(Math.round(3.123456789012341234d));
        System.out.println((long)3.123456789012341234d);*/
// 1 ~ 46 로또번호 생성기
// 1~10 사이의 수를 랜덤 생성
// 스무고개 게임
        for(int i=1; i<=100; i++){
            double d = Math.random();
            System.out.printf(" %f ", d);
            System.out.printf(" %d " , (int)(d*46));
            System.out.printf(" %s  %d %n", "1부터 46사이의 랜덤숫자는 ", (int)(d * 46) + 1);
        }

    }
}
