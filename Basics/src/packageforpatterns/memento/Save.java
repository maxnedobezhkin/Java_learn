package packageforpatterns.memento;

import java.util.Date;

public class Save {
	public final String version;
	public final Date date;
	
	public Save(String version) {
		this.version = version;
		this.date = new Date();
	}

	public String getVersion() {
		return version;
	}

	public Date getDate() {
		return date;
	}
	

}
