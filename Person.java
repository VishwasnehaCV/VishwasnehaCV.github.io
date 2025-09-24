public class Person {
    String name;
    int age;
    void display(){
        System.out.println("name of person is "+ name);
        System.out.println("age of the person is "+age);
    }

    public static void main(String[] args) {
       
        Person p = new Person();
        p.name= "Vishwasneha";
        p.age = 20;
        p.display();
    }

}


