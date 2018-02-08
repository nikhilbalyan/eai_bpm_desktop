package votingeligibility;

import org.mule.api.MuleEvent;
import org.mule.api.exception.ExceptionHandler;

public interface MessagingExceptionHandler extends ExceptionHandler {
	MuleEvent handleException(Exception exception, MuleEvent event);
}
