package org.poc.ws.messenger.stub;

import java.util.HashMap;
import java.util.Map;

import org.poc.ws.messenger.model.Message;

public class MessageStub {

	private static Map<Long, Message> messageMap = new HashMap<>();

	public static Map<Long, Message> getMessageMap() {
		return messageMap;
	}

	public static void setMessageMap(Map<Long, Message> messageMap) {
		MessageStub.messageMap = messageMap;
	}	
	
}
