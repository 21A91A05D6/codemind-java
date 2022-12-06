import java.util.Scanner;
class Main 
{
     public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double s = (0.5) * (a + b + c);
        double area = (double)Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.printf("%.2f",area); 
     }
}