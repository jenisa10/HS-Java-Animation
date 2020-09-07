/**
 * Prints out the letter "D" - Exercise to work with constructors and toString method.
 */
public class LetterD
{
    private int width;
    private int height;

    /**
    * Constructor for objects of class LetterD
    */

    public LetterD(int init_Width, int init_Height)
    {
        width = init_Width;
        height = init_Height;
    }
    /**
    * toString - forms the letter 'D' using asterisks(*)
    * @return r    contains the letter 'D'
    */

    public String toString()
    {
        String r = "";
        for (int i=1; i<=height; i++)
        {
            if(i==1 || i==height){
                for(int j=1; j<=(width-1); j++)
                {
                    r = r + "*";
                }
                r = r + "\n";
            } else {
                r = r + "*";
                for (int j=1; j <=(width-2); j++)
                {
                    r = r + " ";
                }
                r = r + "*\n";
            }
        }
        return r;
    }
}

