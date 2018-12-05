public class SimpleDotCom {
	
	int[] locationCells;
	int numOfHits = 0;
	
	public void setLocationsCells(int[] locs) {
		locationCells = locs;
	}
	
	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "Fail";
		
		for(int cell : locationCells) {
			if(guess == cell) {
				result = "Catch";
				numOfHits++;
				break;
			}
		}
		if(numOfHits == locationCells.length) {
			result = "Drowned";
		}
		System.out.println(result);
		return result;

	}
}