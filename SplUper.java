public class SplUper {
    public static void main(String[] args) {
        //Given a string, remove all the special characters, print all the upper case characters first and lower case characters next

        String S = "snehaVISHWA@#$123";
        // String temp = S.replaceAll("[^A-Za-z0-9]", "");
        // System.out.println(temp);
        // String upper = temp.replaceAll("[^A-Z]", "");
        // System.out.println(upper);
        // String lower = temp.replaceAll("[^a-z]", "");
        // System.out.println(lower);

        for(int i=0;i<=S.length()-1;i++){
            char ch=S.charAt(i);

            if(ch>= 'A' && ch<= 'Z'){
                // res += ch;
            
            System.out.print(ch);
        }
        

        } 

        
        System.out.println();


        for(int i=0;i<=S.length()-1;i++){
            char ch=S.charAt(i);

            if(ch>= 'a' && ch<= 'z'){
                // res += ch;
            
            System.out.print(ch);
        }
        

        }

    }

}
