import junit.framework.*;
import java.util.*;
/**
 * Write a description of class UnitTests here.
 *
 * @author Melanie Duffin
 */
public class UnitTester extends TestCase
{
    //test Part A
    public void testA1()
    {
        Student s1 = new Student("Karen", 3);
        Student s2 = new Student("Liz",1);
        Student s3 = new Student("Paul",4);
        Student s4 = new Student("Lester",1);
        Student s5 = new Student("Henry",5);
        Student s6 = new Student("Renee",9);
        Student s7 = new Student("Glen",2);
        Student s8 = new Student("Fran",6);
        Student s9 = new Student("David",1);
        Student s10 = new Student("Danny",3);
        
        List<Student> roster = new ArrayList<Student>();
        roster.add(s1);
        roster.add(s2);
        roster.add(s3);
        roster.add(s4);
        roster.add(s5);
        roster.add(s6);
        roster.add(s7);
        roster.add(s8);
        roster.add(s9);
        roster.add(s10);
        
        SeatingChart introCS = new SeatingChart(roster,3,4);
        Student[][] actual = introCS.getSeats();
        Student[][] expected = {{s1,s4,s7,s10},{s2,s5,s8,null},{s3,s6,s9,null}};
        
        String msg = "Seating Chart:\n"+introCS.toString()+"\n check tester for expected result";
        assertTrue(msg, seatsMatch(actual,expected));
    }
    
    //test part B
    public void testB1()
    {
        Student s1 = new Student("Karen", 3);
        Student s2 = new Student("Liz",1);
        Student s3 = new Student("Paul",4);
        Student s4 = new Student("Lester",1);
        Student s5 = new Student("Henry",5);
        Student s6 = new Student("Renee",9);
        Student s7 = new Student("Glen",2);
        Student s8 = new Student("Fran",6);
        Student s9 = new Student("David",1);
        Student s10 = new Student("Danny",3);
        
        List<Student> roster = new ArrayList<Student>();
        roster.add(s1);
        roster.add(s2);
        roster.add(s3);
        roster.add(s4);
        roster.add(s5);
        roster.add(s6);
        roster.add(s7);
        roster.add(s8);
        roster.add(s9);
        roster.add(s10);
        
        SeatingChart introCS = new SeatingChart(roster,3,4);
        int count = introCS.removeAbsentStudents(4);
        Student[][] actual = introCS.getSeats();
        
        Student[][] expected = {{s1,s4,s7,s10},{s2,null,null,null},{s3,null,s9,null}};
        int expectedCount = 3;
        String msg = "Count Returned: "+count+"\nSeating Chart:\n"+introCS.toString()+"\n check tester for expected result";
        assertTrue(msg, seatsMatch(actual,expected)&&count==expectedCount);
    }
    

    //helper methods for testing - DO NOT ALTER
    private boolean seatsMatch(Student[][] actual, Student[][] expected)
    {
        if(actual.length!=expected.length && actual[0].length!=expected[0].length)
        {
            return false;
        }
        for(int r=0; r<actual.length; r++)
        {
            for(int c=0; c<actual[0].length; c++)
            {
                if(actual[r][c]==null && expected[r][c]!=null)
                {
                    return false;
                }
                else if(expected[r][c]==null && actual[r][c]!=null)
                {
                    return false;
                }
                else if((expected[r][c]!=null && actual[r][c]!=null)&&(!actual[r][c].matches(expected[r][c])))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
