import java.util.Scanner;

public class basics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        //sum of a and b
        // int sum =  a + b;

        // System.out.println(sum);

        // int product = a * b;

        // System.out.println(product);
    
        // float radius = sc.nextFloat();
        // float pi = 3.14f;
        

        // float area = pi * radius * radius;

        // System.out.print(area);


        //calculating avarage of 3 nums 
        // int a = sc.nextInt();
        // float b = sc.nextFloat();
        // double c = sc.nextDouble();

        // int avarage = (int) (a + b + c) / 3;

        // System.out.println(avarage);


        //creating a bill
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float copy = sc.nextFloat();

        

       float bill =  (pen + pencil + copy);

        float gstBill = (bill * 18 /100) + bill;

        System.out.print(gstBill);

    }
}