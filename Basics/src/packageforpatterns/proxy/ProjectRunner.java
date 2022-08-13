package packageforpatterns.proxy;

public class ProjectRunner {
	public static void main(String[] args) {
		Project project = new RealProject("github.com/maxnedobezhkin");
		project.run();
	}
}
