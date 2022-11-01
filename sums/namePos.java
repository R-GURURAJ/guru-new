
public class namePos {
    public static void main(String[] args) {
        
    }
}


    /*
     * 	// Write code here...
		input1=input1.toLowerCase();
		input2=input2.toLowerCase();
		String str2[]=input2.split(":");
		String str_org[]=new String[str2.length];
		int j=0;
		char l[]=new char[input1.length()-1];
		int k=0;
		for(int i=0;i<input1.length();i++){
			if((input1.charAt(i)>64 && input1.charAt(i)<91) || (input1.charAt(i)>96 && input1.charAt(i)<123)){
				l[k++]=input1.charAt(i);
			}
		}
		for(int i=0;i<str2.length;i++){
			if(input1.length() == str2[i].length()){
				str_org[j++]=str2[i];
			}
		}
	String aa="";
		for(int i=0;i<str_org.length;i++){
			if(str_org[i]!=null){
			if(str_org[i].charAt(0)==input1.charAt(0)&&str_org[i].charAt(1)==input1.charAt(1)&&str_org[i].charAt(str_org[i].length()-2)==input1.charAt(input1.length()-2)&&str_org[i].charAt(str_org[i].length()-1)==input1.charAt(input1.length()-1)){
			aa+=str_org[i]+":";
			// System.out.println(str_org[i]);
			}
			}
		}
		if(aa.length()!=0){
		aa=aa.substring(0,aa.length()-1);
		aa=aa.toUpperCase();
		}else{
			aa="ERROR-009";
		}
		return aa;
	}
     */