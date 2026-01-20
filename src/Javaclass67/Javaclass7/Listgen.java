package Javaclass67.Javaclass7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listgen {
    public static void main(String[] args) {

        List<Double> doubleList= new ArrayList<>();

        doubleList.add(10.4);
        doubleList.add(67.8);
        doubleList.add(2.7);
        doubleList.remove(67.8);
        doubleList.add(7.9);
        doubleList.add(2, 5.8);
        doubleList.remove(2);

        List<Double> anotherlist = Arrays.asList(60.7, 30.2, 20.4 );
        doubleList.addAll(anotherlist);

        for (Double d: doubleList){

            System.out.println("Print list: " + d);
        }

    }

}

