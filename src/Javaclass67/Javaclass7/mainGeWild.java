package Javaclass67.Javaclass7;

public class mainGeWild {
    public static void main(String[] args) {
        GenericWildcard<Integer> wildobj1 = new GenericWildcard<>(50);
        System.out.println("Print gen int value: " + wildobj1.getGenval());

        GenericWildcard<Double> wildobj2 = new GenericWildcard<>(79.89);
        System.out.println("Print gen double value: " + wildobj2.getGenval());


        //GenericWildcard<String> wildobj3 = new GenericWildcard<>(AERR);


    }
}
