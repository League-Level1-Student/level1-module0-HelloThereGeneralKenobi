import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot owo = new Robot();

	public static void main(String[] args) {
		Houses houses = new Houses();
		houses.setup();

	}

	void setup() {
		drawFlatRoof("small", "blue");
		drawPointyRoof("medium", "green");
		drawPointyRoof("small", "red");
		drawFlatRoof("large", "green");
		drawPointyRoof("medium", "red");
		drawFlatRoof("small", "green");
		drawFlatRoof("large", "blue");
		drawPointyRoof("small", "blue");
		drawFlatRoof("medium", "red");
		drawPointyRoof("small", "green");
	}

	void drawFlatRoof(String height, String color) {
		owo.hide();
		owo.setSpeed(200);

		int heightint = 100;
		if (height.equalsIgnoreCase("small")) {
			heightint = 60;
		} else if (height.equalsIgnoreCase("medium")) {
			heightint = 120;
		} else if (height.equalsIgnoreCase("large")) {
			heightint = 180;
		}

		if (color.equalsIgnoreCase("red")) {
			owo.setPenColor(Color.red);
		}
		if (color.equalsIgnoreCase("green")) {
			owo.setPenColor(Color.green);
		}
		if (color.equalsIgnoreCase("blue")) {
			owo.setPenColor(Color.blue);
		}

		owo.penDown();
		owo.move(heightint);
		owo.turn(90);
		owo.move(30);
		owo.turn(90);
		owo.move(heightint);
		owo.turn(-90);
		owo.setPenColor(0, 200, 55);
		owo.move(15);
		owo.turn(-90);
	}

	void drawPointyRoof(String height, String color) {
		owo.hide();
		owo.setSpeed(200);

		int heightint = 100;
		if (height.equalsIgnoreCase("small")) {
			heightint = 60;
		} else if (height.equalsIgnoreCase("medium")) {
			heightint = 120;
		} else if (height.equalsIgnoreCase("large")) {
			heightint = 180;
		}

		if (color.equalsIgnoreCase("red")) {
			owo.setPenColor(Color.red);
		}
		if (color.equalsIgnoreCase("green")) {
			owo.setPenColor(Color.green);
		}
		if (color.equalsIgnoreCase("blue")) {
			owo.setPenColor(Color.blue);
		}

		owo.penDown();
		owo.move(heightint);
		owo.turn(45);
		owo.move(15);
		owo.turn(90);
		owo.move(15);
		owo.turn(45);
		owo.move(heightint);
		owo.turn(-90);
		owo.setPenColor(0, 200, 55);
		owo.move(15);
		owo.turn(-90);
	}
}
