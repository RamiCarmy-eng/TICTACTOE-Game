

public class Game {


	public static void main(String[] args) {
		/*  Scanner scanner = new Scanner(System.in);*/
		Renderer renderer = new Renderer();
		/* InputNumber inp = new InputNumber(); */
		Board board= new Board();
		boolean gameEnded = false;
		renderer.renderBoard(board);

		Player player1 = new Player(board, Mark.X, "Jacob");
		Player player2 = new Player(board, Mark.O, "Yoni");



		while (!gameEnded) {

			if (board.isGameEnded()) {
				break;
			}

			for (int player = 1; player < 3; player++) {
				if(player==1) {
					if(!player1.playTurn()){
						gameEnded=true;
					}
				}
				if(player==2) {
					if(!player2.playTurn()){
						gameEnded=true;
					}
				}
			}

		}
	}
}