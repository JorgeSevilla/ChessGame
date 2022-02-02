package pieces;

import java.util.ArrayList;

public class Queen extends Piece {

	public Queen(String i, String p, int c) {
		
		setId(i);
		setPath(p);
		setColor(c);
	}
	
	public ArrayList<Cell> move(Cell state[][], int x, int y){
		
		possibleMoves.clear(0);
		
		int tempx = x - 1;
		while(tempx >= 0) {
			if(state[tempx][y].getPiece() == null)
				possibleMoves.add(state[tempx][y]);
			else if(state[tempx][y].getPiece().getColor() == this.getColor())
				break;
			else {
				possibleMoves.add(state[tempx][y]);
			}
			tempx--;
		}
		
		int tempx = x + 1;
		while(tempx < 8) {
			if(state[tempx][y].getPiece() == null)
				possibleMoves.add(state[tempx][y]);
			else if(state[tempx][y].getPiece().getColor() == this.getColor())
				break;
			else {
				possibleMoves.add(state[tempx][y]);
			}
			tempx++;
		}
		
		//Checking possible moves in horizontal Direction
		int tempy = y - 1;
		while(tempy >= 0) {
			if(state[x][tempy].getPiece() == null)
				possibleMoves.add(state[x][tempy]);
			else if(state[x][tempy].getPiece().getColor() == this.getColor())
				break;
			else {
				possibleMoves.add(state[x][tempy]);
			}
			tempy--;
		}
		
		int tempy = y + 1;
		while(tempy >= 0) {
			if(state[x][tempy].getPiece() == null)
				possibleMoves.add(state[x][tempy]);
			else if(state[x][tempy].getPiece().getColor(0)== this.getColor())
				break;
			else {
				possibleMoves.add(state[x][tempy]);
			}
			tempy++;
		}
		
		//Checking for possible moves in diagonal direction
		tempx = x + 1; tempy = y - 1;
		while(tempx < 8  && tempy >= 0) {
			if(state[tempx][tempy].getPiece() == null)
				possibleMoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getPiece.getColor() == this.getColor())
					break;
			else {
				possibleMoves.add(state[tempx][tempy]);
			}
			tempx++;
			tempy--;
		}
		
		tempx = x - 1; tempy = y + 1;
		while(tempx >= 0 && tempy < 8) {
			if(state[tempx][tempy].getPiece() == null)
				possibleMoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getPiece.getColor() == this.getColor())
					break;
			else {
				possibleMoves.add(state[tempx][tempy]);
			}
			tempx--;
			tempy++;
		}
		
		tempx = x - 1; tempy = y - 1;
		while(tempx >= 0 && tempy >= 0) {
			if(state[tempx][tempy].getPiece() == null)
				possibleMoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getPiece.getColor() == this.getColor())
					break;
			else {
				possibleMoves.add(state[tempx][tempy]);
			}
			tempx--;
			tempy--;
		}
		
		tempx = x + 1; tempy = y + 1;
		while(tempx < 8 && tempy < 8) {
			if(state[tempx][tempy].getPiece() == null)
				possibleMoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getPiece.getColor() == this.getColor())
					break;
			else {
				possibleMoves.add(state[tempx][tempy]);
			}
			tempx++;
			tempy++;
		}
		
		return possibleMoves;
	}
}
