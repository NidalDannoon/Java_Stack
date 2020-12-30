public class ProjectTest {
	public static void main(String[] args) {
		Project project1= new Project("company");
		System.out.println(project1.elevatorPitch());
		project1.setDescription("This is Description for Project1");
		System.out.println(project1.elevatorPitch());
	}
}