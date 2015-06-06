
public class ClassTest {

	public static void main(String[] args) {

//		Instantiate 5 objects of student class
		Student josh = new Student("Josh", "Marshall");
		Student barry = new Student("Barry", "Fig");
		Student blake = new Student("Blake", "Runner");
		Student jessi = new Student("Jessi", "Lopes", "123 Street", "New York", "NY", "jessi@nyu.edu");
		Student todo = new Student("todo", "mystery", "somewhere", "city", "state", "email@domain.com");
		
		System.out.println(josh.toString());
		System.out.println(barry.toString());
		System.out.println(blake.toString());
		System.out.println(jessi.toString());
		System.out.println(todo.toString());
		
		todo.setFirstname("Katie");
		todo.setLastname("Flintstone");
		todo.setAddress("321 Blastoff st.");
		todo.setEmail("person@online.com");
		todo.setCity("Nashville");
		todo.setState("TN");
		todo.getFirstname();
		todo.getLastname();
		
		System.out.println(josh.toString());
		System.out.println(barry.toString());
		System.out.println(blake.toString());
		System.out.println(jessi.toString());
		System.out.println(todo.toString());
		
	}

}
