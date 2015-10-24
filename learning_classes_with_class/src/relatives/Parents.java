package relatives;
import human.Human;

public class Parents {
	private Human parent1;
	private Human parent2;
	public Parents(Human h1, Human h2) {
		if (h1.equals(h2)) {
			System.err.println("Warning: Parents are the same person");
		}
		if (h1.getGender() == h2.getGender()) {
			System.err.println("Warning: Parents are of the same gender");
		}
		this.parent1 = h1;
		this.parent2 = h2;
	}
	
	public Human getParent1() {
		return this.parent1;
	}
	
	public Human getParent2() {
		return this.parent2;
	}
}
