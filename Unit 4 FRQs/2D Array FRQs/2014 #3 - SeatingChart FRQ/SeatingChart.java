import java.util.*;
/**
 * Write a description of class SeatingChart here.
 *
 * @author Madeleine Waldie
 * @version February 14, 2019
 */
public class SeatingChart
{
    private Student[][] seats; 
    //seats[r][c] represents the Student in row r and column c in the classroom

    /**
     * Creates a seating chart with the given number of rows and columns
     * from the students in studentList.  Empty seats in the seating chart are
     * represented by null.
     * @param rows the number of rows of seats in the classroom
     * @param cols the number of columns of seats in the classroom
     * Precondition: rows>0; cols>0
     *     rows * cols >= sutedentList.size()
     * Postcondition:
     *  - Students appear in the seating chart in the same order as they
     *  appear in studentList, starting at seats[0][0]
     *  - seats is filled column by column from studentList, followed by any empty
     *  seats (represented by null)
     *  - studentList is unchanged
     */
    public SeatingChart(List<Student> studentList, int rows, int cols)
    {
        //Instantiate variables
        seats = new Student[rows][cols];
        int row = 0;
        int col = 0;
        
        //Go through student list, assigning students to their seats
        for (Student s : studentList)
        {
            seats[row][col] = s;
            row++;
            if (row == rows)
            {
                row = 0;
                col++;
            }
        }
    }

    /**
     * Removes students who have more than a given number of
     * absences from the seating chart, replacing those entries in the seating
     * chart with null and returns the number of students removed
     * @param allowedAbsences an integer>=0
     * @return number of students removed from seats
     * Postcondition:
     *  - All students with allowedAbsences or fewer are in their original
     *  positions in seat
     *  - No student in seats has more than allowedAbsences absences
     *  - Entries without students contain null
     */
    public int removeAbsentStudents(int allowedAbsences)
    {
        //Create variable for num of students removed
        int numRemoved = 0; 
        
        for (int r = 0; r < seats.length; r++) // go through all the rows
        {
            for (int c = 0; c < seats[0].length; c++) // go through all the columns
            {
                if (seats[r][c] != null && seats[r][c].getAbsenceCount() > allowedAbsences)
                {
                    seats[r][c] = null; // make seat empty
                    numRemoved++; // increase the counter for num students removed
                }
            }
        }
        
        //Return how many students that have been removed from seats
        return numRemoved;
    }

    //There may be instance variables, constructors, and methods that are not shown

    //methods for testing - DO NOT ALTER
    public Student[][] getSeats()
    {
        return seats;
    }

    public String toString()
    {
        String temp="";
        for(int r=0; r<seats.length; r++)
        {
            for(int c=0; c<seats[r].length; c++)
            {
                if(seats[r][c]==null)
                {
                    temp+=null;
                    temp+="\t";
                }
                else
                {
                    temp+=seats[r][c].toString();
                    temp+="\t";
                }
            }
            temp+="\n";
        }
        return temp;
    }
}
