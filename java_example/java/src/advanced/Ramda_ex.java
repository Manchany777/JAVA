package advanced;

interface Myfunction1 {
    public abstract int max(int a, int b);
}
interface Myfunction2 {
    public abstract void printVar(String name, int i);
}
interface Myfunction3 {
    public abstract int square(int x);
}
interface Myfunction4 {
    public abstract int roll();
}

public class Ramda_ex {
    public static void main(String[] args) {

        Myfunction1 f1 =  (a,b) -> {return a>b ? a:b;} ;
        Myfunction2 f2 = (name, i) -> System.out.println(name+"="+i) ;
        Myfunction3 f3 = x -> x * x ;
        Myfunction4 f4 = () -> (int)(Math.random()*6);

        System.out.println(f1.max(3,5));
        f2.printVar("hello", 1);
        System.out.println(f3.square(3));
        System.out.println(f4.roll());
    }

//    public static int max(int a, int b){
//        return a>b ? a:b;
//    }








    public static int printVar(int a, int b){
        return a>b ? a:b;
    }
}
