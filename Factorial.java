public class Factorial {
    //Assignment 2 question 13
    //13.	Factorial calculation – Overload methods to calculate factorial of a single integer or an array of integers.

    int fact(int n){
        if(n<=1){
            return 1;
        }
        else{
        return n*fact(n-1);
        }

    int[] A ={1,2,3};
    int[] fact(int[] A){
        for(int i=0;i<=n;i++){
            a[i]*(fact(i-1));

        }
    }

    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.fact(5));
    }

}
