package accessingjavaclass;

public class Welcome {
	public void helloWorld() {
		System.out.println("hello world");
	}
	public String returnhelloWorld() {
		return "hello world";
	}
	
	public String returnAcceptedParameter(String firstname, String secondname) {
		return firstname+secondname;
	}
	
}
