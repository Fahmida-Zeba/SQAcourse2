package Javaclass67.Javaclass7;

public class GenericWildcard <N extends Number>{

    private N genval;

    public GenericWildcard(N genval) {
        this.genval = genval;
    }

    public N getGenval() {
        return genval;
    }
}
