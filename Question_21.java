/*Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
 The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
Evaluate the sum of all the amicable numbers under 10000.*/

public class Question_21 {

	public static void main(String[] args) {
	int s=0,s1=0,s2=0,i,j;
	for(i=1;i<10000;i++)
	{s1=0;
	s2=0;
		for(j=1;j<i;j++)
		{
			if(i%j==0)
				s1+=j;
		}
		for(j=1;j<s1;j++)
			if(s1%j==0)
				s2+=j;
		if(i==s2&&s1!=s2)
			s+=i;
		
	}
	System.out.println("Sum of all the amicable numbers under 10000="+s);

	}

}

//output
//Sum of all the amicable numbers under 10000=31626
