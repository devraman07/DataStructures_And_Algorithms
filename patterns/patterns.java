public class patterns {


    public static void invertedStar(int n) {

        
        for (int line = 1; line <= n; line ++) {
            for(int star = 1; star <= n - line + 1; star++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void halfPyramid(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void charracter(int n) {
        char ch = 'A';

        for(int i = 1; i <= n; i++) {
            for(int j= 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

  

     
    public static void main(String args[]) {
        //  for(int line = 1; line <= 4; line++) {
        //     for(int star = 1; star <= line; star++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }

        // invertedStar(4);
        // halfPyramid(4);
        charracter(4);
    }
}