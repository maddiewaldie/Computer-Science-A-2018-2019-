
/**
 * Write a description of class Robot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Robot
{
    private int[] hall;
    private int pos; //current position (title number) of robot
    private boolean facingRight; //true means this robot is facing right

    //constructor not shown in question
    public Robot(int[] h, int p, boolean fr)
    {
        hall = h;
        pos = p;
        facingRight = fr;
    }

    /**
     * postcondition: returns true if this Robot has a wall immediately in
     * front of it, so that it cannot move forward;
     * otherwise, returns false
     */
    public boolean forwardMoveBlocked()
    {
        if((facingRight && getPosition() == hall.length - 1) || (!facingRight && getPosition() == 0))
        {
            // return true if it's facing right & the position is equal to the hall length - 1 or if it's not facing right & the position is 0
            return(true);
        }
        else{
            // return false
            return(false);
        }
    }

    /**
     * postcondition: one move has been made according to the
     * specification above and the state of this
     * Robot has been updated
     */
    public void move()
    {
        // If the position is greater than 0, it will move back
        if (hall[pos] > 0)
        {
            hall[pos]--;
        }
        // If the position equals 0, it will either face right, move forward, or move backward
        if (hall[pos] == 0)
        {
            if (forwardMoveBlocked())
                facingRight = !facingRight;
            else if (facingRight)
                pos++;
            else
                pos--;
        }
    }

    /**
     * postcondition: no more items remain in the hallway;
     * returns the number of moves made
     */
    public int clearHall()
    {
        int counter = 0;
        for (int i = 0; !hallIsClear(); i++)
        {
            move();
            counter++;
        }
        return counter;
    }

    /**
     * postcondition: returns true if the hallway contains no items;
     * otherwise returns false
     */
    private boolean hallIsClear()
    {
        /* implementation not shown in question*/
        for(int i=0; i<hall.length; i++)
        {
            if(hall[i]!=0)
            {
                return false;
            }
        }
        return true;
    }

    //added methods for testing - Do not alter
    public int[] getHall()
    {
        return hall;
    }

    public boolean getDirection()
    {
        return facingRight;
    }

    public int getPosition()
    {
        return pos;
    }
}
