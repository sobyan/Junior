class TapeDeck {
	boolean canRecord = false;
	void playTape() {
		System.out.println("The tape is played");
	}
	void recordTape() {
		System.out.println("There is a tape recording");
	}
}

class TapeDeckTestDrive {
	public static void main(String[] args) {
		
		TapeDeck t = new TapeDeck();
		t.canRecord = true;
		t.playTape();
		
		if(t.canRecord == true) {
			t.recordTape();
		}
	}
}