/**
 * Diploma With Honors Class
 *
 * @author: Madeleine Waldie
 * @version: November 28, 2018
 */
public class DiplomaWithHonors extends Diploma
{
    public DiplomaWithHonors(String studentName, String studentSubject)
    {
        super(studentName, studentSubject);
    }

    public void printDiploma( )
    {
        super.printDiploma( );
        System.out.println( );
        System.out.println( "*** With Honors ***" );
    }

}
