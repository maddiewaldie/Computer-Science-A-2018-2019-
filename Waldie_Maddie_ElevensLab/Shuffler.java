import java.util.ArrayList;
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

    /**
     * The number of consecutive shuffle steps to be performed in each call
     * to each sorting procedure.
     */
    private static final int SHUFFLE_COUNT = 1;

    /**
     * The number of values to shuffle.
     */
    private static final int VALUE_COUNT = 4;
    private static final int HALF_VALUE_COUNT = VALUE_COUNT / 2;

    /**
     * Tests shuffling methods.
     * @param args is not used.
     */
    public static void main(String[] args) 
    {
        System.out.println("Results of " + SHUFFLE_COUNT +" consecutive perfect shuffles:");
        int[] values1 = new int[VALUE_COUNT];
        for (int i = 0; i < values1.length; i++) 
        {
            values1[i] = i;
        }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) 
        {
            values1=perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) 
            {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +" consecutive efficient selection shuffles:");
        int[] values2 = new int[VALUE_COUNT];
        for (int i = 0; i < values2.length; i++) 
        {
            values2[i] = i;
        }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) 
        {
            values2=selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) 
            {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Apply a "perfect shuffle" to the argument.
     * The perfect shuffle algorithm splits the deck in half, then interleaves
     * the cards in one half with the cards in the other.
     * @param values is an array of integers simulating cards to be shuffled.
     * @return the array of shuffled values
     */
    public static int[] perfectShuffle(int[] values) 
    {
        // Create arrays
        int[] part1 = new int[HALF_VALUE_COUNT];
        int[] part2 = new int[HALF_VALUE_COUNT];
        int[] newValues = new int[VALUE_COUNT];

        // Assign half of the deck to part1
        for(int a = 0; a < HALF_VALUE_COUNT; a++) 
        {
            part1[a] = values[a];
        }

        //Assign the 2nd half of the deck to part2
        for(int b = 0; b < HALF_VALUE_COUNT; b++) 
        {
            part2[b] = values[b + HALF_VALUE_COUNT];
        }

        for(int c = 0; c < HALF_VALUE_COUNT; c++) 
        {
            newValues[2*c] = part2[c];
            newValues[2*c+1] = part1[c];
        }

        // If there is an odd amount of cards in the deck
        if((VALUE_COUNT % 2) != 0) 
        {
            newValues[VALUE_COUNT - 1] = part2[HALF_VALUE_COUNT];
        }

        // Return the shuffled deck
        values = newValues;
        return values;
    }

    /**
     * Apply an "efficient selection shuffle" to the argument.
     * The selection shuffle algorithm conceptually maintains two sequences
     * of cards: the selected cards (initially empty) and the not-yet-selected
     * cards (initially the entire deck). It repeatedly does the following until
     * all cards have been selected: randomly remove a card from those not yet
     * selected and add it to the selected cards.
     * An efficient version of this algorithm makes use of arrays to avoid
     * searching for an as-yet-unselected card.
     * @param values is an array of integers simulating cards to be shuffled.
     * @return the array of shuffled values
     */
    public static int[] selectionShuffle(int[] values) 
    {
        for(int i = (VALUE_COUNT - 1); i >= 0; i--) 
        {
            int random = (int)(Math.random() * i);
            int temp = values[random];
            values[random] = values[i];
            values[i] = temp;
        }

        // Return the shuffled deck
        return values;
    }
}
