package Javaclass2;

public class GradingSystem {
    public static void main(String[] args) {

        int a = 70;
        int b = 90;

        int max = (a > b) ? a : b;
        System.out.println("Max value:" + max);

        int min = (a < b) ? a : b;
        System.out.println("Min value:" + min);

        String grade = ( a >90 && a<=100) ? "A" :
                ( a >= 80 && a < 90) ? "B" :
                    ( a >= 70 && a < 80) ? "C" :
                            ( a >= 60 && a < 70) ? "D" :
                                    ( a <= 50) ? "Fail" : "invalid" ;

        System.out.println("Final Grade: " + grade);
    }
}
