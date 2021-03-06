package org.yanrakhorst.messenger.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.yanrakhorst.messenger.model.Message;
import org.yanrakhorst.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService ms = new MessageService();
	

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return ms.getAllTheMessages();
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") long messageId) {
		return ms.getMessage(messageId);
	}
	
}
