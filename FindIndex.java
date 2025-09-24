import java.util.Scanner;

//EXAMPLE OF LINEAR SEARCH

//create an array form the user and find the number x and print the iindex of X
public class FindIndex {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);

    System.out.print("enter the size of array ");
    int size = s.nextInt();

    int number[] = new int[size];
    System.out.println("enter the elements");

    for(int i = 0; i<size; i++){
        number[i] = s.nextInt();
    }

    System.out.println("enter thte number X that u have to find");
    int x = s.nextInt();
    
    for(int i = 0; i<number.length;i++){
        if(number[i]==x){
            System.out.println("number"+x+"found at the index"+i);
        }
    }


    System.out.println("print the elements in the array ");
    for(int i = 0; i<size; i++){

        System.out.println(number[i]);
    }


    }



}
