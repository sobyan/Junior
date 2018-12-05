class TestArrays {
	public static void main(String[] args) {
		int ref;
		int y = 0;
		
		String[] islands = new String[4];
		islands[0] = "Bermud";
		islands[1] = "Fiji";
		islands[2] = "Azor islands";
		islands[3] = "Cosumel";		
		
		int[] index = new int[4];
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		
		while (y < 4) {
			ref = index[y];
			System.out.print("Islands = ");
			System.out.println(islands[ref]);
			y++;
		}
	}
}