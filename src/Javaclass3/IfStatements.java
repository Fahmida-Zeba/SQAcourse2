package Javaclass3;

public class IfStatements {
    public static void main(String[] args) {

        // simple if
        int age = 30;
        if (age>18)
        {
            System.out.println("you are adult");
        }

// if-else
        int numb = 87;
        if (numb % 2 == 0)
        {
            System.out.println("the number even");
        }
        else {
            System.out.println(" the number is odd");
        }

// if else-if
        int score = 67;
        if (score>90)
        {
            System.out.println("your grade is A");
        } else if (score> 85 && score < 89) {
            System.out.println("your grade is B");
        } else if (score>80) {
            System.out.println("your grade is C");
        } else if(score>70) {
            System.out.println("your grade is D");
        } else {
            System.out.println("bad grade");
        }



// nested if
        int num= 90;
        if (num>0){
            if (num% 2 ==0) {
                System.out.println(num + " positive even");
            }
            else {
                System.out.println("positive odd");
            }
        }
        else{
            System.out.println(num + " negative");
        }



    }
}
