package Javaclass67.Javaclass7.generic;

public class GenericTest <T> {
    private T varValue;

    public GenericTest( T varValue){
        this.varValue= varValue;
    }

    public T getVarValue(){
        return varValue;
    }
}
