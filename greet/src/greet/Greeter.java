package greet;

public class Greeter {
	private String name;
	private int age;
	public Greeter() {
		name = "John Park";
		age = 12;
	}
	public Greeter(String xName, int xAge) {
		name = xName;
		age = xAge;
	}
	public String toString() {
		return ("Greeter object: \nname: " + name + "\nage: " + age);
	}
}
