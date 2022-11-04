package collections;

import java.util.*;

public class List_ex {
    public static <K> void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("hello");
        list.addFirst("world");
        list.addFirst("!!!!");

        System.out.println(list.toString());
        System.out.println(list.size());

        System.out.println(list.contains("hello"));
        System.out.println(list.get(0));
        System.out.println(list.remove(0));
        System.out.println(list.toString());
        System.out.println(list.size());

        ArrayList<Integer> alist = new ArrayList<>();

        alist.add(10);
        alist.add(20);
        alist.add(30);

        // 데이타 갯수, 식제 후 다시 출력, 특정 인덱스의 요소 가져오기, 20 을 포함하고 있는지
        // 특정 값을 가지고 있는 요소 삭제하기, 10은 몇번째에 저장되어 있는지 index 확인

        alist.remove(2);
        System.out.println(alist.toString());
        System.out.println(alist.size());
        System.out.println(alist.indexOf(10));
        System.out.println(alist.contains(20));


        ArrayList<String> slist = new ArrayList<>();

        slist.add("hello");
        slist.add("world");
        slist.add("!!!!");

        // 데이타 갯수, 식제 후 다시 출력, 특정 인덱스의 요소 가져오기, 20 을 포함하고 있는지
        // 특정 값을 가지고 있는 요소 삭제하기, 10은 몇번째에 저장되어 있는지 index 확인

        slist.remove(2);
        slist.remove("world");
        System.out.println(slist.toString());
        System.out.println(slist.size());
        System.out.println(slist.indexOf("hello"));
        System.out.println(slist.contains("!!!!"));

        int[] arr = new int[3];

        Arrays.fill(arr, 10);

        System.out.println(Arrays.toString(arr));

        Integer i = (Integer)3;
        Integer j = (Integer)5;

        if (i.compareTo(j) == 0) {
            System.out.println("두 수가 같음");
        } else if (i.compareTo(j)>0){
            System.out.println("i가 큼");
        } else if (i.compareTo(j) < 0){
            System.out.println("j가 큼");
        }

        HashMap hashMap = new HashMap();

        hashMap.put("a", 10);
        hashMap.put("b", 20);
        hashMap.put("c", 30);
        hashMap.put("c", 20);
        hashMap.put("d", 20);

        System.out.println(hashMap.toString());

        // 데이타 갯수, 식제 후 다시 출력, 특정 인덱스의 요소 가져오기, 20 을 포함하고 있는지
        // 특정 값을 가지고 있는 요소 삭제하기, 10은 몇번째에 저장되어 있는지 index 확인

        System.out.println(hashMap.size() + ":" +
                            hashMap.get("a") + ":" +
                            hashMap.containsKey("a") + ":" +
                            hashMap.containsValue(30) + ":" +
                            hashMap.remove("a"));


    }
}
