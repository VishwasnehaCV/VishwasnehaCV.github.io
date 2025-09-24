public class Employee extends Person {
    int Salary;
    void display(int Salary){
        System.out.println("salary of "+name+" is "+Salary);
    }
    void Department(String dep,int bonous){
        System.out.println("department is "+dep);
        System.out.println("bonous is "+bonous);
    }
    public static void main(String[] args) {
        
    
    Employee e=new Employee();

    e.Department("Development", 200000);
    e.name="VISHWASNEHA";
    e.age=200;
    e.Salary=100000;
    e.display();
    e.display(100000);

    }


}
