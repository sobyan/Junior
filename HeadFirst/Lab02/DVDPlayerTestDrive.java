class DVDPlayer {
	
	boolean canRecord = false;
	
	void playDVD() {
		System.out.println("The DVD is played");
	}
	
	void recordDVD() {
		System.out.println("There is a DVD recording");
	}
}

class DVDPlayerTestDrive {
	public static void main(String[] args) {
		
		DVDPlayer d = new DVDPlayer();
		d.canRecord = true;
		d.playDVD();
		
		if (d.canRecord == true) {
			d.recordDVD();
		}
	}
}