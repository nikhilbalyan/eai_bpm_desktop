package votingeligibility;

import org.mule.api.MuleEvent;

public class TestException implements MessagingExceptionHandler {

	@Override
	public MuleEvent handleException(Exception exception, MuleEvent event) {
		// TODO Auto-generated method stub
		System.out.println("exceptionis = " + exception);
		return event;
	}

}