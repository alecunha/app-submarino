package br.com.buscape.model;

import br.com.buscape.enumtype.CardinalPointEnum;

public class Position {

	private int x;
	
	private int y;
	
	private int z;
	
	private CardinalPointEnum direction;
	
	public Position(int x, int y, int z, CardinalPointEnum direction) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.direction = direction;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public CardinalPointEnum getDirection() {
		return direction;
	}

	public void setDirection(CardinalPointEnum direction) {
		this.direction = direction;
	}
	
	@Override
	public String toString() {
		return x + " " + y + " " + z + " " + direction;
	}
	
}
