package Javaclass2;

public class AssigmentOperator {
    public static void main(String[] args) {

        int a = 80;
        int b = 100;

        System.out.println("Initial values A:" + a + ", B:" + b);

        a += 5;
        System.out.println("After adding 5 (a +=5): " + a);

        b -= 20;
        System.out.println("After subtracting 20 (b -=20): " + b);

        a *= 2;
        System.out.println("After multiplicating by 2 (a *=2): " + a);

        a /= 10;
        System.out.println("After divided by 10 (a *=2): " + a);

        b %= 9;
        System.out.println("After b % 9: " + b);
    }
}
