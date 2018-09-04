package Game;
	public class Location {
	    private int x, y;
	    private String[][] Stage;

	    public Location(int x, int y, String[][] stage) {
	        this.x = x;
	        this.y = y;
	        Stage = stage;
	    }

	    public void printLocation() {
//	        print array in array
	        for (int i = 0; i < Stage.length; i++) {
	            for (int j = 0; j < Stage[i].length; j++) {
	                if (y == i && x == j) {
	                    System.out.print("[*]");
	                } else {
	                    System.out.print("[ ]");
	                }
	            }
	            System.out.println();
	        }
	    }

	    public int getX() {
	        return x;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public int getY() {
	        return y;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }

	    public String[][] getStage() {
	        return Stage;
	    }

	    public void setStage(String[][] stage) {
	        Stage = stage;
	    }

}
