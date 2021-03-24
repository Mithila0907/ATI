
public class Armstrong {
	public static void main(String args[]) {
		int num=371;
		int n,temp;
		int sum=0;
		n=num;
		while(n!=0) {
			temp=n%10;
			sum=sum+(temp*temp*temp);
			n/=10;
		}
		if(sum==num) 
			System.out.println(num+" is a Armstrong num");
			else
				System.out.println(num+" is not a Armstong num");
		
	}
}
