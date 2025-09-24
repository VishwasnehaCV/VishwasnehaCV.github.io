

public class StrSplChar {
    public static void main(String[] args) {
        //Given a string, remove all the special characters from the string

        
        // String S="str@#";
        // String res= S.replaceAll("[^a-zA-Z0-9]","");
        // System.out.println(res);
        String S = "vishwaSNEHA@#$123";
        // String res = "";
       

        for(int i=0;i<=S.length()-1;i++){
            char ch=S.charAt(i);

            if((ch>= 'A' && ch<= 'Z')||
               (ch>= 'a' && ch<= 'z')||
               (ch>= '0' && ch<= '9')){
                // res += ch;
            
            System.out.print(ch);
        }
        // System.out.print(res);

        } 
        
    
    }
        


    }
    


