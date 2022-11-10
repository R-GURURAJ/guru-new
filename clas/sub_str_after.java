public class sub_str_after {
    public static void main(String[] args) {
        String s="geeksforgeeks";
        String op[] ={"ggs","gro","gfg","orf"};
        String ref=s;

        boolean ans=false;
        for (int j = 0; j < op.length; j++) {
            s=ref;
            for(int i = 0;i<op[j].length();i++){
            if(s.contains(op[j].charAt(i)+"")){
                ans=true;
                int st=s.indexOf(op[j].charAt(i));
                s = s.substring(st+1, s.length());
                // System.out.println(ans+" op = "+op[j].charAt(i)+" ind= "+ st+"   "+s);
                // System.out.println(ans);
            }else{
                ans=false;
                break;
            }
        }
        if(ans) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
  
    }
}