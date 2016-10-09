//Write a program to print the result of the following expressions provided the integer variable a is
//20 and b is 10.
//int b= a-- - --a;
//int c=a--;
//int d=a>>2;
//int e=a&b;

class Print
{
	public static void main(String[] args)
	{
		int a = 10, b = 20, c, d, e;
		b = a-- - --a;
		c = a--;
		d = a>>2;
		e = a&b;
	System.out.println ("Value of a is : " +a);
	System.out.println ("Value of b is : " +b);
	System.out.println ("Value of c is : " +c);
	System.out.println ("Value of d is : " +d);
	System.out.println ("Value of e is : " +e);
	}
}