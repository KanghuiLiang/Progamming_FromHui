package Game;

public class Hero {
	int lvl;
	int bonus;
	Item[] items;
//	String items;
	
	
	public Hero(int lvl,int bonus,Item[] items) {
		this.lvl =lvl;
		this.bonus = bonus;
		this.items = items;
	}
	
	public String toString() {
		
		String toReturn = "";
		for (int i =0; i< items.length;i++) {
			toReturn += items[i].toString() + "\n";
		}
		return "Your level is: " + lvl
				+ "\nYour bonus is: " + bonus
				+ "\n# of Items in your hand: " + toReturn;
	}
	
}