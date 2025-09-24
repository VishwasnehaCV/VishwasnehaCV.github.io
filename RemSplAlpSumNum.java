public class RemSplAlpSumNum {
    public static void main(String[] args) {
        //Given a string, remove all the special characters, print all the alphabetic characters and sum of numeric values

        String S = "VISHWASNEHAvishwasneha@#$&2004";
        int sum=0;

        // String temp = S.replaceAll("[^A-Za-z0-9]", "");
        // System.out.println(temp);
        for(int i=0;i<=S.length()-1;i++){
            char ch=S.charAt(i);

            if((ch>= 'A' && ch<= 'Z')||
               (ch>= 'a' && ch<= 'z')||
               (ch>= '0' && ch<= '9')){
                // res += ch;
            
            System.out.print(ch);
        }
        // System.out.print(res);

        if (ch>='0' && ch<='9') {

            System.out.print(ch-'0');
            sum = sum + (ch-'0');
            System.out.print(sum);
            
        }
        

        } 
        

        

        
    }

}
