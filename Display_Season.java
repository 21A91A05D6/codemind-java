import java.util.Scanner;
class Main {
   public static void main(String args[]) throws Exception {
 
    Scanner input = new Scanner(System.in);
    int grade;
    grade=input.nextInt();
        
      if((grade== 5)||(grade== 4)||(grade==6)){
         System.out.println("Summer");
      }else if((grade== 2)||(grade== 3)){
         System.out.println("Spring");
      }else if((grade== 11)||(grade== 12)||(grade==1)){
         System.out.println("Winter");
      }else if((grade== 7)||(grade== 8)||(grade==9)||(grade==10)){
         System.out.println("Rainy");
      }else {
          System.out.println("-1");
      }
   }
}