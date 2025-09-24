public class MainVehicle {

    public static void main(String[] args) {
        Vehiclee c = new Car(150,6);
        Vehiclee b = new Bike(100, 8);
        Vehiclee t = new Truck(160, 9);

        System.out.println("speed of car "+c.Speed());
        System.out.println("speed of bike "+b.Speed());
        System.out.println("speed of truck "+t.Speed());
        
        // double sum = c.Speed()+b.Speed()+t.Speed();
        // double average = sum/3;
        System.out.println("average speed of car , bike, truck is "+(c.Speed()+b.Speed()+t.Speed())/3);

    }
}
