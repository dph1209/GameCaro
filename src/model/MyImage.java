package model;

import java.awt.Image;

import javax.swing.ImageIcon;

import component.Constants;

public class MyImage {
	private String urlImg = "/images/";
	public Image ImgX;
	public Image ImgO;

	public MyImage() {
		int size = Constants.sizeCell - 2;
		ImgX = reSizeImage(getMyImageIcon("X.gif"), size, size);
		ImgO = reSizeImage(getMyImageIcon("O.gif"), size, size);
	}

	public Image reSizeImage(Image img, int width, int height) {
		img = new ImageIcon(img.getScaledInstance(width, height, Image.SCALE_SMOOTH)).getImage();
		return img;
	}

	public Image getMyImageIcon(String nameImgIcon) {
		Image ii = new ImageIcon(getClass().getResource(urlImg + nameImgIcon)).getImage();
		return ii;
	}
}
