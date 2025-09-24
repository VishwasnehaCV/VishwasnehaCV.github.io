public class GreetPerson {
    //Assignment 2 question 12
    //12.	Greet person – Overload methods to greet a person by first name or full name.
    void greet( String firstName){
        System.out.println(" Calling the person by the first name,   hello " + firstName);
    }

    void greet(String firstName, String LastName){
        System.out.println("calling the person by full name,   hello "+firstName+LastName);
    }

    public static void main(String[] args) {
        GreetPerson g =  new GreetPerson();
        g.greet("vishwa");
        g.greet("vishwa","sneha");
    }



}
