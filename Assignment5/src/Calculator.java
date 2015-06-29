public class Calculator 
{
	public void add(int x,int y)
	{
		double sum=0;
		sum= x+y;
		System.out.println("the sum is " +sum);
	}
	
	public static void main(String[] args) {
		
		Calculator ca = new Calculator();
		ca.add(10, 20);
		
		
	}
}

/*public int average(int x);
public int gcd(int x);
public int lcm(int x);
public int sqrt(int x);
public int squre(int x);
*/

