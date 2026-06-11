package com.accessmodifier01;

class TestShallow implements Cloneable {
	private int sid;
	private String name;
	private Address add;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public TestShallow(int sid, String name, Address add) {
		super();
		this.sid = sid;
		this.name = name;
		this.add = add;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}

}

public class TestShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address add = new Address("Hyderabad");

		TestShallow ts = new TestShallow(101, "Baji", add);

		System.out.println(ts.getName());
		System.out.println(ts.getSid());
		System.out.println(ts.getAdd().city);

		TestShallow ts1 = (TestShallow) ts.clone();
		System.out.println("***************************************************");

		System.out.println(ts1.getName());
		System.out.println(ts1.getSid());
		System.out.println(ts1.getAdd().city);
		System.out.println("***************************************************");

		add.city = "Bangulore";
		TestShallow ts2 = new TestShallow(102, "Hem", add);
		System.out.println(ts2.getName());
		System.out.println(ts2.getSid());
		System.out.println(ts2.getAdd().city);
		System.out.println("***************************************************");
//		System.out.println(ts1.getName());
//		System.out.println(ts1.getSid());
//		System.out.println(ts1.getAdd().city);
//		System.out.println("***************************************************");
//		System.out.println(ts.getName());
//		System.out.println(ts.getSid());
//		System.out.println(ts.getAdd().city);

	}

}
