import javax.swing.JFrame;

public class Pong extends JFrame {

	static final int SCREEN_WIDTH = 800;
	static final int SCREEN_HEIGHT = 600;
	static final String WINDOW_TITLE = "Pong";

	public Pong() {
		setTitle(WINDOW_TITLE);
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Pong();
	}

}
