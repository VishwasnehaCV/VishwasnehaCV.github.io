public class MultiArray {
    public static void main(String[] args) {
        int[][] multi = new int[5][5];

        multi[0][0]=10;
        multi[0][1]=20;
        multi[1][0]=30;
        multi[1][1]=40;
        // multi[0][4]=50;
        // multi[1][0]=100;
        // multi[1][1]=200;
        // multi[1][2]=300;
        // multi[1][3]=400;
        // multi[1][4]=500;
        // multi[2][0]=1000;
        // multi[2][1]=2000;
        // multi[2][2]=3000;
        // multi[2][3]=4000;
        // multi[2][4]=5000;
        // multi[3][0]=10000;
        // multi[3][1]=20000;
        // multi[3][2]=30000;
        // multi[3][3]=40000;
        // multi[3][4]=50000;
        // multi[4][0]=11;
        // multi[4][1]=22;
        // multi[4][2]=33;
        // multi[4][3]=44;
        // multi[4][4]=55;

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(multi[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }

    }

}
