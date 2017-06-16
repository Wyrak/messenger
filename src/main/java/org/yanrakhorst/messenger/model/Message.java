package org.yanrakhorst.messenger.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private int id;
	private String author;
	private String dateTime;
	private String messageBody;
	
	public Message() {}

	public Message(int id, String author, String messageBody) {
		this.id = id;
		this.author = author;
		this.dateTime = LocalDateTime.now().toString();
		this.messageBody = messageBody;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	
	
	
	
}
