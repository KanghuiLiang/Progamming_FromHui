package Game;

public class Shoes extends Treasure {

	public Shoes(String name, int bonus, int price, String raceRestrict, String classRestriction, String typeOfTreasure,
			String specialCondition) {
		super(name, bonus, price, raceRestrict, classRestriction, typeOfTreasure, specialCondition);
		// TODO Auto-generated constructor stub
		
		this.typeOfTreasure = "Shoes";
	}

	public String toSting() {
		return super.toString();
	}
}
