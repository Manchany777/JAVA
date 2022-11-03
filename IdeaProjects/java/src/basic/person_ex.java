package basic;

public class person_ex {
    public static void main(String[] args) {
        Person 홍길동 = new Person("홍길동");
        Person 김연아 = new Person("김연아");

        if(홍길동.eyes == 2)
            System.out.println("홍길동의 눈이 2개입니다.");
        if(Person.eyes == 2)
            System.out.println("사람의 눈이 2개입니다.");
        if(김연아.eyes == 2)
            System.out.println("김연아의 눈이 2개입니다.");
        }
    }
