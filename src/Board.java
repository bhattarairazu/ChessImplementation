public class Board {
    public static final String QUEEN = "Q";
    public static final String KING = "K";
    public static final String ROOK = "R";
    public static final String BISHOP = "B";
    public static final String PAWN = "P";
    public static final String KNIGHT = "N";
    public static final String PLAYER_1 = "1";
    public static final String PLAYER_2 = "2";
    public static final String EMPTY = "-";
    public static final String board[][] = new String[8][8];

    public static void setInitialPieces(){
        for(int i = 0;i<8;i++){
            for(int j = 0;j<8;j++){
                board[i][j] = EMPTY;
            }
        }

        for(int k = 0;k<8;k++){
            board[1][k] = PAWN+PLAYER_1;
            board[6][k] = PAWN+PLAYER_2;
            switch (k){
                case 0:
                    setPieces(0, ROOK);
                    break;
                case 1:
                    setPieces(1, KNIGHT);
                    break;
                case 2:
                    setPieces(2, BISHOP);
                    break;

            }
            board[0][3] = QUEEN+PLAYER_1;
            board[0][4] = KING+PLAYER_1;
            board[7][3]= KING+PLAYER_2;
            board[7][4] = QUEEN+PLAYER_2;
        }


    }
    public static void setPieces(int i, String pieces){
        board[0][i] = pieces+PLAYER_1;
        board[0][7-i] = pieces+PLAYER_1;
        board[7][i] = pieces+PLAYER_2;
        board[7][7-i] = pieces+PLAYER_2;
    }

    public static void printBoard(){
        System.out.println();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
}
