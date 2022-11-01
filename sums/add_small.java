public class add_small {
    public static void main(String[] args) {
        String cal ="2+4(45+8)*7";
        String []b=new String[cal.length()];
        char []c=new char[cal.length()];
        String temp="";
        int j=0,k=0;
        for(int i=0;i<cal.length();i++){
            if(Character.isDigit(cal.charAt(i))){
             temp+= cal.charAt(i)+"";
            }
            else{
                b[j++]=temp;
                temp="";
                c[k++]=cal.charAt(i);               
            }
        }
        int len=(int)cal.length();
        b[j-1]=cal.charAt(len-1)+"";               
       for (int i = 0; i < j; i++) {
        System.out.println(b[i]);
       }
       System.out.println();
       for (int i = 0; i < k; i++) {
        System.out.println(c[i]);
       }
    }   
}