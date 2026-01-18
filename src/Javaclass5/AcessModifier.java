package Javaclass5;

public class AcessModifier {

public String publicVar = "I am public variable";
private String privaterVar = "I am a private variable";
protected String protectedVar = "I am a protected variable";
int num = 70;

public AcessModifier(){

 }

public void publicMethod(){

    System.out.println("I am public method");
 }

public void privateMeth(){

        System.out.println("I am private method");
    }

    protected void protectedMethod(){

        System.out.println("I am protected method");
    }

void defaultmethod(){
    System.out.println("I am default method");
}

    public static void main(String[] args) {
        AcessModifier modifierobj= new AcessModifier();
        System.out.println(modifierobj.publicVar);
        modifierobj.publicMethod();

        System.out.println(modifierobj.privaterVar);
        modifierobj.privateMeth();


        System.out.println(modifierobj.protectedVar);
        modifierobj.protectedMethod();

        System.out.println(modifierobj.num);
        modifierobj.defaultmethod();

    }

}
