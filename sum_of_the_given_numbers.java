import java.util.Scanner;  
class Main 
{  
    public static void main(String args[])  
    {  
        Scanner sc = new Scanner(System.in);
        int t,a,b,sum=0;
        t = sc.nextInt();
        
        for(;t>0;t--)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            sum=sum+(a+b);
            System.out.println(sum);
            sum=0;
        }
    }
}