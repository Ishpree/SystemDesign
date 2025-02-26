package com.example.demo.DesignExamples.TicTacToe;

public class Player {

    String name;

    Piece myPiece;

    public Player(String name, Piece p)
    {
        this.name=name;
        this.myPiece=p;
    }

     public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public Piece getPiece()
    {
        return myPiece;
    }

    public void setPiece(Piece mPiece)
    {
        this.myPiece=mPiece;
    }



}
