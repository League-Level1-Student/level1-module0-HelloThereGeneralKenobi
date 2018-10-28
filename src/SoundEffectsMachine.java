import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	
	public static void main(String[] args) {
		
		SoundEffectsMachine s = new SoundEffectsMachine();
		s.showButton();
	}
	
	int buttonpress = 0;
	
	public void showButton() {
	     System.out.println("Button clicked");
	     
	     JFrame frame = new JFrame();
	     frame.setVisible(true);
	     
	     frame.setSize(700, 700);
	     
	     JButton button1 = new JButton();
	     
	     JPanel panel = new JPanel();
	     frame.add(panel);
	     
	     button1.addActionListener(this);
	     button1.setText("Sound1");
	     button1.setSize(200, 200); 
	     panel.add(button1);
	     
	     JButton button2 = new JButton();
	     button2.addActionListener(this);
	     button2.setText("Sound2");
	     button2.setSize(200, 200); 
	     panel.add(button2);
	     
	     JButton button3 = new JButton();
	     button3.addActionListener(this);
	     button3.setText("Sound3");
	     button3.setSize(200, 200); 
	     panel.add(button3);
	     
	     JButton button4 = new JButton();
	     button4.addActionListener(this);
	     button4.setText("Sound4");
	     button4.setSize(200, 200); 
	     panel.add(button4);
	     
	     JButton button5 = new JButton();
	     button5.addActionListener(this);
	     button5.setText("Sound5");
	     button5.setSize(200, 200); 
	     panel.add(button5);
	}
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		}
	}


