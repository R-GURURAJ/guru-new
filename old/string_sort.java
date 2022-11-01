import java.util.Scanner;
// import java.util.*;
    public class string_sort {
        static Scanner s=new Scanner(System.in);
        public static void main(String[] args) {
            String [] a={"hi","args","vih","hello","aaser"};
            for (String g : a) {
                System.out.println(g);
            }
           for (int i = 0; i < a.length-1; i++) {
            for (int k = i+1; k < a.length; k++) {
                if (a[i].compareTo(a[k])>0){
                    String tem=a[k];
                    a[k]=a[i];
                    a[i]=tem;
                }
            }                
        }
        System.out.println("----------------------");
        for (String g : a) {
            System.out.println(g);
        }
    }
}