package human;
public class Name {
	
	protected String name;
	protected String middleName;
	protected String lastName;
	protected String fullName;
	
	public Name(String name, String middleName, String lastName) {
		this.name = name;
		this.middleName = middleName;
		this.lastName = lastName;
		this.fullName = name + " " + middleName + " " + lastName;
	}
	
	public Name(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
		this.fullName = name + " " + lastName;
	}
	
	/*public String getName() {
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
	}*/
}
