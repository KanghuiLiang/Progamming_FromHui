package Game;

public class Item {
   String name;
   int damage;
      public Item(String name, int damage) {
	    this.name = name;
	    this.damage = damage;
      }

       public String toString() {
	   return name + "(Damage:"+damage+")";
      }
       

}
