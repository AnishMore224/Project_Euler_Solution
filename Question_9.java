/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/
public class Question_9 {

	public static void main(String[] args) {
		int s=1000,a,b,c=0,c1=0;
		b=c/2;
		for(a=1;a<s/3;a++)
		{
			for(b=a;b<s/2;b++)
			{
				c=s-a-b;
				if(a*a+b*b==c*c)
				{
					c1++;
					break;
				}
				
			}
			if(c1>0)
				break;
		}
			System.out.println("abc="+a*b*c);
	}
}

//output
//abc=31875000