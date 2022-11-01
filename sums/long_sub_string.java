import java.util.*;

public class long_sub_string {
    
    public static void main(String[] args) {
        // ABDEFGABEF” are “BDEFGA” and “DEFGAB”,
        String qus="ABDEFGABEF";
        String arr[]=new String[qus.length()];
        String ans="";
        int y=0;
        for(int i=0;i<qus.length();i++){
            for(int j=i+1;j<qus.length();j++){
                if(qus.charAt(i)!=qus.charAt(j)){
                    if(!(ans.contains(qus.charAt(j)+""))){
                    ans+=qus.charAt(j);
                    }else{
                        break;
                    }
                }
                else{
                    ans=qus.charAt(i)+ans;
                    break;
                }
            }
            arr[y++]=ans;
            // System.out.println(ans);
            ans="";
        }
        // Arrays.sort(arr);
        for (String string : arr) {
            System.out.println(string+" "+string.length());
        }
    }
}
