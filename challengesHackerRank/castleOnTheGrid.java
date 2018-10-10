package challengesHackerRank;

import java.io.*;
import java.util.*;

public class castleOnTheGrid {
	static int gridSize = 0;
	static node[][] Nodes;

	public int minimumMoves(int startX, int startY, int goalX, int goalY) {

		
		int[] frontArr = Nodes[startX][startY].front();
		int frontx = frontArr[0];
		int fronty = frontArr[1];
		int[] backArr = Nodes[startX][startY].back();
		int backx = backArr[0];
		int backy = backArr[1];
		int[] upArr = Nodes[startX][startY].up();
		int upx = upArr[0];
		int upy = upArr[1];
		int[] downArr = Nodes[startX][startY].down();
		int downx = downArr[0];
		int downy = downArr[1];		
		
		//System.out.println(Arrays.toString(backArr));
		//System.out.println(Nodes[backx][backy].symbol);
		
		if (Nodes[startX][startY].xpos == goalX && Nodes[startX][startY].ypos == goalY) {
			System.out.println("Final Step");
		} else if (!Nodes[frontx][fronty].symbol.equals("X") && Nodes[frontx][fronty].isVisited() == false) {
			System.out.format("%s-> %d,%d\n", "Called for ", startX, startY);
			Nodes[startX][startY].visited = true;
			minimumMoves(frontx, fronty, goalX, goalY);
		} else if (!Nodes[backx][backy].symbol.equals("X") && Nodes[backx][backy].isVisited() == false) {
			System.out.format("%s-> %d,%d\n", "Called for ", startX, startY);
			Nodes[startX][startY].visited = true;
			minimumMoves(backx, backy, goalX, goalY);
		} else if (!Nodes[upx][upy].symbol.equals("X") && Nodes[upx][upy].isVisited() == false) {
			System.out.format("%s-> %d,%d\n", "Called for ", startX, startY);
			Nodes[startX][startY].visited = true;
			minimumMoves(upx, upy, goalX, goalY);
		} else if ((!Nodes[downx][downy].symbol.equals("X")) && (Nodes[downx][downy].isVisited() == false)) {
			System.out.format("%s-> %d,%d\n", "Called for ", startX, startY);
			Nodes[startX][startY].visited = true;
			minimumMoves(downx, downy, goalX, goalY);
		}

		return 0;
	}

	static void traverse(int xStrtPos, int yStrtPos) {

	}

	public static void main(String[] args) throws IOException {
		castleOnTheGrid ctg = new castleOnTheGrid();
		File inpFile = new File(
				"C:\\Users\\sreer\\Desktop\\problemInput\\castle-on-the-grid-testcases\\input\\input12.txt");
		BufferedReader bfr = new BufferedReader(new FileReader(inpFile));
		gridSize = Integer.parseInt(bfr.readLine())-1;
		Nodes = new node[gridSize+1][gridSize+1];
		for (int i = 0; i <= gridSize; i++) {
			String[] gridItem = bfr.readLine().split("");
			for (int j = 0; j <= gridSize; j++) {
				Nodes[i][j] = new node(gridItem[j], i, j);
			}
		}
		String[] startXStartY = bfr.readLine().split(" ");
		int startX = Integer.parseInt(startXStartY[0]);
		int startY = Integer.parseInt(startXStartY[1]);
		int goalX = Integer.parseInt(startXStartY[2]);
		int goalY = Integer.parseInt(startXStartY[3]);
		int result = ctg.minimumMoves(startX, startY, goalX, goalY);
		System.out.println(result);
		bfr.close();
	}

	static class node {
		Integer xpos, ypos;
		String symbol;
		boolean visited = false;

		public node() {
		}

		public node(String symb, Integer x, Integer y) {
			this.symbol = symb;
			this.xpos = x;
			this.ypos = y;
		}

		public int[] up() {
			int[] retArr = new int[2];
			if (xpos - 1 == -1) {
				retArr[0] = gridSize;
				retArr[1] = ypos;
				return retArr;
			} else {
				retArr[0] = xpos - 1;
				retArr[1] = ypos;
				return retArr;
			}
		}

		public int[] down() {
			int[] retArr = new int[2];
			if (xpos + 1 > gridSize) {
				retArr[0] = 0;
				retArr[1] = ypos;
				return retArr;
			} else {
				retArr[0] = xpos + 1;
				retArr[1] = ypos;
				return retArr;
			}
		}

		public int[] front() {
			int[] retArr = new int[2];
			if (ypos + 1 > gridSize) {
				retArr[0] = xpos;
				retArr[1] = 0;
				return retArr;
			} else {
				retArr[0] = xpos;
				retArr[1] = ypos + 1;
				return retArr;
			}
		}

		public int[] back() {
			int[] retArr = new int[2];
			if (ypos - 1 == -1) {
				retArr[0] = xpos;
				retArr[1] = gridSize;
				return retArr;
			} else {
				retArr[0] = xpos;
				retArr[1] = ypos - 1;
				return retArr;
			}
		}

		public boolean isVisited() {
			if (visited == false)
				return false;
			else
				return true;
		}
	}
}
