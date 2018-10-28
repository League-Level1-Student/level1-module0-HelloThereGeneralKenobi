import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.MalformedInputException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
		
	}
	
	public void showButton() {
	     System.out.println("Button clicked");
	     
	     JFrame frame = new JFrame();
	     frame.setVisible(true);
	     
	     JButton button = new JButton();
	     frame.add(button);
	     
	     button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
int rand = new Random().nextInt(5);
		
		if(rand == 0) {
			JOptionPane.showMessageDialog(null, "Ben Shaprio will appear over your bed at 2:53 am.");
		}
		
		if(rand == 1) {
			JOptionPane.showMessageDialog(null, "You will be deemed unepic and outcast from society.");
		}
		
		if(rand == 2) {
			JOptionPane.showMessageDialog(null, "Your battle bus will crash into the Pentagon.");
		}
		
		if(rand == 3) {
			JOptionPane.showMessageDialog(null, "The next time you go near wilderness Todd Howard will knock you out and kidnap you and when you wake up Skyrim 6 will appear over your head in big bold letters. ");
		}
		
		if(rand == 4) {
			JOptionPane.showMessageDialog(null, "You will exist in the future.");
		}
		
	}

}
