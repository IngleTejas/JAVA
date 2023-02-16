package Oops.polymorphism;
import java.lang.String;

class methodOverloading {
    // void show(){
    //     System.out.println("Method 1");
    // }
    // void show(String n){
    //     System.out.println("Mehtod 2");
    // }
    // public static void main(String args[])
    // {
    //     methodOverloading t1 = new methodOverloading();
    //     t1.show();
    // }   

    public int add(int x , int y){
        return x+y;
    }
    public double add(double x ,double y ,double z){
        return x+y+z;
    }
    public static void main(String args[]){
        methodOverloading adder = new methodOverloading();
        System.out.println("Adding two integer numbers:" + adder.add(21,423));
        System.out.println("Adding two double numbers:" + adder.add(21.43,423.4,324.43));

    }
}

