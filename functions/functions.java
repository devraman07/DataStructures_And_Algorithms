
public class functions {

    public static int product(int a , int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int n) {
        int factorial = 1 ;

        for(int i = 1; i <= n; i++) {
            factorial = factorial * i;

        }
        return factorial;
    }

    public static int BinominalCoffecient(int n , int r) {

        int nfact = factorial(n);
        int rfact = factorial(r);
        
        int nmrfact = factorial(n - r);

        int bcoff = nfact / rfact * nmrfact;

        return bcoff;
    }

      public static boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }
         for(int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n % i != 0) {
                return false;
            } 
         }
         return true;
    }

    public static void checkPrime(int n) {
       
        for(int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
        System.out.println();

    }
    public static void main(String args[]) {
        //   System.out.println(product(4, 5));
        //   System.out.println("factorial is " + factorial(4));
        //   System.out.println(BinominalCoffecient(4, 2));
         checkPrime(6);
    }
}