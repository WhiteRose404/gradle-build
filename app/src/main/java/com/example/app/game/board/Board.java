package com.example.app.game.board;

import com.example.app.game.player.Player;
import com.example.app.game.pieces.Piece;
import com.example.app.game.board.CustomBoard;

public class Board{
    private static final int SIZE = 8;
    // private Piece[][] board;
    private Player white;
    private Player black;
    
    public Board(int size, Player white, Player black){
        this.white = white;
        this.black = black;
        // this.board = new int[Board.SIZE][Board.SIZE];
        this.initBoard();
    }
    private void initBoard(){
        this.white.initPieces();
        this.black.initPieces();
    }
    public void remapBoard(CustomBoard customBoard){
        customBoard.initBoard(board, Board.SIZE);
    }
    public void movePiece(int x1, int y1, int x2, int y2){
        // TODO: implement
    }
    public void printBoard(){
        for(int i = 0; i < Board.SIZE; i++){
            for(int j = 0; j < Board.SIZE; j++){
                if()
            }
            System.out.println();
        }
}