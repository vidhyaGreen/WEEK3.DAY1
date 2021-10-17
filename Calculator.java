package week3day1;

public class Calculator {

	
	public void add(int x, int y)
	{
		
     int sum=x+y;
     System.out.println("The sum of two num is " +sum);
	}

	public void add(int x, int y, int z)
	{
		
     int sum=x+y+z;
     System.out.println("The sum of two num is " +sum);
	}
	
	public void sub(int x, int y)
	{
		
     int sub=x-y;
     System.out.println("The sum of two num is " +sub);
     
	}
	public void sub(int x, double y, double z)
	{
		
     double  sub=x-y-z;
     System.out.println("The sum of two num is " +sub);
     
     }
	public void mul(int x, int y)
	{
		
     int  mul=x*y;
     System.out.println("The sum of two num is " +mul);
     
     }
	public void mul(int x, double y, double z)
	{
		
     double  mul=x*y*z;
     System.out.println("The sum of two num is " +mul);
     
     }
	public void div(int x, int y)
	{
		
    int div=x/y;
    System.out.println("The sum of two num is " +div);

	}
	public void div(int x, double y)
	{
		
    double div=x/y;
    System.out.println("The sum of two num is " +div);

	}
	
	public static void main(String[] args) {
		
		Calculator obj= new Calculator();
		obj.add(5, 3);
		obj.add(5, 5, 7);
		obj.sub(8, 5);
		obj.sub(5, 8, 5);
		obj.mul(2, 5);
		obj.mul(5, 5, 7);
		obj.div(5, 7);
		obj.div(3, 5);
		
	}

}
