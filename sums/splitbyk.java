import java.util.Scanner;
public class splitbyk {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        String s="5F3Z-2e-9-w",s1="";
        int k = 4;
        s=s.replaceAll("-","");
        s=s.toUpperCase();
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            sum++;
            if(sum>k){
            s1+="-";
            sum=1;
            }
            s1+=s.charAt(i);
        } 
            System.out.println(s1);
    }
}