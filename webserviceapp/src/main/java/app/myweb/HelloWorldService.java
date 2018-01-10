package app.myweb;

import javax.jws.WebService;

@WebService
public class HelloWorldService implements IHelloWorldService {

	@Override
	public String helloWorldFunc(String name) {
		return "hello World" + name;
	}

	@Override
	public int sum(int a, int b) {
		return a+b;
	}
	
	
	
}
