//public class LetterD
//
//{
//
//    private int width;
//
//    private int height;
//
//    /**
//
//    * Constructor for objects of class LetterD
//
//    */
//
//    public LetterD(int init_Width, int init_Height)
//
//    {
//
//        width = init_Width;
//
//        height = init_Height;
//
//    }
//
//    /**
//
//    * toString - forms the letter 'D' using asterisks(*)
//
//    *
//
//    *
//
//    * @return r    contains the letter 'D'
//
//    */
//
//    public String toString()
//
//    {
//
//        String r = "";
//
//        for (int i=1; i<=height; i++)
//
//        {
//
//            if(i==1 || i==height){
//
//                for(int j=1; j<=(width-1); j++)
//
//                {
//
//                    r = r + "*";
//
//                }
//
//                r = r + "\n";
//
//            } else {
//
//                r = r + "*";
//
//                for (int j=1; j <=(width-2); j++)
//
//                {
//
//                    r = r + " ";
//
//                }
//
//                r = r + "*\n";
//
//            }
//
//        }
//
//        return r;
//
//    }
//
//}
//
//And this is the code for the driver. It prints out a letter “D” with a height and width equal to 7. (NOTE: it’s a different class!)
//
//public class TesterDUH
//
//{
//
//  public static void main( String args[] )
//
//  {
//
//      LetterD d1 = new LetterD( 7,7);       System.out.println( d1.toString() );
//
//  }
//
//}

