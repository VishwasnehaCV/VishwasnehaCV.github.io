public class Exam {
    //Base class Exam with method result(). Subclasses MathExam, ScienceExam, EnglishExam override it.
    //1.	Create Exam with String result().
    //2.	Override to return "Pass/Fail" based on marks.
    //3.	Print result for each subject.
    void result(){
        
    }
}

class MathExam extends Exam{
    private  int marks;
    MathExam(int marks){
        this.marks = marks;
    }

    @Override
    void result(){
        if(marks>=35){
            System.out.println("passed");
        }
        else{
            System.out.println("failed");
        }
    }


}
class ScienceExam extends Exam{

    private  int marks;
    ScienceExam(int marks){
        this.marks = marks;
    }

    @Override
    void result(){
        if(marks>=35){
            System.out.println("passed");
        }
        else{
            System.out.println("failed");
        }
    }
}

class EnglishExam extends Exam{
    private  int marks;
    EnglishExam(int marks){
        this.marks = marks;
    }

    @Override
    void result(){
        if(marks>=35){
            System.out.println("passed");
        }
        else{
            System.out.println("failed");
        }
    }
}
