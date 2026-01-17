package Javaclass4;

public class Practicemethod {

    public void voidmethod(){
        System.out.println(" hello void method");
    }

    public int nonvoidmethod(){

        int a= 55;
        int b= 25;
        int sum = a + b;
        return sum;
    }

    public int withoutparamet(){

        int c= 65;
        int d= 7;
        int addit= c + d;
        System.out.println(" addition of " + c + " and " + d + " is " + addit);
        return addit;
    }

    public int withpara( int c, int d){
        int subtraction = c - d;

        System.out.println(" Subtraction of " + c + " and " + d + " is " + subtraction);
        return subtraction;

    }

    public static void main(String[] args) {
        Practicemethod methodObj = new Practicemethod();
        methodObj.voidmethod();
        System.out.println("Return of sum is:" + methodObj.nonvoidmethod());
        System.out.println("Return of without parameter is: " + methodObj.withoutparamet());
        System.out.println(methodObj.withpara(70, 40 ));


    }


}
