package human;

//import genes.Properties;
//import genes.Property;
import genes.PropertyList;
import relatives.Parents;

public class Human {

	private Name name;
	private Gender gender;
	private int age;
	private Parents parents;
	private boolean hasParents = false; //if false, new Properties are generated, else randomly taken from the parents
	private PropertyList propertyList; //Properties are stored in here
	
	public Human() {};
	
	public Human(Gender gender, Name name, int age) {
		System.out.println(name.fullName + " (" + gender + "), " + age);
		this.gender = gender;
		this.name = name;
		this.age = age;
		
		this.propertyList = new PropertyList().generatePropertyList();
	}
	
	public Human(Gender gender, Name name, int age, Parents parents) {
		System.out.println(name.fullName + " (" + gender + "), " + age + " | Parents: " + parents.getParent1().getName().fullName + ", " + parents.getParent2().getName().fullName);
		this.gender = gender;
		this.name = name;
		this.parents = parents;
		this.hasParents = true;
		this.age = age;
		
		this.propertyList = new PropertyList().mergePropertyLists(this.parents);
	}
	
	public static void main(String[] args) {
		Human h1 = new Human(Gender.MALE, new Name("Jakob", "Bozz", "Schwan"), 17);
		Human h2 = new Human(Gender.FEMALE, new Name("Taylor", "Swift"), 18);
		Human h3 = new Human(Gender.MALE, new Name("Barrack", "Obama"), 42, new Parents(h1, h2));
		
		h1.getPropertyList().print();
		h2.getPropertyList().print();
		h3.getPropertyList().print();
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
	public int getAge() {
		return this.age;
	}
}
