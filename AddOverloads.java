public class AddOverloads {
    //assignment 2 question number 9
    //overload methods to add 2 integers, 2 doubles and 2 floats

    int add(int a, int b){
        return a+b;

    }
    double add(double a, double b){
        return a+b;
    }
    float add(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        AddOverloads a = new AddOverloads();
        System.out.println("addition of 2 integers "+a.add(1,2));
        System.out.println("addition of 2 doubles "+a.add(10000000,20000000));
        System.out.println("addition of 2 floats "+a.add(1.2,3.2));
    }

}
