package MavenPrograms;
public class ArithematicExceptionSp {
	public static void main(String[] args) {
		int a=10, b=20;
		try {
		int c = 100/0;
		System.out.println(c);
		}
		catch (ArithmeticException e ){
		System.out.println("Exception Handled"+e);
	    }
		finally {
		System.out.println("Important code");	
		}
		int sum = a+b;
		System.out.println(sum);
	}
}
