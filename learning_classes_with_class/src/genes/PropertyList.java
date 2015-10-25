package genes;

import java.util.ArrayList;
import java.util.List;

import relatives.Parents;
import util.Random;

public class PropertyList {
	private List<Property> propList = new ArrayList<Property>();
	
	public PropertyList() {
		
	}
	
	public PropertyList(Property...properties) {
		for (Property prop : properties) {
			this.propList.add(prop);
		}
	}
	
	public void addProperty(Property property) {
		this.propList.add(property);
	}
	
	public List<Property> getProps() {
		return this.propList;
	}
	
	
	
	public PropertyList generatePropertyList() { //generated a new random PropertyList (mainly for Humans w/o parents)
		PropertyList newPropList = new PropertyList();
		newPropList.addProperty(new Property(Properties.HUMOR, Random.genRandomInt(0, 100)));
		newPropList.addProperty(new Property(Properties.INTELLIGENCE, Random.genRandomInt(0, 100)));
		newPropList.addProperty(new Property(Properties.SELF_CONFIDENCE, Random.genRandomInt(0, 100)));
		newPropList.addProperty(new Property(Properties.PLEASANTRY, Random.genRandomInt(0, 100)));
		
		return newPropList;
	}
	
	public PropertyList mergePropertyLists(Parents parents) { //either the value from parent1 or parent2 is take for a Property
		PropertyList newPropList = new PropertyList();
		
		newPropList.addProperty(new Property(Properties.HUMOR, (int) chooseRandom(parents, 0).getValue()));
		newPropList.addProperty(new Property(Properties.INTELLIGENCE, (int) chooseRandom(parents, 1).getValue()));
		newPropList.addProperty(new Property(Properties.SELF_CONFIDENCE, (int) chooseRandom(parents, 2).getValue()));
		newPropList.addProperty(new Property(Properties.PLEASANTRY, (int) chooseRandom(parents, 3).getValue()));
		
		return newPropList;
	}
	
	private Property chooseRandom(Parents parents, int propertyIndex) {
		List<Property> parent1Props = parents.getParent1().getPropertyList().getProps();
		List<Property> parent2Props = parents.getParent2().getPropertyList().getProps();
		
		if (Random.genRandomBoolean()) {
			return parent1Props.get(propertyIndex);
		}
		else {
			return parent2Props.get(propertyIndex);
		}
	}
	
	public void print() {
		for (int i = 0; i < this.propList.size(); i++) {
			Property prop = this.propList.get(i);
			System.out.println(prop.getProperty() + " " + prop.getValue());
		}
		System.out.println();
	}
}
