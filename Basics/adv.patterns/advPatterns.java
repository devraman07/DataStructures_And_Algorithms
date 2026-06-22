

public class advPatterns {

    public static void HollowRectangle(int totRows , int totCols) {
        for(int i = 1; i <= totRows; i++) {
            for(int j = 1; j <= totCols; j++) {
                if( i == 1 || j == 1|| i == totRows || j == totCols) {
                   System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    
    public static void InvertedRotatedHalfPyramid(int n) {
        for(int i = 1; i <= n; i ++) {
            for (int j =1; j <= n - i; j ++  ) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void InvertedhalfPyramidWithNum(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n- i + 1; j++) {
                System.out.print( " " + j);
            }
            System.out.println();
        }
    }

    public static void Floyed(int n) {
        int counter = 1;
        for(int i = 1; i <= n; i++) {
            
            for(int j = 1; j <= i; j++) {
                   System.out.print(  " " +  counter);
                   counter++;
            }
            System.out.println();
        }
    }

    public static void zeroAndone(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j =1; j <= i; j++) {
                if((i + j)  % 2 == 0) {
                    System.out.print(" " + "1");
                } else {
                    System.out.print(" " + "0");
                }
            }
            System.out.println();
        }
    }

    public static void Butterfly(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= (n- i) * 2; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= (n- i) * 2; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void SolidRhumbus(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j= 1; j <= n; j++) {
                System.out.print( " *");
            }
            System.out.println();
        }
    }
       
    public static void main(String args[]) {
    //  HollowRectangle(4, 5);
    // InvertedRotatedHalfPyramid(4);
    // InvertedhalfPyramidWithNum(5);
    // Floyed(5);
    // zeroAndone(5);
    // Butterfly(4);

    SolidRhumbus(4);
    }
}
