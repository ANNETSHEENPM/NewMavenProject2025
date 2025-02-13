package MavenPrograms;

public class MyCustomException extends Exception{

	public MyCustomException(){
		System.out.println("Custom Exception");
	}
	public MyCustomException(String m){
		System.out.println(m);
	}
}
