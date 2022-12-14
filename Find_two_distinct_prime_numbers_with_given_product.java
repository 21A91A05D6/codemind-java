import java.util.Scanner;  
class GFG {
 
    static void SieveOfEratosthenes(int n,
                                    boolean isPrime[])
    {
        
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= n; i++)
            isPrime[i] = true;
 
        for (int p = 2; p * p <= n; p++) {
           if (isPrime[p] == true) {
                // Update all multiples of p
                for (int i = p * 2; i <= n; i += p)
                    isPrime[i] = false;
            }
        }
    }
 static void findPrimePair(int n)
    {
        int flag = 0;
 
        boolean[] isPrime = new boolean[n + 1];
        SieveOfEratosthenes(n, isPrime);
        for (int i = 2; i < n; i++) {
            int x = n / i;
 
            if (isPrime[i] && isPrime[x] && x != i
                && x * i == n) {
                System.out.println(i + " " + x);
                flag = 1;
                return;
            }
        }
         if (flag == 0)
            System.out.println("-1");
 }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         int n ;
        n= sc.nextInt();  
        findPrimePair(n);
    }
}