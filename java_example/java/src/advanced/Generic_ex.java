package advanced;

import java.util.LinkedList;

class Box<T> {
    T item;

    Box(T item){
        this.item = item;
    }
}


public class Generic_ex {
    public static void main(String[] args) {
        Box<Integer> box = new Box<Integer>(3);
        System.out.println(box.item);

        Box<String> box2 = new Box<String>("hello");
        System.out.println(box2.item);
    }
}
