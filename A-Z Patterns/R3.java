public class R3{
    public static void main(String[] args)
    {
        int n=5;
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
            {
                if(c==0||r==0 && c<n-1|| r==n/2 &&c<n-1|| c==n-1 && r==n/2-1||c==r-1)
                {
                    System.out.print("* "+"");
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
