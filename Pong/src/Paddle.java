import java.awt.Color;

public class Paddle extends Sprite {
	final static int PADDLE_WIDTH = 10;
	final static int PADDLE_HEIGHT = 100;
	final static Color PADDLE_COLOUR = Color.WHITE;
	final static int DISTANCE_FROM_EDGE = 40;

	public Paddle(Player player, int panelWidth, int panelHeight) {

		setWidth(PADDLE_WIDTH);
		setHeight(PADDLE_HEIGHT);
		setColour(PADDLE_COLOUR);

		if (player == Player.One) {
			setInitialPosition(DISTANCE_FROM_EDGE, panelHeight / 2 - (PADDLE_HEIGHT / 2));
		}

		else if (player == Player.Two) {
			setInitialPosition(panelWidth - DISTANCE_FROM_EDGE - PADDLE_WIDTH, panelHeight / 2 - (PADDLE_HEIGHT / 2));
		}
		resetToInitialPosition();
	}

}
