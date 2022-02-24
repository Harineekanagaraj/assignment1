package week1.day2.assignment;

public class SumOfDigits {

	public static void main(String[] args) {
		int n =5678,m;
		int sum=0;
		while(n!=0) {
		m=n%10;
				sum=sum+m;
				n=n/10;
		System.out.println(sum);
		}
	}
}
