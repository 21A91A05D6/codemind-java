import java.util.Scanner;  
class Main 
{  
    public static void main(String args[])  
    {  
        Scanner sc = new Scanner(System.in);
        int n,d,k,t,sum=0;
        t = sc.nextInt();
        for(;t>0;t--)
        {
            n = sc.nextInt();
            k=n;
            while(n>0)
            {
                d=n%10;
                n=n/10;
                sum=sum*10+d;
            }
            if(sum==k)
            {
                 System.out.println("True");
            }
            else
            {
                 System.out.println("False");
            }
            sum=0;
        }
    }
}