import java.util.Scanner;
class Main {
   public static void main(String args[]) throws Exception {
 
   Scanner sc = new Scanner(System.in);
      //Creating a StringBuffer object
      //System.out.println("Enter your grade: (A, B, C, D)");
      char grade = sc.next().toCharArray()[0];
        
      if((grade== 'A')||(grade== 'a')){
         System.out.println("Vowel");
      }else if((grade== 'E')||(grade== 'e')){
         System.out.println("Vowel");
      }else if((grade== 'i')||(grade== 'I')){
         System.out.println("Vowel");
      }else if((grade== 'o')||(grade== 'O')){
         System.out.println("Vowel");
      }else if((grade== 'u')||(grade== 'U')){
          System.out.println("Vowel");
      }else{
          System.out.println("Consonant");
      }
   }
}