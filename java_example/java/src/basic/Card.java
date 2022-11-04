package basic;

public class Card {
    public static int width = 100;
    public static int height = 200;

//    static {
//        width = 100;
//        height = 200;
//    }

    public String kind ;
    public int number;
    public Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }
}
