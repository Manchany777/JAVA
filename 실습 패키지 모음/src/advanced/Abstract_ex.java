package advanced;

abstract class Animal{           // 2. 클래스명 앞에도 abstract 적어줘야함
    abstract void method();      // 1. {}의 내용이 없으면 abstract라고 표시라도 해라 라는 의미
}


class Dog extends Animal {      // 미완성된 설계도를 가지고 완성된 설계도를 만드는 것

    @Override
    void method() {
        System.out.println("강아지 입니다.");
    }
}

class Cat extends Animal {

    @Override
    void method() {
        System.out.println("고양이 입니다.");
    }
}


public class Abstract_ex {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            void method() {
                System.out.println("animal 입니다.");
            }
        };
        Dog d = new Dog();
        Cat c = new Cat();

        a.method();
        d.method();
        c.method();
    }
}
