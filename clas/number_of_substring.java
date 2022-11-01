package clas;

public class number_of_substring {
    public static void main(String[] args) {
        String a= "mani";
        int i=2,len=0;
        String arr[]=new String[100];
        String t2=a;
        while (i<=t2.length()) {
            if(t2.length()>=i){
                String temp = t2.substring(0, i);
                arr[len++] = temp;
                t2=t2.substring(i, t2.length());
            if(t2.length()==0){
                i++;
                t2=a;
                }
            }
            
        }
        for (int j = 0; j < len+1; j++) {
            System.out.println(arr[j]);
        }
    }
}
