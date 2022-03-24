package view;

import component.Constants;
import model.Matrix;
import model.MyImage;

import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.JPanel;

public class CaroPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private int sizeImg = Constants.sizeCell - 2;
	public boolean player, playerRoot;
	private Matrix matrix;
	private MyImage myImg = new MyImage();
	private Icon iconActive;

	private int winer = 0;

	public int getWiner() {
		return winer;
	}

	public void setWiner(int winer) {
		this.winer = winer;
	}

	public CaroPanel() {
		init();
		this.setPreferredSize(new Dimension(Constants.width, Constants.height));
	}

	private void init() {
		winer = 0;
		matrix = new Matrix();
		player = playerRoot;

	}
}
