package com.foo.monopoly.domain;

public class Player {
	private String name;
	private Piece piece;
	private Board board;
	private Die[] dice;
	
	public Player(String name, Die[] dice, Board board) {
		super();
		this.name = name;
		this.board = board;
		this.dice = dice;
		this.piece = new Piece(board.getStartSquare());
	}
	
	public void takeTurn() {
		//roll dice
		int rollTotal = 0;
		for(int i = 0; i< dice.length; i++) {
			dice[i].roll();
			rollTotal += dice[i].getFaceValue();
		}
		
		Square newLoc = board.getSquare(piece.getLocation(), rollTotal);
		piece.setLocation(newLoc);
	}

	public Square getLocation() {
		return piece.getLocation();
	}
	
	public String getName() {
		return name;
	}
}
