public class N {
    public static void main(String[] args)
    {
        for(int r=0;r<5;r++)
        {
            for(int c=0;c<5;c++)
            {
                if(c==0||c==4||c==r)            
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}



