public class Employeee {
    //Create a base class Employee with method calculateBonus(). Subclasses Manager, Developer, Intern should override to return different bonus % of salary.

    double calculateBonus(){
        return 0.0;

    }
}
    class Manager extends Employeee{
        private double salary,bonous;

        Manager(double salary,double bonous){
            this.salary = salary;
            this.bonous = bonous;
        }

        
        @Override
        double calculateBonus() {
            return (salary*bonous)/100;
            
        }


    }
    class Developer extends Employeee{
        private double salary,bonous;

        Developer(double salary,double bonous){
            this.salary = salary;
            this.bonous = bonous;
        }

        
        @Override
        double calculateBonus() {
            return (salary*bonous)/100;
            
        }



    }

     class Intern extends Employeee {
        private double salary,bonous;

        Intern(double salary,double bonous){
            this.salary = salary;
            this.bonous = bonous;
        }

        
        @Override
        double calculateBonus() {
            return (salary*bonous)/100;
            
        }


    
        
    }


