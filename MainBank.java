public class MainBank {
    public static void main(String[] args) {
        Bank sbi = new SBI(15000, 3, 0.06);
        Bank icici = new ICICI(15000, 3, 0.07);
        Bank hdfc = new HDFC(15000, 3, 0.075);

        System.out.println("the interst in the SBI bank is "+ sbi.getInterestRate());
        System.out.println("the interst in the ICICI bank is "+icici.getInterestRate());
        System.out.println("the interst at the HDFC bank is "+hdfc.getInterestRate());
    }

}
