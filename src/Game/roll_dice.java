package Game;

public class roll_dice {
<<<<<<< HEAD
    private boolean fight;
    public static void main(String[] args) {
        int dice = (int) (Math.random() * 6);
        System.out.println(dice);
=======
    private int diceNo;
    public int roll_dice() {
        diceNo = (int) (Math.random() * 6)+1;
        return diceNo;

>>>>>>> 31e8198bd27e764dbd67b30c028ce5412b5f3f5e
    }


}
