package JavaProgrammesweek_8;
/*12. Write a programme to input any number and check if it is prime or not.
        (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
        prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
        17.... are the prime numbers.)*/

import java.util.Scanner;

public class PrimeNumber12 {
    public static void method1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = input.nextInt();
        int count=0;

//using if to check if condition one is matching
        if (num > 1) {
//using for loop if number can be divide by 1 or itself

            for (int i = 1; i <= num; i++) {
                if (num % i==0)
                    count++;
            }
            if (count==2) {
                System.out.println("its prime number");
            } else {
                System.out.println("not a prime number");

            }}
        else
            System.out.println("not a prime number");

    }

    public static void main(String[] args) {
        method1();

}

}
