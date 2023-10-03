package com.example.app.game.pieces.pawn.Pawn;

import com.example.app.game.pieces.Piece;

public class Pawn extends Piece{
    private boolean firstMove;

    public Pawn(int x, int y, int color){
        super(x, y, color);
        this.firstMove = true;
    }
    public boolean isFirstMove(){
        return this.firstMove;
    }
    public void setFirstMove(boolean firstMove){
        this.firstMove = firstMove;
    }
    public boolean isValidMove(int x, int y){
        return true;
    }
}