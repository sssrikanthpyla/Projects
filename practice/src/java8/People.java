package java8;

public class People {
	
	private String name;
	
	private int age;
	
	private boolean isEligible;

	public People(String name, int age, boolean isEligible) {
		super();
		this.name = name;
		this.age = age;
		this.isEligible = isEligible;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isEligible() {
		return isEligible;
	}

	public void setEligible(boolean isEligible) {
		this.isEligible = isEligible;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", isEligible=" + isEligible + "]";
	}
}
