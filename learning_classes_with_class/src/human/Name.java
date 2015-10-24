package human;
public class Name {
	
	public String name;
	public String middleName;
	public String lastName;
	public String fullName;
	
	public Name(String name, String middleName, String lastName) {
		this.name = name;
		this.middleName = middleName;
		this.lastName = lastName;
		this.fullName = name + middleName + lastName;
	}
	
	public Name(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
		this.fullName = name + lastName;
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
