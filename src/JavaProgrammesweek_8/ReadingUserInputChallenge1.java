package JavaProgrammesweek_8;

import java.util.Scanner;

/*1. Read 10 numbers from the console entered by the user and print the sum of those
        numbers.*/
public class ReadingUserInputChallenge1 {

    public boolean method1() {
        Scanner sc1 = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.println("Enter number #" + count);
            //Check if enter number is int or not
            boolean number = sc1.hasNext();
            //if int then sum of value
            if (number) {
                int a = sc1.nextInt();
                sum = sum + a;
                count++;
            } else {
                System.out.println("Invalid number");
            }
        }
            System.out.println("sum of all number= " + sum);
            return false;
        }
        public static void main (String[]args){
            ReadingUserInputChallenge1 obj1 = new ReadingUserInputChallenge1();
            obj1.method1();


        }
    }


