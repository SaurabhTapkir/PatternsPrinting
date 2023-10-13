public class V {
    public static void main(String[] args)
    {
        int n=9;
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
            {
                if((c==r && r<=n/2 ) ||c+r==n-1 && r<=n/2)
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
