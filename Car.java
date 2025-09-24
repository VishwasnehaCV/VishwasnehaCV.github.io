import java.util.Scanner;

public class Car {
    int wheels;
    int doors;
    String color;
    String brand;
    String model;
    float speed;
    boolean offroading;



    public static void main(String[] args) {
        Car thar = new Car();
        Car creta = new Car();
        Car swift = new Car();
        Scanner s = new Scanner(System.in);
        System.out.println("enter the values");
        thar.brand=s.next();
        thar.color=s.next();
        thar.doors=s.nextInt();
        thar.offroading=s.nextBoolean();
        thar.speed=s.nextFloat();
        System.out.println(thar.brand);


        
    }

}
