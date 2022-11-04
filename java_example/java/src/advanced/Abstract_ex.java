package advanced;

abstract class Animal {
    abstract void method();
}

class Dog extends Animal{

    @Override
    void method() {
        System.out.println("강아지입니다.");
    }
}

class Cat extends Animal{

    @Override
    void method() {
        System.out.println("고양이입니다.");
    }
}


public class Abstract_ex {
    public static void main(String[] args) {
        String[] params = new String[]{
                "string","test"
        }  ;
        String_compare_ex.main(params);

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
