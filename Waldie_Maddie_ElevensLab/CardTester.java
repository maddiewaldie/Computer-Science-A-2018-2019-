/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        Card c1 = new Card("Ace", "Hearts",11);
        Card c2 = new Card("King", "Diamonds",10);
        Card c3 = new Card("Ace", "Hearts", 11);

        System.out.println("c1 rank..");
        System.out.println(c1.rank());//should be Ace
        System.out.println("c1 suit...");
        System.out.println(c1.suit());//should be Hearts
        System.out.println("c1 point value...");
        System.out.println(c1.pointValue());//should be 11
        System.out.println("c1 matches c2...");
        System.out.println(c1.matches(c2));//should be false
        System.out.println("c1 matches c3...");
        System.out.println(c1.matches(c3));//should be true
        System.out.println("c2 toString...");
        System.out.println(c2.toString());//should be King of Diamonds (point value = 10)
    }
}
