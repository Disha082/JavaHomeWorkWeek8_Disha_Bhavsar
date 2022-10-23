package JavaProgrammesweek_8;
//4. Digit Sum Challenge

public class DigitSumChallenge4 {
    public static int sumDigits(int number){
        int sum =0;
        int reminder;
        if (number >=10) {
            while (number >=10) {
                reminder = number % 10;
                sum = sum + reminder;
                number = number / 10;
            }
            System.out.println("sum of the digit : " + sum);
        }else {
            sum = -1;
            System.out.println("Invalid value: " + sum);
        }
        return sum;
    }
    public static void main (String[] args){
        DigitSumChallenge4 obj = new DigitSumChallenge4();
        obj.sumDigits(10);
        obj.sumDigits(5478);
        obj.sumDigits(16);


    }
}
