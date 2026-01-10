package Javaclass3;

public class Jumping {
    public static void main(String[] args) {
        for (int f = 2; f<7; f++) {
            if (f == 5) {
                break;
            }

            System.out.println("iteration: " + f);
        }



        for (int g=1; g<10; g++){
            if (g % 2 == 1){
                continue;
            }
            System.out.println("Even number: " + g);

        }





    }
}
