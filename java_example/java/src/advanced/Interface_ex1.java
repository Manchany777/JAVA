package advanced;

// 인터페이스 다중상속 및 활용 예제

abstract class Unit{
    int x,y;
    abstract void move(int x, int y);
}

class Tank extends Unit implements Fightable {
    @Override
    public void move(int x, int y) {
        System.out.println(x + "," + y + "로 이동");
    }

    @Override
    public void attack(Unit u) {
        System.out.println("Unit 에 공격");
    }
}
interface Movable{
    void move(int x, int y);
}

interface Attackable{
    void attack(Unit u);
}

interface Fightable extends Movable , Attackable {
}

interface aaa {}

public class Interface_ex1 {
    public static void main(String[] args) {
        Tank t = new Tank();
        Tank t1 = new Tank();
        t.move(10,10);
        t1.move(100,100);
        t.attack(t1);
        t.move(100,100);
        t1.attack(t);
    }
}
