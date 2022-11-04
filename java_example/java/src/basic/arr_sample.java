package basic;

import java.util.Arrays;  // 자바가 제공하는 자료 구조 - Arrays
import java.util.Scanner;

public class arr_sample {
    public static int sum_two(int i, int j) {
        int s = i+j;
        return s;
    }

    public static void main(String[] args) {

        System.out.println(sum_two(3,4));

        //System.out.println(args[0]);
   /*     int[] score ;
        score = new int[3];

        score[0] = 80;
        score[1] = 60;
        score[2] = 40;

        int sum = 0;

        for(int i=0; i <=2 ; i++) {
            sum += score[i];
        }*/
/*        int[] arr = { 10, 20, 30, 40, 50};
        int sum = 0 ;
        for(int e : arr) {
            sum += e;
        }
        System.out.println(sum);*/

/*
        String[] s_arr = { "a", "b", "c" };
        String sss = "";
        for(String s : s_arr) {
            sss += s;
        }
        System.out.println(sss);*/

  /*      Scanner scanner = new Scanner(System.in);
        // INT 10 개 저장할 수 있는 배열 공간 확보를 위해 변수와 배열 선언
        int i = 20 ;
        System.out.print(i);
        int[] arr =  new int[10];
        float[] f_arr =  new float[10];;
        System.out.print(f_arr);

        for(float e : f_arr) { // 배열의 모든 원소를 갯수만큼 읽어오는 반복문 - foreach
            System.out.print(e + " , ");
        }
        int ind = 0 , num = 0;
        do {
            System.out.print("숫자를 입력하세요. 종료하려면 -1 을 입력합니다. : ");
            num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            arr[ind] = num;
            ind++;
        } while  ( ind <= arr.length -1); // 음수를 입력하거나 , 입력한 수가 배열의 크기보다 커지면 종료 , 양수를 입력하면 계속 입력을 받음
        scanner.close();

        for(int e : arr) { // 배열의 모든 원소를 갯수만큼 읽어오는 반복문 - foreach
            System.out.print(e + " , ");
        }

        Arrays.sort(arr);
        System.out.println("최대값" +arr[arr.length-1]);
        System.out.println(Arrays.toString(arr));*/


    }

}
