package Task;

public class TryCatch {

		public static void number(int n) 
		{		
			try 
			{
				int res=100/n;
				System.out.println(res);
			} 
			
			catch (ArithmeticException e) 
			{
				System.out.println("Invalid number for div");
			}
		}
		public static void main(String[] args) 
		{
			number(5);
			number(0);
			number(1);
		}
	}

