public class B {
    public static void main(String[] args)
    {
        for(int r=0;r<5;r++)
        {
            for(int c=0;c<5;c++)
            {
                if(r==0||c==0||r==4||c==4||r==2)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}

/* int n=10
 * for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
            {
                if(r==0||c==0||r==4||c==4||r==n/2||r==n-1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
 * 
 */