package Oops.encapsulation;

public class main {
    public static void main(String[] args){

        car car1 = new car("ElonMusk","Tesla",2023);
        System.out.println(car1.getMaker());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
    }
}