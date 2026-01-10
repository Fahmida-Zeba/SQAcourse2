package Javaclass2;

public class TernaryOperator {
    public static void main(String[] args) {

        int a = 35;
        int b = 200;

        int min = (a < b) ? a :b ;
        System.out.println("min value: " + min);

        int number = ( a % 2 == 0) ? a : b;
        System.out.println(" Even number: " + number);

        int number1 = 45;
        String result = (number1 % 2 == 1) ? "Odd" : "Even";
        System.out.println(" The number " + number1 + " is " + result);

    }
}
