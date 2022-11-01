package mettal;

public abstract class username {
    public static void main(String[] args) {
        String input1="hello",input2="hi";
        int input3=123456,input4=5;
        String Small_name,Longer_name;  
		if(input1.length()<input2.length()){
			Small_name=input1;
			Longer_name=input2;
		}else if(input1.length()<input2.length()){
			Small_name=input2;
			Longer_name=input1;
		}else{
			if(input1.charAt(0)<input2.charAt(0)){
				Small_name=input1;
				Longer_name=input2;
			}else{
				Small_name=input2;
				Longer_name=input1;
			}
		}
		String rev=Integer.toString(input3),rev2="";
		for(int i=rev.length()-1;i>=0;i--){
			rev2=rev2+rev.charAt(i);
		}
		String ans=Small_name.charAt(Small_name.length()-1)+""+Longer_name+""+rev.charAt(input4 -1)+""+rev2.charAt(input4-1);
		ans=ans.toUpperCase();
		ans=ans.replace((ans.charAt(1)+""), (ans.charAt(1)+"").toLowerCase());
		System.out.println(ans);
	}
}
