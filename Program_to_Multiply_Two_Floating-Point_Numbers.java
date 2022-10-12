import java.util.Scanner;
class multiple {
    public static void main(String[]args){
        //int name1 = reader.readLine();
        double num1,num2,c;
        Scanner input= new Scanner(System.in);
        num1=input.nextDouble();
        num2=input.nextDouble();
        c=num1*num2;
        System.out.printf("%.2f",c);
    }
}