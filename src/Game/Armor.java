package Game;

public class Armor extends Treasure {

	public Armor(String name, int bonus, int price, String raceRestrict, String classRestriction, String typeOfTreasure,
			String specialCondition) {
		super(name, bonus, price, raceRestrict, classRestriction, typeOfTreasure, specialCondition);
		// TODO Auto-generated constructor stub
		this.typeOfTreasure = "Armor";
	}
	
	public String toSting() {
		return super.toString();
	}

}
