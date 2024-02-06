package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Message extends Post{

	private String text;
	private ArrayList<Message> messages;
	
	public Message(User author, String text) {
		super();
		this.setAuthor(author);
		this.messages = new ArrayList<Message>();
		this.text = text;
	}
}