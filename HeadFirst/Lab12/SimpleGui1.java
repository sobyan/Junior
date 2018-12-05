import javax.swing.*;

public class SimpleGui1 {
	
	public void changeIt() {
			button.setText("I've been clicked!");
		}
	
	public static void main(String[] args) {
		
		JFrame frame= new JFrame();
		JButton button = new JButton("CLICK ME");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.changeIt();
		
		
	}
}