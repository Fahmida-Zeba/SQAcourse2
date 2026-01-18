package Javaclass5.Polymorphism;

public class PolymorphMain {
    public static void main(String[] args) {
        Overload overldObj = new Overload();
        overldObj.overloading();
        overldObj.overloading(30.23, 45.56);
        overldObj.overloading(67.89f, 90.70f);
        overldObj.overloading(27, 90);

        overrideChild overrrideObj = new overrideChild();
        overrrideObj.eat();
    }
}
