class TestArrays {
	public static void main(String[] args){
	int [] index = new int[4];
	
	// islands array
	String [] islands = new String[4];
	
	islands[0] = "Bermuda";
	islands[1] = "Fiji";
	islands[2] = "Azore";
	islands[3] = "Cozume1";

	int y = 0;
	int ref;
	while(y<4){
		ref = index[y];
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		y = y+1;
	}
	System.out.print("islands = ");
	System.out.print("islands[ref]");
	}
}