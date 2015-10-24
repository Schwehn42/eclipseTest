package human;
public class Name {
	
	private String name;
	private String middleName = "";
	private String lastName;
	
	public Name(String name, String middleName, String lastName) {
		this.name = name;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public Name(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	
	public String getName() {
		return this.name;
	}
	public String getMiddleName() {
		return this.middleName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getFullName() {
		return this.name + this.middleName + this.lastName;
	}
}
