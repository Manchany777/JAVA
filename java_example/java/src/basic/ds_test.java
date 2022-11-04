package basic;

import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.Queue;

public class ds_test {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
