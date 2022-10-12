import java.util.Scanner;
class multiple {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double pi = 3.14, area, radius;
        radius=input.nextDouble();
        area = pi * radius * radius;
        // printing the area of the circle
        System.out.printf("%.2f",area);
    }
}