package org.dxctraining;

public class Student{
	private String rollno,name;
	private int age; 
	
	public Student(String rollno,int age,String name){
		this.rollno=rollno;
		this.age=age;
		this.name=name;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollno;
	}

public void setRollNo(String rollno) {
		this.rollno = rollno;
	}

public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}	
	@Override
	public int hashCode() {
		int hashcode=rollno.hashCode();
		return hashcode;
	}
	@Override
	public boolean equals(Object arg) {
		if(this==arg) {
			return true;
		}
		
	   if(arg==null || !(arg instanceof Student) ) {
			return false;
	   }
		
	    Student that=(Student)arg;	
		boolean isequal=this.rollno .equals(that.rollno);
		return isequal;
	}
	
}