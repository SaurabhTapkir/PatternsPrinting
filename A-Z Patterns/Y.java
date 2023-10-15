public class Y {
    public static void main(String[] args)
    {
        int n=5;
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
            {
                if(c==r &&c<n-2||(c+r==n-1) )
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
