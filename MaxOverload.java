public class MaxOverload {
    //assignment 2 question 10

    int Max(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;

        }
        
    }
    int Max(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;

        }
        else{
            return c;
        }
    }
    public static void main(String[] args) {
        MaxOverload m = new MaxOverload();
        System.out.println("max of 2 integers is"+m.Max(31, 30));
        System.out.println("max of three numbers is"+m.Max(4, 3, 45));
    }

}
