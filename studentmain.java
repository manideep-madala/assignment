import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class StudentMain {
	Set<Student> store = new HashSet<Student>();

	public static void main(String args[]) {

		StudentMain demo = new StudentMain();
		demo.runApp();
	}

	public void runApp() {
		Student student1 = new Student("1", 19);
		Student student2 = new Student("2", 21);
		Student student3 = new Student("3", 22);
		Student student4 = new Student("4", 23);
		store.add(student1);
		store.add(student2);
		store.add(student3);
		store.add(student4);
		List<Student> studentage = new ArrayList<Student>(store);
		display(studentage);
	}
	
	private void display(List<Student> studentage) {
		for (Student stobject : studentage) {
			int age=stobject.getAge();
			if(age>21)
			{
			System.out.println(age);
		}
	}
}
}