package com.foo.monopoly.domain;

public class Piece {

	private Square location;

	public Piece(Square location) {
		super();
		this.location = location;
	}

	public Square getLocation() {
		return location;
	}

	public void setLocation(Square location) {
		this.location = location;
	}

}
