package advanced;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class String_compare_ex {
    public static void main(String[] args) {

        if ((args == null) || (args.length < 2)) {
            System.out.println("매개변수를 2개 입력하세요.");
        } else {
            System.out.println(Arrays.toString(args));

            String a = "hello";
            String b = "hello";
            System.out.println(a.substring(1,2));
            System.out.println(b);

            System.out.println(a==b);

            String a1 = new String("a");
            String b1 = new String("a");
            System.out.println(a1);
            System.out.println(b1);

            System.out.println(a1==b1);

            System.out.println(a==a1);

            String s = ""; // null X
            char c = ' '; //공백
        }
    }

}
