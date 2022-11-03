package basic;

public class cardTest {
    public static void main(String[] args) {
        Card c1 = new Card("Heart", 7);
        Card c2 =  new Card("Spade", 4);
        Card c3 = new Card("Heart", 7), c4 = new Card("Spade", 4);
             // -> 가독성 떨어져서  비추
        c1.width = 50;         // =Card.width = 50;
        c2.height = 80;        // =Card.height = 80;




        System.out.println(c1.kind + c1.number);
        System.out.println(c2.kind + c2.number);
        System.out.println(c1.width + ":" + c1.height);
        System.out.println(c1.width + ":" + c1.height);
    }

}
