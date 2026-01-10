package Javaclass2;

public class LogicalOperator {
    public static void main(String[] args) {

        int a = 200;
        int b = 100;
        int c = 300;

        //logical AND
        System.out.println("logical AND (a<b && b<c): " + (a<b && b<c));
        System.out.println("logical AND (a>b && b<c): " + (a>b && b<c));

        //logical OR
        System.out.println("logical AND (a>b || b>c): " + (a>b || b>c));
        System.out.println("logical AND (a<b || b>c): " + (a<b || b>c));

        //logical NOT
        System.out.println("Logical NOT !(a>b): " + !(a>b));
        System.out.println("Logical NOT !(a<b): " + !(a<b));
    }
}
