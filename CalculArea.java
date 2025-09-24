public class CalculArea {
    //Assignment 2 question 11
    //over load methods to calculate the area of square , rectangle

    int Area(int side){
        return side*side;

    }
    int Area(int l, int b){
        return l*b;
    }
    public static void main(String[] args) {
        CalculArea a = new CalculArea();
        System.out.println("area of square is "+a.Area(8));
        System.out.println("area of rectangle "+a.Area(12,16));
    }

}
