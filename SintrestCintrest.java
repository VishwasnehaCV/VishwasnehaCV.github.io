public class SintrestCintrest {
    //assignment 2 question 14
    //14.	Interest calculation – Overload methods to calculate simple interest and compound interest.

    int SimpleInterest(int principal,int time,double rate){
        return (int) ((principal*time*rate)/100);
    }
    double SimpleInterest(double principal,double rate, int time,int n){
        // float a = 1+(rate/n);
        // double b = n*time;
        double amount =   principal*Math.pow((1+(rate/n)),(n*time) );
        return amount-principal;



    }


    public static void main(String[] args) {
        SintrestCintrest si = new SintrestCintrest();
        System.out.println(si.SimpleInterest(100000, 3, 0.08));
        System.out.println(si.SimpleInterest(100000,0.08,3,4));
    }

}
