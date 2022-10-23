package JavaProgrammesweek_8;

import java.util.Scanner;

public class EvenDigitSum11 {
        public static int getEvenDigitsum(int  num) {
            int r;
            int evenSum = 0;
            int oddSum = 0;
            //using if number is > 0 it should be print even digit sum else print negative statement

            if (num > 0 ){
                //using while loop for getting sum of even digit number
                while (num != 0){
                    r = num % 10; // getting reminder-getting digit
                    if (r % 2 == 0){
                        evenSum = evenSum + r;
                    }else if (r % 2 != 0){
                        oddSum = oddSum + r;
                    }else
                        return -1;
                    num = num / 10;
                }
                System.out.println("sum of even number is :" + evenSum);
            }else {
                System.out.println("nagative" + "-1");
                return -1;
            }
            return evenSum;
        }
        public static void main(String[] args){
            Scanner inout = new Scanner(System.in);
            System.out.println("Enter number :");
            int num = inout.nextInt();
            getEvenDigitsum(num);




    }

}
