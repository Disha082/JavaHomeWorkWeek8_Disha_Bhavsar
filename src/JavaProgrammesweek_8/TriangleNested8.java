package JavaProgrammesweek_8;

import java.util.Scanner;

public class TriangleNested8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number");
        int n = obj.nextInt(); //to enter how many number of row

        method(n);

    }
        public static void method(int n) {

        for (int i = 0; i < n; i++) { //for row
            for (int j = 0; j < i; j++) { //for colum
                System.out.print('@');
            }
            System.out.println();
        }
    }



}


