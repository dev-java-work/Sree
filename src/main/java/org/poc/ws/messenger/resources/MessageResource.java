package org.poc.ws.messenger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.poc.ws.messenger.model.Message;
import org.poc.ws.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/hello")
	public String getResource() {
		return "Hello World!";
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message getResourceWithId(@PathParam("messageId") long id) {
		return messageService.getMessage(id);
	}
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message addResource(Message message) {
		return messageService.addMessage(message);		
	}
}
