package Game;

public class Two_hand extends Treasure {

	public Two_hand(String name, int bonus, int price, String raceRestrict, String classRestriction,
			String typeOfTreasure, String specialCondition) {
		super(name, bonus, price, raceRestrict, classRestriction, typeOfTreasure, specialCondition);
		// TODO Auto-generated constructor stub
		this.typeOfTreasure = "Two Hand Weapon";
	}

	public String toString() {
		return super.toString();
	}
}
