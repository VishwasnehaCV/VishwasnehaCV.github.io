import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AList {
    public static void main(String[] args) {
        ArrayList<String> Students = new ArrayList<>();
        Students.add("vishwa");
        Students.add("yashu");
        Students.add("Harshi");
        Students.add("bhavana");

        // n = Students.size();
        System.out.println(Students.size());

        // for(int 1=0;i<n;i++){
        //     System.out.println(Students.get(i));
        // }

        System.out.println(Students.get(0));
        System.out.println(Students.getLast());
        System.out.println(Students.getClass());

        for(String stu: Students){
            System.out.println(stu);

        }
    





        
    }

}
