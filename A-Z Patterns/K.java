public class K {
    public static void main(String[] args)
    {int n=5;
        for(int r=0;r<5;r++)
        {
            for(int c=0;c<5;c++)
            {
                if(c==0||c+r==n-2||(c==r &&r>n/2))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
