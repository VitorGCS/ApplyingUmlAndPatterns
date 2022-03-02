package com.foo.monopoly.domain;

public class Square {

	private String name;
	private Square nextSquare;
	private int index;
	
	public Square(String name, int index) {
		super();
		this.name = name;
		this.index = index;
	}

	public Square getNextSquare() {
		return nextSquare;
	}

	public void setNextSquare(Square nextSquare) {
		this.nextSquare = nextSquare;
	}

	public String getName() {
		return name;
	}

	public int getIndex() {
		return index;
	}
	
	
	
	
}
