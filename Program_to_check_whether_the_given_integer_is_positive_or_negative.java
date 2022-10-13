import java.util.Scanner;
class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a;
        a=input.nextInt();
        
        if(a>0)
        {
        System.out.printf("Positive Number");
        }
        if(a<0)
        {
         System.out.printf("Negative Number");   
        }
    }
}