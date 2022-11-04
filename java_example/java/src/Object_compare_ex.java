import java.util.Arrays;

/**
 * person 입니다.
 * 주민번호를 저장하고 있는 객체입니다.
 * example
 *    Person.id
 */

class Person {

    long id;
    Person(long id){
        this.id = id;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Person)
            return ((Person) obj).id == this.id;
        else return false;
    }

    @Override
    public String toString() {
        return "주민번호는 " +
                id +
                "입니다.";
    }
}

public class Object_compare_ex {
    public static void main(String[] args) {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);
        int[] i1 = {1,2,3};
        int[] i2 = {1,2,3};

        System.out.println(p1);
        System.out.println(p1 == p2); // true ? false ?
        System.out.println(p1.equals(p2)); // true ? false ?
        System.out.println(p1.id == p2.id); // true ? false ?

        System.out.println("================");
        System.out.println(Arrays.toString(i1));
        System.out.println(i1 == i2); // true ? false ?
        System.out.println(i1.equals(i2)); // true ? false ?
        System.out.println(i1[0] == i2[0]); // true ? false ?

        //p1 이 속한 클래스의 class 객체를 반환한후 ==> 해당 객체의 이름을 반환
        System.out.println(p1.getClass().getName());
        //ㅑi1 이 속한 클래스의 class 객체를 반환한후 ==> 해당 객체의 이름을 반환
        System.out.println(i1.getClass().getName());

        float i = 10.0f;
        System.out.println(((Object)i).getClass().getName());
        Object o = new Object();

    }


}
