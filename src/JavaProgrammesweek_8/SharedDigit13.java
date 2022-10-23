package JavaProgrammesweek_8;

import java.util.Scanner;

public class SharedDigit13 {
    public static boolean hasSharedDigit (int a,int b){
        boolean result = false;
        //variable
        int lastA = a / 10;
        int firstA = a / 10;
        int lastB = b / 10;
        int firstB = b / 10;

        //used if statement for rangA //15 13 //lasta = 5 firsta = 1 /lastb = 1 firstb = 3
        if ((a < 10 || a >= 99) ||(b < 10 || b >=99)){
            result = false;
        }else{
            if ((firstA == lastB || firstA == lastB || lastA  == lastB || lastA == firstB)) {
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first digit :");
        int a = input.nextInt();
        System.out.println("Enter second digit :");
        int b = input.nextInt();
        System.out.println(hasSharedDigit(a,b));
}

    }

