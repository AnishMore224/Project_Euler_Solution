/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?*/
public class Question_7 {

	public static void main(String[] args) {
		int n=2;
		int t=3;
		int pn=3;
		while(n<=10001)
		{
			if(isprime(t))
				n++;
			pn=t;
			t+=2;
			
		}
		System.out.println("10001st prime number="+pn);
	}
	public static boolean isprime(int t)
	{
		for(int i=3;i<=Math.sqrt(t);i+=2)
			if(t%i==0)
				return false;
		return true;
	}

}

//output
//10001st prime number=104743