import java.util.Scanner;
class Main{    
 public static void main(String args[]){  
     Scanner input = new Scanner(System.in);
  int i,m=0,flag=0,n;      
    n=input.nextInt();  
  m=n/2;      
  if(n==0||n==1){  
   System.out.println("not a prime");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println("not a prime");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println("prime"); }  
  }//end of else  
}    
}   
