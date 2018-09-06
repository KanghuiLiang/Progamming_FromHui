package Game;

public class roll_dice {
    private int diceNo;
    public int roll_dice() {
        diceNo = (int) (Math.random() * 6)+1;
        return diceNo;

    }


}
