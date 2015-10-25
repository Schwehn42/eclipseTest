package human;

import genes.Properties;
import genes.Property;
import relatives.Parents;

public class Human {

	private Name name;
	private Gender gender;
	private Parents parents;
	
	public Human() {};
	
	public Human(Gender gender, Name name) {
		this.gender = gender;
		this.name = name;
	}
	
	public Human(Gender gender, Name name, Parents parents) {
		this.gender = gender;
		this.name = name;
		this.parents = parents;
	}
	
	public static void main(String[] args) {
		Human h1 = new Human(Gender.MALE, new Name("Jakob", "Bozz", "Schwan"));
		Human h2 = new Human(Gender.FEMALE, new Name("Taylor", "Swift"));
		Human h3 = new Human(Gender.MALE, new Name("Barrack", "Obama"), new Parents(h1, h2));
		System.out.println(h3.getParents().getParent2().getName().fullName);
		
		Property p1 = new Property(Properties.HUMOR, -1.8f);
		System.out.println(p1.getValue());
		
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
}
