package Game;

import java.util.ArrayList;

public class Hero {
	int lvl;
	int bonus;
	ArrayList items;
//	String items;
	
	
	public Hero(int lvl,int bonus,ArrayList items) {
		this.lvl =lvl;
		this.bonus = bonus;
		this.items = items;
	}

	@Override
	public String toString() {
		return "Hero{" +
				"lvl=" + lvl +
				", bonus=" + bonus +
				", items=" + items +
				'}';
	}

	//	public String toString() {
//
//		String toReturn = "";
//		for (int i =0; i< items.length;i++) {
//			toReturn += items[i].toString() + "\n";
//		}
//		return "Your level is: " + lvl
//				+ "\nYour bonus is: " + bonus
//				+ "\n# of Items in your hand: " + toReturn;
//	}
	
}