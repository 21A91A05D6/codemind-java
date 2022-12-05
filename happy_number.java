import java.util.Scanner;
class Main {
     public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   int num;
    num = scan.nextInt();
    
    int sum=0,rem;
     while(sum!=1 && sum!=4)
    {
      sum=0;
      while(num!=0)
      {
        rem=num%10;
        sum+=(rem*rem);
        num/=10;
      }
      num=sum;
    }
   if(sum==1)
    System.out.println("True"); 
   else
     System.out.println("False"); 
   
     }
}