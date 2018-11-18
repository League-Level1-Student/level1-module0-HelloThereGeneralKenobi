import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {

	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();

	public static void main(String[] args) {

		CutenessTV c = new CutenessTV();
		c.showButton();
	}

	int buttonpress = 0;

	public void showButton() {
		System.out.println("Button clicked");

		JFrame frame = new JFrame();
		frame.setVisible(true);

		frame.setSize(700, 700);

		JPanel panel = new JPanel();
		frame.add(panel);

		button1.addActionListener(this);
		button1.setText("Video 1");
		button1.setSize(200, 200);
		panel.add(button1);

		button2.addActionListener(this);
		button2.setText("Video 2");
		button2.setSize(200, 200);
		panel.add(button2);

		button3.addActionListener(this);
		button3.setText("Video 3");
		button3.setSize(200, 200);
		panel.add(button3);
	}

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed == (button1)) {
			showDucks();
		}
		if (buttonPressed == (button2)) {
			showFrog();
		}
		if (buttonPressed == (button3)) {
			showFluffyUnicorns();
		}

	}
}
