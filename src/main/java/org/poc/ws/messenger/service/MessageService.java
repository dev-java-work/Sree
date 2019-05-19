package org.poc.ws.messenger.service;

import java.util.Map;

import org.poc.ws.messenger.model.Message;
import org.poc.ws.messenger.stub.MessageStub;

public class MessageService {

	private Map<Long,Message> messages = MessageStub.getMessageMap();
	
	public Message addMessage(Message message) {
		message.setId(messages.size());
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
}
