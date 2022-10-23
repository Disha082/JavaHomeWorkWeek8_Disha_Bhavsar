package JavaProgrammesweek_8;

public class Diamond14 {
    public static void method1(){
        int i;
        int j;
        int k;
        for (i = 1; i <= 5; i++) //ro
        {
            for (j = 5; j > i; j--)//colum
            {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (i = 4; i >=1; i--)//raw
        {
            for (j = 5; j > i; j--)//colum
            {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        method1();

}
}
