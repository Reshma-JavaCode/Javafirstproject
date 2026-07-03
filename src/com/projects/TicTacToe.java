package com.projects;

import java.util.Scanner;

public class TicTacToe {

	//board/grid representation
	public static void printBoard(char[][] board) {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				System.out.print(" " + board[i][j] + " ");
				
				if (j < 2) {
					System.out.print("|");
				}
			}

			System.out.println();

			if (i < 2) {
				System.out.println("-----------");
			}

		}
	}

	//Winner logic
	public static boolean checkWinner(char[][] board, char player) {

		// Horizontal checking
		for (int i = 0; i < board.length; i++) {
			if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
				return true;
			}

		}
		// Vertical checking
		for (int j = 0; j < board.length; j++) {

			if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {

				return true;
			}
		}

		// Diagonal checking
		if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {

			return true;
		}

		//anti-diagonal
		if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {

			return true;
		}

		return false;
	}

	//Is Board full
	public static boolean isBoardFull(char[][] board) {

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (board[i][j] == ' ') {
					return false;
				}
			}
		}

		return true;
	}

	//Main method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s=" ";

		do {
			
		char[][] board = new char[3][3];
		char player = 'x';

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
		
		//To Display grid/board
		printBoard(board);

		while (true) {

			System.out.println(player+" Turn");
			
			System.out.println("\nEnter the row(1-3): ");
			int row = sc.nextInt();

			System.out.println("\nEnter the column(1-3): ");
			int col = sc.nextInt();

			row--;
			col--;

			if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
				System.out.println("Invalid move, choose again");
				continue;
			}

			board[row][col] = player;
			
			System.out.println();
			printBoard(board);

			System.out.println();
			if (checkWinner(board, player)) {
				System.out.println("Player " + player + " won the game!");
				break;
			}

			System.out.println();
			if (isBoardFull(board)) {
				System.out.println("Draw the game");
				break;
			}

			player = (player == 'x') ? 'o' : 'x';

		}
		
		System.out.println("\nDo you want to play again? (Y/N)");
		s= sc.next();
		
		}while(s.equalsIgnoreCase("y"));
		sc.close();
	}

}
