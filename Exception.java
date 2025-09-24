import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        //assignment 5 problem 1
        // 22/8/25
    
//    Write a program that accepts two numbers and divides them. Handle the case when the denominator is 0.\
    Scanner s = new Scanner(System.in);
        System.out.println("enyer the integer a");
        int a = s.nextInt();
        System.out.println("enter the int b");
        int b = s.nextInt();

        try{
            
                int div = a/b;
                System.out.println("the result is "+div);
        
}catch(ArithmeticException e){
        System.out.println("divisible by zero exception");

}
    

    System.out.println("program ran successfully");

    }
}

