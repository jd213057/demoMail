package demoMessage.demo;

import org.springframework.stereotype.Component;

@Component
public class SMSSender implements MessageSender  {

	public void send(Message msg) {
		System.out.println( "Hello this is a SMS : " + msg);
	}

}
