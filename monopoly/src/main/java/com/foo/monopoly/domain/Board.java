package com.foo.monopoly.domain;

import java.util.ArrayList;
import java.util.List;

//pag 381
public class Board {
	private static final int SIZE = 40;
	private List<Square> squares = new ArrayList(SIZE);
	
	public Board() {
		buildSquare();
		linkSquares();
	}

	public Square getSquare(Square start, int distance) {
		int endIndex = (start.getIndex() + distance) % SIZE;
		return (Square) squares.get(endIndex);
	}
	
	public Square getStartSquare() {
		return (Square) squares.get(0);
	}
	
	private void buildSquare() {
		for( int i =1; i <= SIZE; i++) {
			build(i);
		}
	}

	private void build(int i) {
		Square s = new Square("Square "+i, i - 1);
		squares.add(s);
	}

	private void linkSquares() {
		for(int i =0; i < (SIZE -1); i++) {
			link(i);
		}
		Square first = (Square) squares.get(0);
		Square last = (Square) squares.get(SIZE - 1);
		last.setNextSquare(first);
		
	}

	private void link(int i) {
		Square current = (Square) squares.get(i);
		Square next = (Square) squares.get(i + 1);
		current.setNextSquare(next);
	}
}
