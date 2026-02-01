package Javaclass4;

public class pConstructor {

    int instancevar = 100;
    static int staticvar = 50;


    public void displaymethod() {
        int localvar = 90;
        System.out.println("Local variable: " + localvar);
        System.out.println("Instance variable: " + instancevar);
        System.out.println("Static variable: " + staticvar);

    }


    public pConstructor() {

        System.out.println("Constructor called here. Instance var is " + instancevar);

    }

    public pConstructor(int value) {

        System.out.println("Perameterised constructor is here. Instsance value is " + instancevar);

    }

    public static void main(String[] args) {
        pConstructor newobj = new pConstructor();
        newobj.displaymethod();

        System.out.println("----------------------");
        pConstructor newobj2 = new pConstructor(300);
        newobj2.displaymethod();
    }


}
