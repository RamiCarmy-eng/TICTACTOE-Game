enum Status {DRAW,X_WIN,O_WIN}
enum Mark {BLANK, X, O} 


public class Board {
	public static final int SIZE=4 ;
	private Mark[][] board= new Mark[SIZE][SIZE];


	public Board() {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++) {
				board[row][col] = Mark.BLANK;
			}
		}
	}

	public Mark getMark(int row, int col) {
		return board[row][col];
	}

	public boolean putMark(Mark mark, int row, int col) {
		if (board[row][col] == Mark.BLANK) {
			board[row][col] = mark;
			return true;
		}
		return false;

	}


	public boolean isGameEnded() {

		boolean winRow = false;
		boolean endLoop = false;

		//check rows for player 1
		int n = 0;
		while (!endLoop) {
			int sum1=0,sum2=0;
			for (int m = 0; m < SIZE; m++) {
				if (board[n][m] == Mark.X) {
					sum1++;

					if (sum1 == 4) {
						winRow=true;
						endLoop = true;
						System.out.println("row# " + n + " The winner is X");
					}
				}
				if (getMark(n, m) == Mark.O) {
					sum2++;

					if (sum2 == 4) {
						winRow = true;
						endLoop = true;
						System.out.println("row# " + n + " The winner is O");
					}
				}
				if(winRow){return winRow;}
			}
			n++;
			if (n == SIZE) {
				winRow = false;
				endLoop = true;
			}

			if ( winRow) {
				System.out.println("row!" + n + winRow);
				return true;
			}

		}

		//chek for cols
		boolean winCOL = false,endLoopCol=false;
		int m=0;

		while (!endLoopCol) {

			int sum1=0,sum2=0;
			for (  n = 0; n < SIZE; n++) {
				if (board[n][m] == Mark.X) {
					sum1++;
					//System.out.println("m "+m+"sum1= "+sum1);
					if (sum1 == 4) {
						winCOL=true;
						endLoopCol = true;
						System.out.println("COL# " + m + " The winner is X");
					}
				}
				if (getMark(n, m) == Mark.O) {
					sum2++;
					//System.out.println("m "+m+"sum2= "+sum2);
					if (sum2 == 4) {
						winCOL = true;
						endLoopCol = true;
						System.out.println("COL# " + m + " The winner is O");
					}
				}
				if(winCOL){return winCOL;}
			}
			m++;

			if (m == this.SIZE) {
				winCOL = false;
				endLoopCol = true;
			}

		}

		//chek for diagonal
		boolean windiagonal = false;
		int sum1=0,sum2=0;
		for (int  i = 0; i < this.SIZE; i++) {
			if (board[i][i] == Mark.X) {
				sum1++;
				//System.out.println("i "+i+"sum1= "+sum1);
				if (sum1 == 4) {
					windiagonal=true;

					System.out.println("Diagonal 1, The winner is X");
				}
			}
			if (board[i][i] == Mark.O) {
				sum2++;
				//System.out.println("i "+i+"sum2= "+sum2);
				if (sum2 == 4) {
					windiagonal = true;
					System.out.println("Diagonal 1, The winner is O");
				}
			}
			if(windiagonal){return windiagonal;}
		}


		//chek for diagonal2
		boolean windiagonal1 = false;
		sum1=0;
		sum2=0;

		for (int i = this.SIZE-1; i >= 0; i--) {
			if (board[this.SIZE-1-i][i] == Mark.X) {
				sum1++;

				if (sum1 == 4) {
					windiagonal1=true;

					System.out.println("Diagonal 2, The winner is X");
				}
			}
			if (board[i][i] == Mark.O) {
				sum2++;

				if (sum2 == 4) {
					windiagonal1 = true;
					System.out.println("Diagonal 2, The winner is O");
				}
			}
			if(windiagonal1){return windiagonal1;}
		}



		return (winCOL || winRow || windiagonal || windiagonal1 );

	}

}
