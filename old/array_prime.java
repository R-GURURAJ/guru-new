import java.util.Scanner;
    public class array_prime {
        static Scanner s=new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("enter the size of the array:");
            int siz=s.nextInt();
            int [] arr =new int [siz];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=s.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                mai(arr[i]);
            }
        }
 public static void mai(int a) {
        for (int i=2;i<a;i++) {
                int ans=a%i;
                if(ans==0){
                    return;
                }                
            }
            System.out.println("ans"+a); 
        }
}