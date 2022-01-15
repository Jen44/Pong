import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Pong extends JFrame {

	static final int SCREEN_WIDTH = 800;
	static final int SCREEN_HEIGHT = 600;
	static final String WINDOW_TITLE = "Pong";
	static final Color BACKGROUND_COLOR = Color.BLACK;

	public Pong() {
		setTitle(WINDOW_TITLE);
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		setResizable(false);
		add(new PongPanel());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public class PongPanel extends JPanel implements ActionListener, KeyListener {

		public PongPanel() {

			setBackground(BACKGROUND_COLOR);

		}

		@Override
		public void keyTyped(KeyEvent event) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent event) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent event) {
			// TODO Auto-generated method stub

		}

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			public void run() {

				new Pong();

			}

		});
	}

}
