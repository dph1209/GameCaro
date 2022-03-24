package model;

import java.awt.Point;

import component.Constants;

public class Matrix {
	private int matrix[][];
	private int win = 0;

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public Matrix() {
		matrix = new int[Constants.row + 2][Constants.col + 2];
	}

	public boolean updateMatrix(boolean useX, Point point) {
		int row = point.x + 1;
		int col = point.y + 1;
		short player = (short) (useX ? 1 : 2);

		for (int i = 0; i < Constants.row; i++) {
			System.out.println();
		}

		if (matrix[row][col] == 0) {
			matrix[row][col] = player;
		} else {
			System.out.println("error");
			return false;
		}

		for (int i = 1; i < Constants.row - 1; i++) {
			for (int j = 1; j < Constants.col - 1; j++) {
				System.out.println(matrix[i][j] + " ");
			}
			System.out.println();
		}
		win = checkWin(row, col);
		return true;
	}
	
	//Đi lại 
	public void undoMatrix(){
		//TODO đi lại
	}

	// Kiểm tra chiến thắng
	public int checkWin(int row, int col) {
		int[][] rc = { { 0, -1, 0, 1 }, { -1, 0, 1, 0 }, { 1, -1, -1, 1 }, { -1, -1, 1, 1 } };
		int i = row;
		int j = col;
		for (int direc = 0; direc < 4; direc++) {
			int count = 0;
			System.out.println("[" + direc + "]-" + "[" + row + "," + col + "] ");
			i = row;
			j = col;
			while (i > 0 && i < matrix.length && j > 0 && j < matrix.length && matrix[i][j] == matrix[row][col]) {
				count++;
				if (count == 5) {
					return matrix[row][col];
				}
				System.out.println("\t[" + i + "," + j + "]  ");
				i += rc[direc][2];
				j += rc[direc][3];
				System.out.println("--->[" + i + "," + j + "]  ");
			}
			System.out.println("\t count : " + count);
		}
		return 0;
	}
}
