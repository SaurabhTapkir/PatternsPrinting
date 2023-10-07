public class I{
   public static void main(String[] args)
    { int n=5;
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
            {
                if(r==0||c==n-3||r==n-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
