/**
 * Diploma Class
 *
 * @author: Madeleine Waldie
 * @version: November 28, 2018
 */
public abstract class Diploma
{
    private String student;
    private String subject;
    
    public Diploma(String studentName, String studentSubject)
    {
        student = studentName;
        subject = studentSubject;
    }
    
    public void printDiploma()
    {
        System.out.println("This certifies that " + student + " has completed a course in" + subject);
    }
}
