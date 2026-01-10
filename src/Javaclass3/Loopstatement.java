package Javaclass3;

public class Loopstatement {
    public static void main(String[] args) {

        //simple for loop
        for (int i= 1; i<20; i+=3) {
            System.out.println("iteration: " + i );
        }

        int j =90;
        for (; j>0;) {
            System.out.println("count: " + j);

            j-=5;
        }



    //extend loop
    String[] flower = {"Rose", "Sunflower", "Tulip", "Lily"};
            for (String flowername : flower){

        System.out.println("Flowers: " + flowername);
    }

            //while loop

        int count=5;
            while (count<=20){
                System.out.println("Count: " + count);
                count++;
            }

            // do while loop

        int numb= 5;
            do {
                System.out.println("number count: " + numb);
                numb++;
            }while (numb<10);

}
}