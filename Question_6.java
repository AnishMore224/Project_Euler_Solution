/*Find the difference between the sum of the squares of the first one hundred natural numbers 
and the square of the sum.*/

public class Question_6 {

	public static void main(String[] args) {
		int i,s=0,s1=0;
		for(i=1;i<=100;i++)
		{
			s=s+(i*i);
			s1+=i;
		}
		int d=(s1*s1)-s;
		System.out.println("Difference="+d);
	}

}

//output
//Difference=25164150