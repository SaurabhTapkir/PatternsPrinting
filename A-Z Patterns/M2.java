public class M2 {

    public static void main(String[] args)
    {

        int n=5;
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
            {
            if((c==0)||(c==r && r<=2)||(c==4|| c+r==4 ))
            {
                System.out.print("*");
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
