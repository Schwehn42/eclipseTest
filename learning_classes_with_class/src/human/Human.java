package human;

public class Human {

	private Name name;
	private Gender gender;
	
	public Human(Gender gender, Name name) {
		this.gender = gender;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Human h1 = new Human(Gender.MALE, new Name("Jakob", "Schwan"));
		
	}

}
