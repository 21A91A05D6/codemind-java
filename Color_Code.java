import java.util.Scanner;
class Main {
   public static void main(String args[]) throws Exception {
      //Creating a Scanner object
      Scanner sc = new Scanner(System.in);
      //Creating a StringBuffer object
      //System.out.println("Enter your grade: (A, B, C, D)");
      char grade = sc.next().toCharArray()[0];
      if(grade== 'R'){
         System.out.println("Red");
      }else if((grade== 'O')||(grade== 'o')){
         System.out.println("Orange");
      }else if((grade== 'Y')||(grade== 'y')){
         System.out.println("Yellow");
      }else if((grade== 'G')||(grade== 'g')){
         System.out.println("Green");
      }else if((grade== 'B')||(grade== 'b')){
         System.out.println("Blue");
      }else if((grade== 'I')||(grade== 'i')){
         System.out.println("Indigo");
      }else  if((grade== 'V')||(grade== 'v')){
         System.out.println("Violet");
      }else{
          System.out.println("-1");
      }
   }
}