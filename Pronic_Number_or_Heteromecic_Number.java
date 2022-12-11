import java.util.Scanner;  
class Main 
{  
    public static void main(String args[])  
    {  
        Scanner sc = new Scanner(System.in);
        int pr,i,n,c=0;
        pr = sc.nextInt();
        for(i=1;i<=pr;i++)
        {
            if(i*(i+1)==pr) 
            {
                c=1;
                break;
            }
        }
  
        if(c==1)
        {
		    System.out.println("YES");
        }
        else
        {
		    System.out.println("NO");
        }
    }
}