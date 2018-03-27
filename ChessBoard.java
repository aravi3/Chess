import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ChessBoard extends JFrame {

	public ChessBoard(String title) {
		JButton chessButton;

		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				chessButton = new JButton();
				chessButton.setOpaque(true);
				chessButton.setBorderPainted(false);
				
				if (row % 2 == 0) {
					if (col % 2 == 0) {
						chessButton.setBackground(Color.WHITE);
					} else {
						chessButton.setBackground(Color.BLACK);
					}
				} else {
					if (col % 2 == 0) {
						chessButton.setBackground(Color.BLACK);
					} else {
						chessButton.setBackground(Color.WHITE);
					}
				}

				add(chessButton);
			}
		}

		this.setTitle(title);
		this.setLayout(new GridLayout(8, 18));
		this.setSize(650, 650);
		this.setVisible(true);
	}

	public static void main(String[] args) {		
		ChessBoard chessBoard = new ChessBoard("Chess");
	}
}