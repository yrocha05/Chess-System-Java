package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;


    public ChessPiece(Color color, Board board) {
        this.color = color;
        super(board);
    }

    public Color getColor() {
        return this.color;
    }



}
