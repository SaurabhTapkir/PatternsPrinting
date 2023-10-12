public class R2{
    public static void main(String[] args)
    {
        int n=5;
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
            {
                if(c==0||r==0||r==2||(c==4 && r==1) ||(c==r&& r>2))
                {
                    System.out.print("*"+"");
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
