package MavenPrograms;

public class Excep1 {
	public static void main(String[] args) {
		try {
			throw new MyCustomException("Calling Custom Exception");
		}
		catch (MyCustomException e){
		System.out.println("Handled");	
		}
	}
}

