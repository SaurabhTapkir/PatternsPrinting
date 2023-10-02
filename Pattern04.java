/*
Pattern No 3:
1A1A1
1A1A1
1A1A1
1A1A1
1A1A1
*/

class Pattern04{
  public static void main(String [] args)
  {
    for(int i=0;i<5i++)
      {
        for(int j=0;j<5;j++)
          {
            if(j%2==0)
            {
              System.out.print("1");
            }
            else
            {
              System.out.print("A");
            }
          }
        System.out.println();
      }
  }
}
