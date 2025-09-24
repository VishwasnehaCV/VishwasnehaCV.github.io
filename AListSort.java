import java.util.ArrayList;
import java.util.Collections;


public class AListSort {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

            cars.add("Range Rover");
            cars.add("Benz");
            cars.add("fortuner");
            cars.add("tata ");
            cars.add("breeza");
            cars.add("swift");

            Collections.sort(cars);
            for (String i : cars) {
                System.out.println(i);
                
            }
    }

}
