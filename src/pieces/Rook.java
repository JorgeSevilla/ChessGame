package pieces;

import java.util.ArrayList;

public class Rook extends Piece{
	
	public Rook(String i ,String p, int c) {
		setId(i);
		setPath(p);
		setColor(c);
	}
	
	public ArrayList<Cell> move(Cell state[][], int x , int y){
		
		possibleMoves.clear();
		int tempx = x - 1;
		while(tempx >= 0) {
			if(state[tempx][y].getPiece() == null) {
				possibleMoves.add(state[tempx][y]);
			} else if(state[tempx][y].getPiece().getColor() == this.getColor())
				break;
			
			else {
				possibleMoves.add(state[tempx][y]);
			}
			
			tempx--;
			
		}
		
		tempx = x + 1;
		while(tempx < 8) {
			if(state[tempx][y].getPiece() == null) {
				possibleMoves.add(state[tempx][y]);
			} else if(state[tempx][y].getPiece().getColor() == this.getColor())
				break;
			
			else {
				possibleMoves.add(state[tempx][y]);
			}
			
			tempx++;
			
		}
		
		int tempy = y - 1;
		while(tempy >= 0) {
			if(state[x][tempy].getPiece() == null) {
				possibleMoves.add(state[x][tempy]);
			} else if(state[x][tempy].getPiece().getColor() == this.getColor())
				break;
			
			else {
				possibleMoves.add(state[x][tempy]);
				break;
			}
			
			tempy--;
			
		}
		tempy = y + 1;
		while(tempy < 8) {
			if(state[x][tempy].getPiece() == null) {
				possibleMoves.add(state[x][tempy]);
			} else if(state[tempx][y].getPiece().getColor() == this.getColor())
				break;
			
			else {
				possibleMoves.add(state[x][tempy]);
				break;
			}
			
			tempy++;
			
		}
		
		return possibleMoves;
		
	}

}
