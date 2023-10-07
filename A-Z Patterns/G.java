public class G {
    public static void main(String[] args)
    {int n=5 ;
        for(int r=0;r<5;r++)
        {
            for(int c=0;c<5;c++)
            {
                if(r==0||c==0||r==n-1|| (c==n-1 && (r>n/2)) || (r==n/2&& c>=n/2))
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
