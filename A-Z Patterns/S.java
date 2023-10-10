public class S {
    public static void main(String[] args)
    {
        for(int r=0;r<5;r++)
        {
            for(int c=0;c<5;c++)
            {
                if(r==0||r==2||r==4||(c==0 &&r==1)||(c==4 && r==3))            //c==5/2||r==5/2||c==2||(r==4)
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



