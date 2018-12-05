public class BeerSong {
	public static void main (String[] args) {
		int beerNum = 55;
		String word = "bottles";
		
		while (beerNum > 0) {
			
			if (beerNum == 1) {
				word = "bottle";
			}
				
			//System.out.println(beerNum + " " + word + " of beer on the table");
				
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of the beer on the table");
				System.out.println(beerNum + " " + word + " of the beer.");
				System.out.println("Take one");
				System.out.println("Go in a circle.");
				beerNum--;
			}
			
			if (beerNum == 0) {
				System.out.println("No one bottle of the beer on the table");
			}		
			/* else {
				System.out.println("No one bottle of beer on the table");
			}			 */
		}	
	}	
}