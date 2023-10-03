package com.example.app.game.pieces.Piece;

public abstract class Piece{
    private int x;
    private int y;
    private int color;
    private boolean alive;

    public Piece(int x, int y, int color){
        this.x = x;
        this.y = y;
        this.color = color;
        this.alive = true;
    }
    public void kill(){
        this.alive = false;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getColor(){
        return this.color;
    }
    public boolean isAlive(){
        return this.alive;
    }
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    public abstract boolean isValidMove(int x, int y);
}