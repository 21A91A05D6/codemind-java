import java.util.Scanner;  
class Main 
{  
    public static void main(String args[])  
    {  
        Scanner sc = new Scanner(System.in);
        int n,reverse=0,rem;
        n = sc.nextInt();
        
        while(n!=0)    
        {    
             rem=n%10;    
             reverse=reverse*10+rem;    
             n/=10;    
        }    
        System.out.println(reverse);    
    }
}