package human;

import genes.Properties;
import genes.Property;
import genes.PropertyList;
import relatives.Parents;

public class Human {

	private Name name;
	private Gender gender;
	private Parents parents;
	private boolean hasParents = false; //if false, new Properties are generated, else randomly taken from the parents
	private PropertyList propertyList; //Properties are stored in here
	
	public Human() {};
	
	public Human(Gender gender, Name name) {
		this.gender = gender;
		this.name = name;
		
		this.propertyList = new PropertyList().generatePropertyList();
	}
	
	public Human(Gender gender, Name name, Parents parents) {
		this.gender = gender;
		this.name = name;
		this.parents = parents;
		this.hasParents = true;
	}
	
	public static void main(String[] args) {
		Human h1 = new Human(Gender.MALE, new Name("Jakob", "Bozz", "Schwan"));
		Human h2 = new Human(Gender.FEMALE, new Name("Taylor", "Swift"));
		Human h3 = new Human(Gender.MALE, new Name("Barrack", "Obama"), new Parents(h1, h2));
	}
	
	public Name getName() {
		return this.name;
	}
	public Gender getGender() {
		return this.gender;
	}
	public Parents getParents() {
		return this.parents;
	}
	public boolean hasParents() {
		return this.hasParents;
	}
	public PropertyList getPropertyList() {
		return this.propertyList;
	}
}
