import java.util.Scanner;

public class NewCalculator {

    public void sum(int num1, int num3) {
         int sum = num1 + num3;
        System.out.println("Sum result is" + sum);
    }

    public void divide(int num3, int num1) {
         double divide = num3 / num1;
        System.out.println("Division result is" + divide);
    }

    public void multiply(int num3, int num1) {
        int multiply = num3 * num1;
        System.out.println("Multiplication result is" + multiply);


    }

    public static void main(String[] args) {
        Scanner  scan = new Scanner( System.in);
        System.out.println("Enter the numbers");

        int num1 = scan.nextInt();
         int num2 = scan.nextInt();
         int num3 = scan.nextInt();
  NewCalculator calculator = new NewCalculator();
     // int  num1= 10;
     // int  num2 =14;
     // int  num3 = 12;


    calculator.sum(num1,num3);
    calculator.divide(num3, num1);
    calculator.multiply(num3, num1);
    }



}