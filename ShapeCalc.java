

public class ShapeCalc {
    //20/08/2025
    //Create a base class Shape with method area(). Subclasses Circle, Rectangle, Triangle should override area() to compute areas.
    
    int area(){
        System.out.println("calculating the area");
        return 0;

    }
    
}

    class rectangle extends ShapeCalc{
        private int l,b;


        rectangle(int l,int b){
            this.l = l;
            this.b=b;


        }
        @Override
        int area(){
            return l*b;

        }
    }

    class Circle extends ShapeCalc{

        private int r;
        Circle(int r){
            this.r=r;
        }

        @Override
        int area(){
            return (22/7)*r*r;

        }
    }

    class Triangle extends ShapeCalc{
        private int len,bre;
        Triangle(int len,int bre){
            this.len=len;
            this.bre=bre;
        }
        @Override
        int area(){
            return (1/2)*len*bre;
        }
    
    }

    

