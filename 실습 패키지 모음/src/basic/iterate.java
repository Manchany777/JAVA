package basic;

import java.util.Scanner;

public class iterate {
    public static void main(String[] args) {
        /*int i;
        for(i=0; i<10; i++){
            System.out.println(i);
        }
        for(i=10; i>=1; i--) {
            System.out.println(i);
        }
*/
        // 1부터 10까지 합계 sum을 구하는 프로그램 작성
        // for문과 while 둘 다 작성해보기
        int h;
        int sum = 0;
        sum += 1;
        sum += 2;
        sum += 3;
        sum += 4;
        sum += 5;
        sum += 6;
        sum += 7;
        sum += 8;
        sum += 9;
        sum += 10;
        System.out.println(sum);

        h = 1;
        sum = 0;
        for (h=0; h<=10; h++) {
            sum += h; //1부터 10까지 합계 sum을 구하기
        }
        System.out.println(sum);

        h = 1;   // 초기화
        sum = 0; // for 반복문과 겹치기때문에 초기화를 안시켜주면 for문값 11이 그대로 내려와서 while문은 11부터 시작하게 된다.
                 //  (지역변수는 반드시 초기화해야)
        while(h<=10){ // 반복을 10번 하기 위한 조건식 넣기
            sum += h; // 반복을 10번 하기 위한 조건식 넣기
            h++; // 증가식 적기
        }
        System.out.println(sum);

        // do while문
        sum = 0;
        while(h<=10){
            sum += h;
            h++;
        }
        System.out.println(sum);
        // 위에처럼 한 번도 작업 안하고 내려오는 게 아닌 반드시 한 번 이상은 실행하는게 do-while문
        Scanner scan = new Scanner(System.in);
        int i = 0;
        do {
            System.out.print("숫자를 입력하세요. 종료하려면 -1을 입력합니다. : ");
            i = scan.nextInt();
        } while (i >= 0); // 음수를 입력하면 종료, 0이나 양수를 입력하면 계속 입력을 받음
        scan.close();
    }
}
