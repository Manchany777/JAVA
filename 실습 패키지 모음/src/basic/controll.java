package basic;

import java.util.Scanner;

//if문
public class controll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("파트별 점수를 입력하시오 ==> ");
        int score_1 = scan.nextInt();
        int score_2 = scan.nextInt();
        int score_3 = scan.nextInt();
        int total = (int) (score_1 + score_2 + score_3) / 3;

        if (total >= 60) {
            if (score_1 < 40 || score_2 < 40 || score_3 < 40) {    // 자바에선 'or'이 '||'
                System.out.println("과락입니다. 다시 공부하세요.");
            } else {
                System.out.println("합격입니다.");
            }
        } else {
            System.out.println("다음에 다시 도전하세요."); // indentation과 오류 찾기(ctrl + alt +l - 자동완성)
        }
    }
}
