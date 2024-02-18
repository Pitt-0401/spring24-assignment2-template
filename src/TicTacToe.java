/*
 * Created on 2024-02-18
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

import java.util.Scanner;

public class TicTacToe {
    private GameBoard gameBoard;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Scanner scanner;

    public TicTacToe() {
        gameBoard = new GameBoard();
        // TODO: read player names
        // player1 starts the game
    }

    // NO NEED TO TOUCH startGame()
    public void startGame() {
        boolean gameEnded = false;
        while (!gameEnded) {
            gameBoard.printBoard();
            placeMove();
            if (gameBoard.checkWin()) {
                gameBoard.printBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                gameEnded = true;
            } else if (gameBoard.isFull()) {
                gameBoard.printBoard();
                System.out.println("The game ended in a tie!");
                gameEnded = true;
            } else {
                switchPlayers();
            }
        }
        scanner.close();
    }

    // Asks the player to place a move and checks for its validity
    private void placeMove() {
        boolean validMove = false;
        // TODO: ask the player to place a move
        // Make the move on the gameBoard
        // Check whether the move is valid, if not, ask the player to place a move again

        if (!validMove) {
            System.out.println("Invalid move, try again.");
        }

    }

    // Switch players
    // Sets the player that is not the currentPlayer as the currentPlayer
    private void switchPlayers() {
        // TODO implement
    }
}
