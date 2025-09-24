public class Bank {
    //Base class Bank has method getInterestRate(). Subclasses SBI, ICICI, HDFC override it.
    //1.	Create class Bank with double getInterestRate().
    //2.	Override in subclasses: SBI (6%), ICICI (7%), HDFC (7.5%).
    //3.	In main(), create objects and print rates.
    double getInterestRate(){
        return 0.0;
    }

}
class SBI extends Bank{
    private double principle,time,rate;
    SBI(double principle,double time,double rate){
        this.principle = principle;
        this.time = time;
        this.rate=rate;
    }
    @Override
    
    double getInterestRate() {
        return (principle*time*rate)/100;
        
    }
}
class ICICI extends Bank{
    private double principle,time,rate;
    ICICI(double principle, double time, double rate){
        this.principle = principle;
        this.time = time;
        this.rate = rate;
    }

    @Override
    double getInterestRate(){
        return (principle*time*rate)/100;

    }
}
 
class HDFC extends Bank{
    private double principle,time,rate;
    HDFC(double principle, double time, double rate){
        this.principle = principle;
        this.time = time;
        this.rate = rate;
    }

    @Override
    double getInterestRate(){
        return (principle*time*rate)/100;

    }
}
