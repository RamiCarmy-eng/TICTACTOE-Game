public class Player {
    public final Board board;
    public final Mark mark;
    public final String player;
    InputNumber inp= new InputNumber();
    Renderer renderer = new Renderer();
    private int Score;

    public Player(Board board, Mark mark, String player){
        this.board = board;
        this.mark=mark;
        this.player=player;
        this.Score=1;
    }

    public boolean playTurn(){
        int col;
        int row;
        boolean endloop= false;
        while(!endloop) {
            System.out.println(this.player + " where to put mark? ");
            System.out.println("Write row number  and press enter.");
            row = inp.getNuber();

            System.out.println("Write column number  and press enter.");
            col = inp.getNuber();

            if (this.board.getMark(row - 1, col - 1) == Mark.BLANK) {
                endloop=true;
                board.putMark(this.mark, row - 1, col - 1);
                renderer.renderBoard(board);

                if (this.board.isGameEnded()) {
                    System.out.println("Very Good "+this.player + ",  You Win" +
                            " !!!!"+ "Your Score is: "+this.Score++);
                    System.exit(0);;
                    return false;
                }
            }else{
                System.out.println("The cell is occupied , Try again ");
            }

        }
        return true;
    }

}
