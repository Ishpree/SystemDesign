package com.example.demo.DesignExamples.TicTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Game {

    Deque<Player>players;

    Board b;

    public Game()
    {
        initializeGame();
    }

    public void initializeGame()
    {
          players= new LinkedList<>();
          Piece p1= new PieceX();
          Player player1 = new Player("Ish", p1);

          Piece p2= new PieceO();
          Player player2 = new Player("Aksh", p2);

          players.add(player1);
          players.add(player2);

        
        b= new Board(3);


    }

    public String startGame()
    {
        boolean noWinner= true;
        while(noWinner)
        {
            Player curPlayer = players.removeFirst();

            b.printBoard();
            List<AbstractMap.SimpleEntry<Integer, Integer>>freeSpaces = new ArrayList<>();
            freeSpaces= b.getFreeSpaces();
            if(freeSpaces.isEmpty())
            {
                noWinner=false;
                continue;
            }

            Scanner inputScanner = new Scanner(System.in);
            System.out.println("Player " + curPlayer.name + " Enter row and column");
            String s = inputScanner.nextLine();
            String[] values= s.split(",");
            int row= Integer.valueOf(values[0]);
            int col= Integer.valueOf(values[1]);
            inputScanner.close(); //comment this out to run successfully

            boolean pieceAdded = b.addPiece(row, col, curPlayer.myPiece);
            if(!pieceAdded)
            {
                System.out.println("Incorrect cell");
                players.addFirst(curPlayer);
                continue;
            }
            players.addLast(curPlayer);

            boolean winner = checkWinner(row, col, curPlayer.myPiece.pieceType);
            if(winner)
            {
                return curPlayer.name;
            } 
            
           

        }
        
       

        return "No Winner";

    }

     boolean checkWinner(int row, int col, PieceType type)
     {
           boolean rowMatch=true;
           boolean colMatch=true;
           boolean diagMatch=true;
           boolean antiMatch=true;

           for(int i=0;i<b.size;i++)
           {
               if(b.board[row][i]==null || b.board[row][i].pieceType!= type )
               {
                rowMatch=false;
               }
           }

           for(int i=0;i<b.size;i++)
           {
            if(b.board[i][col]==null || b.board[i][col].pieceType!= type )
            {
               colMatch=false;
            }
           }

            for(int i=0;i<b.size;i++)
            {
                if(b.board[i][i]==null || b.board[i][i].pieceType!= type )
            {
                 diagMatch=false;
            }
            }

           
            for(int i=0;i<b.size;i++)
            {
                if(b.board[i][b.size-i-1]==null || b.board[i][b.size-i-1].pieceType!= type)
            {
                 antiMatch=false;
            }
            }

            return rowMatch || colMatch || diagMatch || antiMatch;
     }



}
