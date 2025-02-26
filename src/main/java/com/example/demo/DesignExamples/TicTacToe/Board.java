package com.example.demo.DesignExamples.TicTacToe;

import java.util.List;


import java.util.ArrayList;
import java.util.*;

public class Board {

     int size;

     public Piece[][] board;

    public Board(int size)
    {
         this.size=size;
         board = new Piece[size][size];
    }

    public void printBoard()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                 if(board[i][j]!=null)
                 System.out.print(board[i][j].pieceType);
                 else
                 System.out.print(board[i][j]);
                 System.out.print(" | ");
            }
            System.out.println("\n");
        }
    }

    public List<AbstractMap.SimpleEntry<Integer, Integer>> getFreeSpaces()
    {

         List<AbstractMap.SimpleEntry<Integer, Integer>> l = new ArrayList<>();
         for(int i=0;i<size;i++)
         {
            for(int j=0;j<size;j++)
            {
                  if(board[i][j]==null)
                  {
                    AbstractMap.SimpleEntry<Integer, Integer>p = new AbstractMap.SimpleEntry<>(i, j);
                      l.add(p);
                  }
            }
         }
         return l;
    }

     public boolean addPiece(int row, int col, Piece curPiece)
     {
           if(board[row][col]==null)
           {
                board[row][col]=curPiece;
                return true;
           }
           return false;

     }

     
    

}


