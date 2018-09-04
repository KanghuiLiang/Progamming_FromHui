package Game;

import java.util.*;

public class Combat {
	
	public static void main(String[] args) {
		
//		Set<Monster> Monsters = new HashSet<Monster>();
//		String [] monName = {"Young Rat","Snails on Speed","Screaming Gekk","Potter_Plant","Big Foot","Bull Rog","Face Sucker","Gazebo"};
//		
//		for(int i = 0; i<monName.length; i++) {
//			Monsters.add(new Normal_Monster(monName[i], i, i, i, i, null));
//		}
//		
//		for(Monster Mon: Monsters) {
//			System.out.println(Mon+"\n");
//			
//		}
		
//		Map<String,Monster> Hmap = new HashMap<String, Monster>(); //create a map???
//		String[] na = {"guy", "girl","t","h"};
//		String[] H = {"q","w","e","y"};
//		for (int i = 0; i<na.length; i++) {
//			Hmap.put(na[i], new Hero(H[i]));
//		}
		Item[] listOfitem = {new Item("item1",9),new Item("item2",100)};
		Hero Player = new Hero(1, 100, listOfitem);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Now You are in the easy level!");
		
		int num;
		do {
			System.out.println("Choose the level of Monster you want.Use(1-8)");
             num = input.nextInt();
            switch(num) {
            case 1:
	        	System.out.println("Your Monster is");
	        	Monster Monster= new Normal_Monster("Nor1", 1, 10, 0, 0, null);
	        	System.out.println(Monster);
	        	break;
            case 2:
            	System.out.println("Your Monster is");
	        	Monster Monster1= new Normal_Monster("Nor2", 1, 10, 0, 0, null);
	        	System.out.println(Monster1);
	        	break;
            case 3:
            	System.out.println("Your Monster is");
	        	Monster Monster2= new Normal_Monster("Nor3", 1, 10, 0, 0, null);
	        	System.out.println(Monster2);
	        	break;
            case 4:
            	System.out.println("Your Monster is");
	        	Monster Monster3= new Normal_Monster("Nor4", 1, 10, 0, 0, null);
	        	System.out.println(Monster3);
	        	break;
            case 5:
            	System.out.println("Your Monster is");
	        	Monster Monster4= new Normal_Monster("Nor5", 1, 10, 0, 0, null);
	        	System.out.println(Monster4);
	        	break;
            case 6:
            	System.out.println("Your Monster is");
	        	Monster Monster5= new Normal_Monster("Nor6", 1, 10, 0, 0, null);
	        	System.out.println(Monster5);
	        	break;
            case 7:
            	System.out.println("Your Monster is");
	        	Monster Monster6= new Normal_Monster("Nor7", 1, 10, 0, 0, null);
	        	System.out.println(Monster6);
	        	break;
            case 8:
            	System.out.println("Your Monster is");
	        	Monster Monster7= new Boss_Monster("Boss", 1, 10, 0, 0, null);
	        	System.out.println(Monster7);
	        	break;
	        default:
	        	System.out.println("Wrong input please choose again");
	        	break;
         }
		}while (num<=0||num>=9);
           
            System.out.println();
            
		    System.out.println("Wanna fight or run?? Type Y TO start fighting,N to run.");
		    
		    String dec = input.next();
		    if(dec.equalsIgnoreCase("Y")) 
		    fight(Player);
		    else if(dec.equalsIgnoreCase("N")) 
		    run();
	}

	private static void run() {
     System.out.println("Are you sure?? You will lose your items.");
//     lose();
	}
	private static void fight(Hero Player) {
         System.out.println("Now "+Player);
         System.out.println("What items you want to use?");
	}
    
}
