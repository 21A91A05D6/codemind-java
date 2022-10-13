import java.util.Scanner;
class multiple {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a;
        a=input.nextInt();
        
        if(a%2==0){
        System.out.printf("Even");
        }
        else{
         System.out.printf("Odd");   
        }
    }
}