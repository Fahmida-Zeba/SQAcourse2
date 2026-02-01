package Javaclass4;

public class Allvariable {

    int instancevar = 20;
    static int statvar = 30;

    public void method1() {

        int localvar1 = 50;
        System.out.println(" Local Variable 1: " + localvar1);
        System.out.println(" instance variable:" + instancevar);

    }

    public void method2() {

        int localvar2 = 60;
        System.out.println(" Local variable 2: " + localvar2);
        System.out.println(" static variable: " + statvar);
    }


    public static void main(String[] args) {
        System.out.println(" static var in Object: " + Allvariable.statvar);
        Allvariable varObj = new Allvariable();

        System.out.println(varObj.instancevar);
        varObj.method1();
        varObj.method2();
    }

}
