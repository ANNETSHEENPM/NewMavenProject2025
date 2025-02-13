package MavenPrograms;

public class ThrowSp {
	
	public void run() throws ArithmeticException{	
		throw new ArithmeticException();
	}
	public void test() throws ArithmeticException{	
		run();	
		}
	public static void main(String[] args) {
		ThrowSp c = new ThrowSp();
		try {
			c.test();
			}
			catch(Exception e) {
				System.out.println("Handled");		
			}
	}
}
