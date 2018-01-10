package app.myweb;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IHelloWorldService {

	@WebMethod
	String helloWorldFunc(String name);
	
	@WebMethod
	int sum(int a, int b);
	
}
