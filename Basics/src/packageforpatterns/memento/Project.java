package packageforpatterns.memento;

import java.util.Date;

public class Project {
	private String version;
	private Date date;
	
	private void setVersionAndDate(String version) {
		this.version = version;
		this.date = new Date();
	}

	@Override
	public String toString() {
		return "Project [version=" + version + ", date=" + date + "]";
	}
	
	
}
