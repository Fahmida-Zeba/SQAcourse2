package Javaclass3;

public class Swtchstatement {
    public static void main(String[] args) {
        int day =2;
        switch (day){
            case 1:
                System.out.println("friday");
                break;
            case 2:
                System.out.println("saturday");
                break;
            case 3:
                System.out.println("sunday");
                break;
            case 4:
                System.out.println("monday");
            default:
                System.out.println("invalid day");
        }
    }
}
