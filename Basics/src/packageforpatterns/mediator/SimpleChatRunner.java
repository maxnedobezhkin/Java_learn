package packageforpatterns.mediator;

public class SimpleChatRunner {

	public static void main(String[] args) {
		SimpleTextChat chat = new SimpleTextChat();
		
		User admin = new Admin(chat, "Admin");
		User user1 = new SimpleUser(chat, "Alice");
		User user2 = new SimpleUser(chat, "Bob");
		
		chat.setAdmin(admin);
		chat.addUser(user1);
		chat.addUser(user2);
		
		user1.sendMessage("User 1");
	}

}
