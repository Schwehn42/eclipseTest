package human;

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
		Human h1 = new Human(Gender.MALE, new Name("Jakob", "Schwan"));
		
	}
	
	public Name getName() {
		return this.name;
	}
	public Gender getGender() {
		return this.gender;
	}

}
