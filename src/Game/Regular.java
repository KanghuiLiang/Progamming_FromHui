package Game;

public class Regular extends Treasure {

	public Regular(String name, int bonus, int price, String raceRestrict, String classRestriction,
			String typeOfTreasure, String specialCondition) {
		super(name, bonus, price, raceRestrict, classRestriction, typeOfTreasure, specialCondition);
		// TODO Auto-generated constructor stub
		this.typeOfTreasure = "Regular";
	}
	
	public String toSting() {
		return super.toString();
	}

}
