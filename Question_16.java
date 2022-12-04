/*215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 21000?*/
public class Question_16 {

	public static void main(String[] args) {
		int n=(int)Math.pow(2,1000);
		int d=0;
		while(n!=0)
		{
			int b=n%10;
			d=d+b;
			n/=10;
		}
		System.out.println("Sum of digit="+d);
	}

}

//output
//Sum of digit=46