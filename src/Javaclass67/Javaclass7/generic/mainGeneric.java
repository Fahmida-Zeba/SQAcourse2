package Javaclass67.Javaclass7.generic;

import Javaclass6.Car;

public class mainGeneric {
    public static void main(String[] args) {
        GenericTest<Integer> intGeneric = new GenericTest<>(78);
        System.out.println("Generic integer value is: " + intGeneric.getVarValue());

        GenericTest<Double> doubGeneric = new GenericTest<>(30.56);
        System.out.println("Generic double: " + doubGeneric.getVarValue());

        GenericTest<Car> carGeneric = new GenericTest<>(new Car());
        System.out.println("here is car: " + carGeneric.getVarValue());
    }
}
