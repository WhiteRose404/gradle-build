package com.example.app.game.board.player.Player;

public class Player{
    private String name;
    // private int score;
    private int color;
    private boolean turn;

    public Player(String name, int color){
        this.name = name;
        this.color = color;
        // this.score = 0;
        this.turn = false;
    }

    public String getName(){
        return this.name;
    }
    public int getColor(){
        return this.color;
    }
    public boolean getTurn(){
        return this.turn;
    }
    public void setTurn(boolean turn){
        this.turn = turn;
    }
    public void initPieces(){
        
    }
}