public class prime_in_name {
    public static void main(String[] args) {
        String name="harishgj";
        int []a=new int[name.length()];
        for (int i = 0; i < name.length(); i++) {
            a[i]=((int)name.charAt(i))-96;
        }
        for (int i : a) {
            int x=prime(i);
            if(x==0){
                char v=(char)(i+96);
                if(!(v=='a')){
                System.out.println(v+" - "+ i);
                }
            }
        }


    }
    static int prime(int i){
        int f=0;
        for(int j=2;j<i/2;j++){
            int x=i%j;
            if(x==0){
                f=1;
                break;
            }
        }
        return f;
    }
}
