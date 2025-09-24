import java.util.ArrayList;

public class AListExample {
    //creation and adding the elements to the dynamic array 
    //that is ArrayList
    //created the arraylist object using the syntax at line 11
    //added the elements the arraylist cars using the object and .add() method
    //using this .add() it adds in a normal way but if u want to add to the specific index use
    // .set(indexposition, element);

    //  get the elements from the array .get(index);
    //to acces this this we can use foreach( datatype alternatename : arraylist onject cars){
    //                                       system.out.println(alternatename); } adda247

    public static void main(String[] args) {
        
    
    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Range Rover");
    cars.add("Benz");
    cars.add("fortuner");
    cars.add("tata ");
    cars.add("breeza");
    cars.add("swift");
    cars.set(2, "BMW");

    for (String string : cars) {
        System.out.println(string);
        
    }
    System.out.println(cars.get(0));
    System.out.println(cars.get(3));
    System.out.println(cars.get(2));

    


    }



}
