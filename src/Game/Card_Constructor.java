package Game;

public class Card_Constructor {
	String name;
	String specialCondition;
	
	public Card_Constructor(String name, String specialCondition) {
		this.name =name;
		this.specialCondition = specialCondition;
	}
	
	public String toString() {
		return "Name: "+name +"\nSpecial:"+specialCondition;
	}
}
