public class Vehiclee {
    //Base class Vehicle has method speed(). Subclasses Car, Bike, Truck override it to display average speed.
    double Speed(){
        return 0.0;
    }

}
class Car extends Vehiclee{
    private double dist,time;

    Car(double dist, double time){
        this.time=time;
        this.dist=dist;
        }

    @Override
     double Speed(){
        return dist/time;
     }

    }

    class Bike extends Vehiclee{
    private double dist,time;

    Bike(double dist, double time){
        this.time=time;
        this.dist=dist;
        }

    @Override
     double Speed(){
        return dist/time;
     }

    }
    class Truck extends Vehiclee{
    private double dist,time;

    Truck(double dist, double time){
        this.time=time;
        this.dist=dist;
        }

    @Override
     double Speed(){
        return dist/time;
     }

    }