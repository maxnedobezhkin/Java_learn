package packageforpatterns.memento;

public class Test {
	public static void main(String[] args) {
		Project project = new Project();
		Repo repo = new Repo();
		
		System.out.println("Creating new project. Version 1.0");
		project.setVersionAndDate("Version 1.0");
		
		System.out.println(project);
		
		System.out.println("Saving current version to repo");
		repo.setSave(project.save());
		
		System.out.println("Updating to Version 1.1");
		project.setVersionAndDate("Version 1.1");
		
		System.out.println(project);
		
		System.out.println("Rolling back to Version 1.0");
		project.load(repo.getSave());
		
		System.out.println("Project after rollback");
		System.out.println(project);
	}
}
