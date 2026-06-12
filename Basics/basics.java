import java.util.Scanner;

public class basics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

         int a = sc.nextInt();
         int b = sc.nextInt();
         // sum of a and b
         int sum = a + b;

        System.out.println(sum);

         int product = a * b;

         System.out.println(product);

        float radius = sc.nextFloat();
        float pi = 3.14f;

        float area = pi * radius * radius;

        System.out.print(area);

         // calculating avarage of 3 nums
        // int  a = sc.nextInt();
        // float b = sc.nextFloat();
        // double c = sc.nextDouble();

        // int avarage = (int) (a + b + c) / 3;

        // System.out.println(avarage);

        // //creating a bill
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float copy = sc.nextFloat();

        float bill = (pen + pencil + copy);

        float gstBill = (bill * 18 /100) + bill;

        System.out.print(gstBill);

        // conditional statements

        // print largest between two

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if(a > b) {
        // System.out.println(a + " " + "is saying mein bada hu");
        // } else {

        // System.out.println(b + " " + "is saying mein bada hu");
        // }

        // check a number is even or odd

        // int num = sc.nextInt();

        // if(num % 2 == 0) {
        // System.out.println(num + " " + "even hai");
        // } else {
        // System.out.println(num + " " + "odd hai");
        // }

        // Income tax on salary

        int salary = sc.nextInt();

        if (salary < 500000) {
        System.out.println("No tax needed on" + " " + salary + " " + "rupees");
        } else if (salary < 1000000) {
        int tax = salary * 20 / 100;

        System.out.println("rupees" + " " + tax + " " + " tax needed on your salary"
        + " " + salary);
        } else if (salary > 1000000) {
        int tax = salary * 30 / 100;

        System.out.println("rupees" + " " + tax + " " + " tax needed on your salary"
        + " " + salary);

        }

        int marks = sc.nextInt();

        String ifpASSoRnOT = marks >= 33 ? "pass" : "fail";

        System.out.println(ifpASSoRnOT);
        int n = sc.nextInt();
        // int sum = 0;
        int i = 1;

        while (i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.println(sum);

    }
}