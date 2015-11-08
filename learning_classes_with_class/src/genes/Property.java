package genes;

public class Property {
	private Properties prop;
	private Object value;
	
	public Property(Properties prop, int value) {
		this.prop = prop;
		this.value = value;
	}
	
	public Property(Properties prop, float value) {
		this.prop = prop;
		this.value = value;
	}
	
	public Property(Properties prop, String value) {
		this.prop = prop;
		this.value = (String) value;
	}
	
	public Object getValue() {
		if (this.value instanceof Integer) {
			return (int) this.value;
		}
		else if (this.value instanceof Float) {
			return (float) this.value;
		}
		else if (this.value instanceof String) {
			return this.value;
		}
		else
			return null;
	}
	
	public Properties getProperty() {
		return this.prop;
	}
	
	
}
