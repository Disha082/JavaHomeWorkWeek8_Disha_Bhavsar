package JavaProgrammesweek_8;

public class SimpleCalculator18 {
    double firstNumber;
    double secondNumber;
    //1. method no parameters
    public double getFirstNumber(){
        return firstNumber;
    }
    //2.method no parameters
    public double getSecondNumber(){
        return secondNumber;
    }
    // 3. setmethod with one param
    public double setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
        return firstNumber;
    }
    //4. set method with one

    public double setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
        return secondNumber;
    }

    //5. get adition method with no param
    public double getAdditionResult() {
        double sum = firstNumber + secondNumber;
        return sum;
    }
//6. get substraction with no param

    public double getSubtractionResult() {
        double sub = firstNumber - secondNumber;

        return sub;
    }

    //7.get mutliplication with no param
    public double getMultiplicationResult() {
        double multi = firstNumber * secondNumber;
        return multi;
    }
    //8.method with division with no param

    public double getDivisionResult() {
        double div = firstNumber / secondNumber;
        if (secondNumber == 0) {
            return 0;
        }
        return div;
    }

    public static void main(String[] args) {
        SimpleCalculator18 calculator = new SimpleCalculator18();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber((4));
        System.out.println(("add=" + calculator.getAdditionResult()));
        System.out.println(("subtraction =" + calculator.getSubtractionResult()));
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply =" + calculator.getMultiplicationResult());
        System.out.println(("divide= " + calculator.getDivisionResult()));
    }

}




