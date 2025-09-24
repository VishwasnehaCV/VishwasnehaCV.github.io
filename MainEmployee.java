public class MainEmployee {

    public static void main(String[] args) {
        Employeee m = new Manager(200000,10);
        Employeee d = new Developer(150000,8);
        Employeee i = new Intern(50000, 5);

        System.out.println("Manager "+m.calculateBonus());
        System.out.println("developer "+d.calculateBonus());
        System.out.println("intern "+i.calculateBonus());
    }
}
