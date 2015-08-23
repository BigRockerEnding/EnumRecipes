package org.jointheleague.enums;

public enum Direction {

	NORTH(-1, 0), EAST(0, 1), SOUTH(1, 0), WEST(0, -1);
	
	private final int deltaRow, deltaCol;
	Direction(int deltaRow, int deltaCol) {
		this.deltaRow = deltaRow;
		this.deltaCol = deltaCol;
	}

    public int getDeltaRow() {
		return deltaRow;
	}
    
	public int getDeltaCol() {
		return deltaCol;
	}

	public Direction getRight() {
		int next = this.ordinal() == values().length - 1 ? 0 : this.ordinal() + 1;
		return values()[next];
	}

	public Direction getLeft() {
		int prev = this.ordinal() == 0 ? values().length - 1 : this.ordinal() - 1;
		return values()[prev];
	}

    // Optional: Create an app that shows a maze on a rectangular grid, and traces a "robot"
    // that moves like a right wall hugger.

}
