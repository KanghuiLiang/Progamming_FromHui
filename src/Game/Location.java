package Game;
	public class Location {
	    private int x, y;
	    private String[][] Stage;

	    public Location(int x, int y, String[][] stage) {
	        this.x = x;
	        this.y = y;
	        Stage = stage;
	    }

		public Location(String[][] stage) {
			this.x = 1;
			this.y = 1;
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

	    public void moveLeft() {
			setX(getX() - 1);
		}
		public void moveRight() {
			setX(getX() + 1);
		}
		public void moveUp() {
			setY(getY() - 1);
		}
		public void moveDown() {
			setY(getY() + 1);
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
