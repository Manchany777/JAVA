package basic;

import java.util.Scanner;

public class iterate {
    public static void main(String[] args) {
       /* int i;
        for(i=1; i <= 10; i++){
            System.out.println(i);
        }
        for(i=10; i >= 1; i--){
            System.out.println(i);
        }*/

        /* 1부터 10까지 합계 sum 을 구하는 프로그램 작성 */
        /* for 문과 while 둘다 작성해보기 */

 /*       int i;
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

        sum = 0;
        for(i=1; i <= 10; i++){
            sum += i;  // 1부터 10까지 합계 sum 을 구하기
        }
        System.out.println(sum);
        System.out.println(i);
        //i=1;
        sum = 0;
        while ( i<=10  ) {  // 반복을 10번 하기 위한 조건식 넣기
            sum += i;// 1부터 10까지 합계 sum 을 구하기
            i++;// 증가식 적기
        }
        System.out.println(sum);*/
        Scanner scanner = new Scanner(System.in);
        int i=0;
        do {
            System.out.print("숫자를 입력하세요. 종료하려면 -1 을 입력합니다. : ");
            i = scanner.nextInt();
        } while  ( i >= 0 ); // 음수를 입력하면 종료 , 양수를 입력하면 계속 입력을 받음
        scanner.close();
    }
}
