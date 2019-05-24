package prob07;

public class Employee extends Person {
	private String dept;

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		if (dept != null && dept.length() > 0)
			this.dept = dept;
	}
	@Override
	public void print() {
		super.print();
		System.out.printf("[Employee] 부    서 : %s\n",this.getDept());
	}
}
