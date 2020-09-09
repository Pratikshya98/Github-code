 import java.util.*;
 public class  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Double d1 = sc.nextDouble();
		Double d2 = sc.nextDouble();
		String op = sc.next();
		Double result=0.00;
		if(op.equals("+"))
		{
			result=d1+d2;
        }
		else if(op.equals("-"))
		{
			result=d1-d2;
        }
		else if(op.equals("*"))
		{
			result=d1*d2;
        }
		else if(op.equals("/"))

		{
			result=d1/d2;
        } 
		System.out.println(result);


	}
}
