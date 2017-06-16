package org.yanrakhorst.messenger.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.yanrakhorst.messenger.model.Message;
import org.yanrakhorst.messenger.util.MockDatabase;

public class MessageService {
		
	
	public MessageService() {
		//load a few simple messages
		loadMessages();
		System.out.println("in constructor " + MockDatabase.messages);
	}

		
	public void loadMessages() {
	MockDatabase.messages.put(1L, new Message(1,"Yan","this is Yan's message")); 

	MockDatabase.messages.put(2L, new Message(2,"Maarten","this is Maarten's message"));
				
	}
		
	public List<Message> getAllTheMessages() {
		List<Message> list = new LinkedList<>(MockDatabase.messages.values());
		return list;
	}
	
	public Message getMessage(long messageId) {
		System.out.println("in getMessage " + MockDatabase.messages);
		Message m = MockDatabase.messages.get(messageId);
		System.out.println("hi " + m.toString());
		return m;
	}
	
}
