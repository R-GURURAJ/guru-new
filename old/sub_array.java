import java.util.Scanner;
    public class sub_array {
        static Scanner s=new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("enter the size of first array:");
            int as=s.nextInt();
            System.out.println("enter the values of first array:");
            int [] arra=new int [as];
            for (int i = 0; i < arra.length; i++) {
                arra[i]=s.nextInt();
            }
            System.out.println("enter the size of sec array:");
            int bs=s.nextInt();
            System.out.println("enter the values of sec array:");
            int [] arrb=new int [bs];
            for (int i = 0; i < arrb.length; i++) {
                arrb[i]=s.nextInt();
            }
            int coun=0;
            boolean aaaa=true;
            for (int i = 0; i < arrb.length; i++) {
                for (int j = 0; j < arra.length; j++) {
                    if(arrb[i]==arra[j]){
                        coun++;
                    }else{
                        continue;
                    }
                }
            }
            if(coun!=arrb.length){
                aaaa=false;
                }
            System.out.println(aaaa);

        }
}