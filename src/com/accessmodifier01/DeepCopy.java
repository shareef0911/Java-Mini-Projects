package com.accessmodifier01;

class TestDeepCopy{
	int sid;
	String name;
	Department department;
	
	
	public TestDeepCopy(int sid, String name, Department department) {
		super();
		this.sid = sid;
		this.name = name;
		this.department = department;
	}
	public TestDeepCopy(TestDeepCopy testdp) {
		this.sid = testdp.sid;
		this.name = testdp.name;
		this.department = new Department(testdp.department);
	}
	
	
	
}
class Department{
	String name;

	public Department(String name) {
		super();
		this.name = name;
	}
	public Department(Department department) {
		this.name = department.name;
	}
}

public class DeepCopy {

	public static void main(String[] args) {
		Department d = new Department("JAVA");
		TestDeepCopy td = new TestDeepCopy(101,"Baji",d);
		
		System.out.println(td.sid);
		System.out.println(td.name);
		System.out.println(td.department.name);
		
		System.out.println("----------------------------------");
		
		TestDeepCopy td1 = new TestDeepCopy(td);
		
		System.out.println(td1.sid);
		System.out.println(td1.name);
		System.out.println(td1.department.name);
		
		System.out.println("----------------------------------");
		td1.sid = 9;
		td1.name = "Hem";
		td1.department.name = "sql";
		
		System.out.println(td1.sid);
		System.out.println(td1.name);
		System.out.println(td1.department.name);
		System.out.println("----------------------------------");
		
		System.out.println(td.sid);
		System.out.println(td.name);
		System.out.println(td.department.name);
		
	}

}
