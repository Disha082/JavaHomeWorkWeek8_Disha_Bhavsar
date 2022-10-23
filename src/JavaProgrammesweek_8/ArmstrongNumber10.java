package JavaProgrammesweek_8;
/*10. Write a program to input any number and check if it Armstrong number or not
        153 = (1*1*1)+(5*5*5)+(3*3*3)
        where:
        (1*1*1)=1
        (5*5*5)=125
        (3*3*3)=27
        So:
        1+125+27=153*/

import java.util.Scanner;

public class ArmstrongNumber10 {
    public static void main(String[] args) {
        method1();

    }
    public static void method1(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = obj.nextInt();
        System.out.println("given number is : " + num);
        int temp = num;
        int sum = 0;
        int r = 0;
        //using while loop to get sum variable value for 153
        while (num > 0) {
            r = num % 10;//3,5,1
            num = num / 10;//15.3,1.5,0.1
            sum = sum + (r * r * r);//
        }
        if (temp == sum) {
            System.out.println("this is an armstrong number : ");
        } else {
            System.out.println("this is not  an armstrong number : ");
        }
    }


    }

