import java.util.Scanner;
    public class triangle_fibn {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
            System.out.println("enter an num :");
            int siz=s.nextInt();
            int num1=0,num2=1;
            int count =siz;
            for (int i = 0; i<siz; i++) {
                for (int k = count; k>0; k--) {
                    System.out.print("-");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(num1+" ");
                    num1=num1+num2;
                    int t=num1;
                    num1=num2;
                    num2=t;
                }
                count--;
                System.out.println();
                    
            }   
    }
}