package Arrays;

public class nextlexicographic {
    public static void main(String args[]){
        String str="abcdxyz";
        System.out.print(lexicographic(str));
    }
    public static String lexicographic(String str){
        StringBuilder newstr=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='z'){
                newstr.append('a');
            }else if(str.charAt(i)==' '){
newstr.append(" ");
            }
            else{
                int ascii=str.charAt(i);
                newstr.append((char)(ascii+1));
            }
        }
        return newstr.toString();
    }
}
