package Javaclass5.Polymorphism;

public class Overload {

    public void overloading (){
        int a = 20;
        int b= 34;
        int sum = a + b;
        System.out.println("Print Sum for int overloading: " + sum);
    }

    public void overloading(int a, int b){
        int sum= a + b;
        System.out.println("Print sum for parameter int overloading");
    }

    public void overloading (double a, double b){
        double sum = a + b;
        System.out.println("Print Sum for double overloading: " + sum);

    }

    public void overloading(float a, float b){

        float sum = a + b;
        System.out.println("Print Sum for float overloading: " + sum);
    }
}
