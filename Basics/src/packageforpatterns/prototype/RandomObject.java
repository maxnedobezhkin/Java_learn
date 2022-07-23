package packageforpatterns.prototype;

public class RandomObject implements Copyable {
	
	private Type type;

	@Override
	public Copyable copy() {
		RandomObject complicatedobject = new RandomObject();
        return complicatedobject;
	}
	
	
    public enum Type {
        ONE, TWO
    }
    
    public void setType(Type type) {
        this.type = type;
    }

}
