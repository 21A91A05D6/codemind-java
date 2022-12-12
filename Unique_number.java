import java.util.Scanner;  
class Main 
{  
    public static void main(String args[])  
    {  
        Scanner sc = new Scanner(System.in);
        int n,dc=0,i=0,j,t,flag=0;
        n = sc.nextInt();
        int[] d = new int[n];
        
         t=n;
        while(n>0)
        {
            d[i]=n%10;
            n=n/10;
            dc+=1;
            i+=1;
        }
        for(i=0;i<dc;i++)
        {
            for(j=0;j<dc;j++)
            {
                if(i!=j && d[i]==d[j] )
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("Not Unique Number");
        }
        else
        {
            System.out.println("Unique Number");
        }
    }
}