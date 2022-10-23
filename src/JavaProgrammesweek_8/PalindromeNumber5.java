package JavaProgrammesweek_8;

import java.util.Scanner;

public class PalindromeNumber5 {
    public static boolean isPalindrome (int num){
        int realnumber = num;
        int rev = 0;
        boolean result = false;

        while (num != 0) {//reversing the integer value
            rev = rev * 10 + num % 10;
            num = num /10;
            if (realnumber == rev)
                result = true;}
        System.out.println("reverse number :" + rev +" "+result);
        return false;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = obj.nextInt();
        isPalindrome(num);
    }
}

