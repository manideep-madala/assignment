public class Student
{
    public String rollno;
    public int age;

    public Student(String rollno,int age)
    {
        this.age=age;
        this.rollno=rollno;
    }
    public Student()
    {
    	this("1",18);
    }
    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
    
    public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean equals(Object Arg)
	{
		if(this==Arg)
		{
			return true;
		}
		if(Arg==null || !(Arg instanceof Student))
		{
			return false;
		}
		Student	that=(Student)Arg;
		boolean isequal=this.age==that.age;
		return isequal;
	}


}