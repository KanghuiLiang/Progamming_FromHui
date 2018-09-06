package Game;

import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//level1
		Map<String,Monster> map = new HashMap<String, Monster>(); //create a map???
	    map.put("Monster1", new Normal_Monster("TomMons1", 0, 0, 0, 0, null));
	    map.put("Monster2", new Normal_Monster("TomMons2", 0, 0, 0, 0, null));
	    map.put("Monster3", new Normal_Monster("TomMons3", 0, 0, 0, 0, null));
	    map.put("Monster4", new Normal_Monster("TomMons4", 0, 0, 0, 0, null));
	    map.put("Monster5", new Normal_Monster("TomMons5", 0, 0, 0, 0, null));
	    map.put("Monster6", new Normal_Monster("TomMons6", 0, 0, 0, 0, null));
	    map.put("Monster7", new Normal_Monster("TomMons7", 0, 0, 0, 0, null));
	    map.put("Monster8", new Boss_Monster("boss", 0, 0, 0, 0, null));
	    
//	    for(String name: map.keySet()) {
//	        Monster maps = map.get(name);
//	        System.out.println(name+ maps);
//	    }

		ArrayList<Item> obj = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			obj.add(new Item("item"+i, 9));
		}
//	    Item[] listOfitem = {new Item("item1",9),new Item("item2",100)};
		Hero Player = new Hero(1, 100, obj);  //level1 player
	    
	    Scanner input = new Scanner(System.in);
		System.out.println("Now You are in the easy level!");
		System.out.println(map.get("Monster1")+"\n");
		
		System.out.println("Wanna fight or run?? Type any keys TO start fighting,type N to run.");
<<<<<<< HEAD
		boolean flag = true;
		String dec = input.next();
		do {
			if (!dec.equalsIgnoreCase("N")) {
				System.out.println("Now " + Player);
				System.out.println("Which one item you want to use?");
				int num = input.nextInt();
<<<<<<< HEAD
				System.out.println("You are using " + obj.get(num));
			} else {
=======
				flag = false;
				System.out.println("You are using " + obj.get(num));
			} else {
				int diceNo = new roll_dice().roll_dice();
				System.out.println("Dice rolled the number is " + diceNo);
				if (diceNo < 5) {
					System.out.println("Unlucky you have to fight");
//					todo fight method here

					flag = false;
				} else {
					System.out.println("You can run XD");
					flag = false;
				}
>>>>>>> 31e8198bd27e764dbd67b30c028ce5412b5f3f5e

			}
		} while (flag);
=======
	    
	    String dec = input.next();
	    if(!dec.equalsIgnoreCase("N")) {
	    	System.out.println("Now "+Player);
            System.out.println("Which one item you want to use?");
            int num = input.nextInt();
            System.out.println("You are using "+obj.get(num));
	    }
	    
	    else{
	    System.out.println("Bye");
	} 
>>>>>>> parent of 069a632... some

	}
}

