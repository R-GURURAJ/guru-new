import java.util.Scanner;
    public class string_change {
        static Scanner s=new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("enter your name:");
            String a=s.nextLine();
            char[] arr=a.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]=='z'){
                    arr[i]='a';
                }else if(arr[i]=='Z'){
                    arr[i]='A';
                }else{
                int sam=arr[i];
                sam++;
                char cc=(char)sam;
                arr[i]=cc;
                }
            }
            for (char c : arr) {
                System.out.println(c);
            }
        }
}