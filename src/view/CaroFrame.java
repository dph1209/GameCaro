package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class CaroFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public CaroFrame() {
		this.setTitle("Game Caro");
		this.setResizable(false);
		this.setLocationRelativeTo(null); // Cài đặt cửa sổ ở giữa màn hình
		this.setLayout(new BorderLayout());
		
		this.initPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void initPanel(){
		CaroPanel caroPanel = new CaroPanel();
		
	}
}
