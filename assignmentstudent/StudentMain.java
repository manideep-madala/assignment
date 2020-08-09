package org.dxctraining;

import java.util.*;

public class StudentMain {

	private Map<String, Student> a = new HashMap<>();

	public static void main(String[] args) {
		StudentMain run = new StudentMain();
		run.runApp();
	}

	public void runApp() {
		a.put("a", (new Student("a", 20)));
		a.put("b", (new Student("b", 23)));
		a.put("c", (new Student("c", 24)));
		a.put("d", (new Student("d", 29)));
		app();
	}

	public void app() {
		Set<String> keys = a.keySet();
		for (String k : keys) {
			Student s = a.get(k);

			List<String> r = new ArrayList();
			r.add(s.getRollNo());

			if (s.getAge() % 2 == 0) {
				List<Student> leven = new ArrayList();
				leven.add(a.get(k));

			} else {
				List<Student> lodd = new ArrayList();
				lodd.add(a.get(k));
			}

		}

	}

}