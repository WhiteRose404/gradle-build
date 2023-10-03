package com.example.app.game.board.CustomBoard;
import com.example.app.game.pieces.Piece;

@FunctionalInterface
public interface CustomBoard{
    public void initBoard(Piece[][] board, int size);
}