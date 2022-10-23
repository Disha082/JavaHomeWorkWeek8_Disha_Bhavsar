package JavaProgrammesweek_8;
/*2. -Read the numbers from the console entered by the user and print the minimum
        and maximum number the user has entered.*/

import java.util.Scanner;

public class MinAndMaxInputChallenge2 {
    public static void method1(int[] a){
        int max = 0;
        int min = 0;
        int i = 0;
        //Using while loop for finding maximum number and minimum number
        while (i < a.length){
            if (i == 0)
                max = min = a[i];
            else if (a[i]>max) {
                max = a[i];
            }else if (a[i]< min)
                min = a[i];
            i++;}

        System.out.println("This is maximum number: " + max);
        System.out.println("This is minimum number: " + min);
            }
            public static void main (String[]args){
                Scanner obj = new Scanner(System.in);
                System.out.println("Enter size of array");
                int sizeofArray = obj.nextInt();
                //Using if statement for giving size of array to console
                if (sizeofArray < 0)

                    System.out.println("Invalid number");
                else {
                    int a[] = new int[sizeofArray];
                    int i = 0;
                    while (i < a.length){
                        System.out.println("Please enter number" + (i + i) + " : ");
                        a[i]= obj.nextInt();
                        i++;}
                    method1(a);
                    }

        }

    }

