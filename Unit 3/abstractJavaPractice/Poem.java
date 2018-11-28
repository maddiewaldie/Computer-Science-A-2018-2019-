/**
 * Poem Class
 *
 * @author: Madeleine Waldie
 * @version: November 28, 2018
 */
public abstract class Poem
{
    public abstract int numLines( );

    public abstract int getSyllables(int k);

    public void printRythm( )
    {
        for( int i=0; i<numLines(); i++ )
        {
            for( int j=0; j<getSyllables( i ); j++ )
            {
                System.out.print( "ta-" );
            }
            System.out.println( );
        }
    }
}

