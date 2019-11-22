package demoMessage.demo;
import org.springframework.stereotype.Component;

import demoMessage.demo.Message;


public interface MessageSender {
	
	public void send(Message msg);

}
