package Game;

public class Normal_Monster extends Monster {

	public Normal_Monster(String name, int mstrLVL, int trsureFr, int lseLVL, int scapStt, String specialCondition) {
		super(name, mstrLVL, trsureFr, lseLVL, scapStt, specialCondition);
		// TODO Auto-generated constructor stub
	}

	
	public String toString() {
		return "This monster is " + name + "[Normal] it's level is: " + monsterLVL 
											+ "\n\t *Treasure: " + treasureFor 
											+ "\n\t *In case of fail you will loose: " + looseLVL + " lvl(s),"
											+ "\n\t *Escape?: " + escapeStat
											+ "\n\t *Special Condition: " + specialCondition + ".";
     }


	@Override
	public int Attack() {
		System.out.println("this Monster needs "+treasureFor +" to fight");
		return treasureFor;
	}
}