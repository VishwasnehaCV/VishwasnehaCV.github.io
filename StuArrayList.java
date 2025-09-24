import java.util.ArrayList;
//assignment 5 question 21
//Store and display student names using ArrayList
//Basic usage of ArrayList.

public class StuArrayList {
    public static void main(String[] args) {
        
    
    ArrayList<String> StudentsList = new ArrayList<>();
    StudentsList.add("Adam");
    StudentsList.add("balu");
    StudentsList.add("chandu");
    StudentsList.add("divys");
    StudentsList.add("eti");
    StudentsList.add("fiyma");

    for (String stu : StudentsList) {
        System.out.println(stu);
        
    }


    }

    

}
