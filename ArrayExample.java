public class ArrayExample {

    public static void main(String[] args) {
        int[] A ;
        int n = 4;
        A = new int[n];
        A[0]=10;
        A[1]=30;
        A[2]=20;
        A[3]=40;

        for(int i = 0;i<n;i++){
            System.out.println(A[i]);
        }
    }
}
