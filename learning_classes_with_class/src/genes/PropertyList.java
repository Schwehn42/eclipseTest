package genes;

import java.util.ArrayList;
import java.util.List;
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
		newPropList.addProperty(new Property(Properties.HUMOR, Random.genRandom(0, 100)));
		newPropList.addProperty(new Property(Properties.INTELLIGENCE, Random.genRandom(0, 100)));
		newPropList.addProperty(new Property(Properties.SELF_CONFIDENCE, Random.genRandom(0, 100)));
		newPropList.addProperty(new Property(Properties.PLEASANTRY, Random.genRandom(0, 100)));
		
		return newPropList;
	}
}
