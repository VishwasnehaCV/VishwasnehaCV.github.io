public class SumofDigit {
    public static void main(String[] args) {
        int n = 4287; //takes input as 4287
        int sum = 0;   //sum is assigned 0 initally
        while(n>0){             //to loop untill n becomes 0
            int ld = n%10;        //n%10 gives the last digit in the number
            sum = ld + sum;      // sum is updated by adding last digit to the sum
            n=n/10;  //n is updated by removing the last digit from the number
        }
        System.out.println(sum);
        
    }

}
