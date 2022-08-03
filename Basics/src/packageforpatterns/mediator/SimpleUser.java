package packageforpatterns.mediator;

public class SimpleUser implements User {
	
	Chat chat;
	String name;

	public SimpleUser(Chat chat, String name) {
		super();
		this.chat = chat;
		this.name = name;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		chat.sendMessage(message, this);
	}

	@Override
	public void getMessage(String message) {
		System.out.println(this.name + " received " + message);
		
	}

}
