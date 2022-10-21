package basic;

import java.util.Arrays;
import java.util.Scanner;

public class arr_sample {

    public static int sum_two(int i, int j) {   // int는 return값이 필요함
        int s = i + j;
        return s;
    }


    public static void main(String[] args) {
        System.out.println(sum_two(3,4));

       /* int[] score;
        score = new int[3];

        score[0] = 80;
        score[1] = 60;
        score[2] = 40;
        // score[4] = 20;  --> 자바스크립트에서 하듯이 이렇게 지정된 범위 밖 변수를 넣으면 에러가 뜸

        int sum = 0; // 지역변수는 반드시 초기화
        for(int i=0; i<= 2; i++) {
            sum += score[i];
        }*/


        // for-each문으로 array하는 법
        /*int[] arr = { 10, 20, 30, 40, 50};
        int sum = 0;
        for (int e : arr) {           // int나 string 등 변수 type 적는거 빼먹지 마라
            sum += e;
        }
        System.out.println(sum);

        String[] s_arr = { "a", "b", "c" };
        String sss = "";
        for (String s : s_arr) {
            sss += s;
        }
        System.out.println(sss);*/



        // 음수를 입력하거나, 입력한 수가 배열의 크기보다 커지면(인덱스가 정해진 바운드리(10)를 넘어가면) 종료, 작을 동안은 계속 입력
        /*Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];  // int 10개 저장할 수 있는 배열 공간 확보를 위해 변수와 배열 선언
        int ind = 0, num = 0;
        do {
            System.out.print("숫자를 입력하세요. 종료하려면 -1을 입력합니다. : ");
            num = scan.nextInt();
            if (num < 0) {
                break;
            }
            arr[ind] = num;
            ind++;
        } while (ind <= arr.length -1);
        scan.close();

        for(int e : arr) {  // 배열의 모든 원소를 개수만큼 읽어보는 반복문 - for each
            System.out.print(e + "\t"); // "\t" -한칸씩 띄워주는 대행문자열(= tab), "\b"백스페이스???, "\n"줄 넘기기, ","콤마
        }*/


        // 자바의 api 사용법 (직접 짜지 않고도 간단하게 Array가 가능하다!)
        /*Arrays.sort(arr);
        System.out.println("최대값" +arr[arr.length-1]);

        Arrays.sort(arr);
        System.out.println("최대값" +arr[arr.length-1]);
        System.out.println(Arrays.toString(arr)); // 안의 배열에 들어있는걸 바꾸는게 아니라 그렇게 보여지도록 바꾸기만 하는 것*/
    }
}
