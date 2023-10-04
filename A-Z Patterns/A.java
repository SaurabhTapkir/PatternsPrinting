class A{
  public static void main(String[] args)
  {
    int n=5; //initialize Value
    for(int r=0;r<5;r++)//Outer For Loop Rows
      {
      for(int c=0;c<5;c++) //inner for Loop Coloumn
        {
        if(r==0||c==0||c==n-1||r==n/2)
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

/*
Note :If You Did'nt get Proper O/p then give Proper Spacing .

*/
