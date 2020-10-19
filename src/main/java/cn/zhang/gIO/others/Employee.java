package cn.zhang.gIO.others;

/**
 * java.io.Serializable 空接口，只作为标识
 * @author tako_
 *
 */
public class Employee implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//不需要序列化
	private transient String name;
	private double salary;
	public Employee() {}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
