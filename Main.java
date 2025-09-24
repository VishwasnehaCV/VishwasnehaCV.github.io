public class Main {
       public static void main(String[] args) {
        ShapeCalc r = new rectangle(3,4);
        ShapeCalc c= new Circle(5); 
        ShapeCalc tri = new Triangle(2, 5);
        System.out.println("area of rectangle "+r.area());
        System.out.println("area of circle "+c.area());
        System.out.println("area of triangle "+tri.area());


        
    
    }

}
