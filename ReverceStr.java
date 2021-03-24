
public class ReverceStr {
	public static void main(String args[]) {
		String str="SGIC Students";
		String reverce=" ";
		System.out.println("String is:"+str);
		int len=str.length();
		for(int i=len-1;i>=0;i--)
			reverce=reverce+str.charAt(i);
		{
			System.out.println("Reverce String is:"+reverce);
		}
	}
}
