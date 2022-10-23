package JavaProgrammesweek_8;

import java.util.Scanner;

public class VowelConsonant3 {
    public void method1(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char ch = sc1.next().charAt(0);
        // To checking if alphabet is vowel or consonant by using if statment

        if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'|| ch == 'I' || ch == 'O'||ch=='U'){
            System.out.println(ch + " is a vowel");
        }else if((ch > 'a' && ch < 'z') || (ch > 'A' && ch < 'Z')) {
            System.out.println(ch + "is a consonant");
        }else {
            System.out.println("It's invalid Data");
        }
    }
    public static void main (String[] args){
        VowelConsonant3 obj1 = new VowelConsonant3();
        obj1.method1();
    }
}
