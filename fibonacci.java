import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
        
      int i, n;
      int t1 = 0, t2 = 1;
      int nextTerm = t1 + t2;
      n=input.nextInt();

  System.out.print(t1); 
  System.out.print(" "+t2); 

  for (i = 3; i <= n; ++i) 
  {
    System.out.print(" "+nextTerm); 
    t1 = t2;
    t2 = nextTerm;
    nextTerm = t1 + t2;
  }
  }
}
