package basic;

public class compute {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int s = 0;
        float f = 0.0f;

        s = a/b;
        f = a/(float)b;   //10.0과 3.0을 나눈 셈이 됨, '(float)a/b'로 해도 무방

        System.out.println("정수 나누기 결과 : " + s);
        System.out.println("실수 나누기 결과 : " + f);   // 3.333333을 3.33까지만 찍고 싶을 땐 printf
        System.out.printf("실수 나누기 결과 : %f %n", f);   // %f만 해도 얘를 실수로 찍어줌
                            // % 적을땐 +가 아니라 ,(콤바)로 찍어줘야
        System.out.printf("실수 나누기 결과 : %.2f", f); // 2자리 수까지만 출력
        // printf은 자동 줄넘기기 기능이 없어서 '%n' (or '\n')을 추가해야
        // 전체 범위 주석처리 ctrl + shit + /

        int i = 1_000_000_000, j = 2_000_000_000;
        long k = 8_000_000_000L, l = 9_000_000_000L;  // long 키인 l을 대문자 L로 바꿔줘야????


        System.out.printf("정수 더하기 결과 (int): %d %n", i+j);    // 이렇게 하면 오버플로우되서 - 뜸
        System.out.printf("정수 더하기 결과 (int): %d %n", (long)i+j); // so, 이렇게 해줘야됨
        System.out.printf("정수 더하기 결과 (long): %d %n", k+l);

        // 유니코드
        char c1 = '0', c2 = '2'; // 48 + 50 = 98   (*주의 - "0"으로 하면 안 됨)
        char c3 = 48, c4 = 50;
        short e = 32767; // short 표현가능 최대 글자수 32767 (char는 65536)

        System.out.printf("문자 더하기 결과 (char): %c %n", c1+c2);
        System.out.printf("문자 c (char): %c %n", 3);
        System.out.printf("문자 더하기 결과 (char): %c %n", c3+c4);
        System.out.printf("문자 short 숫자 더하기 결과 (int): %d %n", c3+e); //char + short -> int + int로 자동변환
        System.out.printf("short 숫자 더하기 결과 (int): %d %n", e+e);  //why? char와 short는 워낙 표현할 수 있는 범위가 적기 때문에

        // 계산식
        System.out.println(Math.round(3.1234567f)); // -> int로 반환
        System.out.println((int)3.1234567f); // -> 이렇게 간단하게 해도 상관x
        System.out.println(Math.round(3.12345678910d)); // -> long의 정수로 반환
        System.out.println((long)3.12345678910d);  // -> 이렇게 간단하게 해도 상관x

        //for문
        for(int h=1; h<=10; h++){
            System.out.println(Math.random());  // random은 double 타입
        }
        // 로또번호 생성기 (1~10사이의 수를 랜덤 생성) (스무고개 게임)
        for(int h=1; h<=10; h++){
            System.out.println((int)(Math.random() * 10) +1);
        }
        for(int h1=1; h1<=10; h1++){
            double h2 = Math.random();
            // 참고) %(출력지시자) -> 특수문자처럼 출력 형태를 지정해주는 기호
            System.out.printf(" %f ", h2);  // h2를 float로 출력하는데 문자열로 출력하라는 의미
            System.out.printf(" %d ", (int)(h2*5)); // 1부터 5사이의 숫자 랜덤생성
            System.out.println((int)(h2*46) + 1);
            System.out.printf(" %s %d %n", "1부터 46사이의 랜덤숫자는", (int)(h2 * 46) +1);
            // "1부터 46사이의 랜덤숫자는"라는 출력포맷을 문자열로 찍어라
            // "(int)(h2 * 46) +1"라는 출력포맷을 정수로 찍어라
            // %n(줄바꿈)은 대응되는 출력포맷이 없어도 잘 찍힌다.
        }

    }
}
