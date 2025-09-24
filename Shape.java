import java.lang.Math;
public class Shape {
    int CalculateArea(int side){
        return side*side;
    }

    int CalculateArea(int l,int b){
        return l*b;

    }
    double CalculateArea(double r){
        return Math.PI*r*r;
    }


    public static void main(String[] args) {
        Shape s = new Shape();

        System.out.println("area of square "+s.CalculateArea(7));
        System.out.println("area of rect "+s.CalculateArea(3,7));
        System.out.println("area of square "+s.CalculateArea(34554));


    }

}
