public class long_fun {
    public static void main(String[] args) {
        String a="ABADEFGABEF";
        String ans[]=rep(a);
        for (String string : ans) {
            String anss[]=rep(string);
            for (String g : anss) {
                System.out.println(g);
            }
        }
    }
    public static String []rep(String qus){
        String ans="";
        int hh=0;
        String anss[]=new String[qus.length()];
        for(int i=0;i<qus.length();i++){
            for(int j=i+1;j<qus.length();j++){
                if(qus.charAt(i)!=qus.charAt(j)){
                    ans+=qus.charAt(j);
                }
                else{
                    ans+=qus.charAt(i);
                    break;
                }
            }
            System.out.println(ans);
            anss[hh++]=ans;
            ans="";
        }
        return anss;
    }
}
