package renu.gusain.test;

public class Driver {
    public static void main(String[] args) {
        Test multiplyer=(a,b)->a*b;
       int result= multiplyer.multiply(5,9);
        System.out.println(result);
    }
}
