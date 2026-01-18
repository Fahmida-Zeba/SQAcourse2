package Javaclass5.InheritPackage;

public class inheritanceMain {
    public static void main(String[] args) {
        System.out.println("single inheritance------------");
        childCat inheritObj = new childCat();
        inheritObj.eat();
        inheritObj.meow();

        System.out.println("Multi level inheritance------");

        babyCat inheritObj2 = new babyCat();
        inheritObj2.eat();
        inheritObj2.meow();
        inheritObj2.play();

        System.out.println("Hierarchical Inheritance--------");
        childDog inheritObj3 = new childDog();
        inheritObj3.bark();
        inheritObj3.eat();

   }
}


