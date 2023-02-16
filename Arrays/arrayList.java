package Oops.Arrays;
import java.util.ArrayList;

public class arrayList {
    public static void main(String args[]){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Tesla");
        cars.add("volvo");
        cars.add("Maruti");
        cars.add("Tata");
        cars.add("BMW");
        System.out.println(cars); 
        String value =cars.get(0);
        System.out.println(value);
    }
   
}
