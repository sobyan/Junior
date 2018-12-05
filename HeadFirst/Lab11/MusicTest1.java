import javax.sound.midi.*;

public class MusicTest1 {
	
	public void play() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("You got a synthesizer");
		} catch(MidiUnavailableException ex) {
			System.out.println("It is fail");
		}
	}
	
	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}
}