package Game;

public class one_hand extends Treasure {

	public one_hand(String name, int bonus, int price, String raceRestrict, String classRestriction,
			String typeOfTreasure, String specialCondition) {
		super(name, bonus, price, raceRestrict, classRestriction, typeOfTreasure, specialCondition);
		// TODO Auto-generated constructor stub
		this.typeOfTreasure = "One Hand Weapon";
	}

	public String toSting() {
		return super.toString();
	}
}
