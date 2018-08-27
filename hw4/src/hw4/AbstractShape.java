
package hw4;

import java.awt.Color;

import api.Block;
import api.Cell;
import api.Position;
import api.Shape;

/**
 * Abstract superclass for implementations of the Shape interface.
 * @author Gavin Monroe
 */
public abstract class AbstractShape implements Shape {

	// TODO - add the methods and constructors you want
	// (constructors must be declared protected)
	protected AbstractShape() {

	}

	protected AbstractShape(Position givenPosition, boolean magic) {
		pos = givenPosition;
	}
	/**/
	private Position pos = null;
	private int rotated = 0;
	private Cell[] cells = null;
	/** Rotates block Left, Right, Up, and Down when the Up arrow is pressed.
	 * 
	 * **/
	public void transform() {
		cells = this.getCells();
		if (this.getClass() == IShape.class) {//IShape - Rotation
			if (rotated == 0) {//Left
				cells[1].setCol(cells[1].getCol() + 1);
				cells[1].setRow(cells[1].getRow() - 1);
				cells[2].setCol(cells[2].getCol() + 2);
				cells[2].setRow(cells[2].getRow() - 2);
				rotated++;
				return;//break out

			}
			if (rotated == 1) {//Up
				cells[1].setCol(cells[1].getCol() - 1);
				cells[1].setRow(cells[1].getRow() - 1);
				cells[2].setCol(cells[2].getCol() - 2);
				cells[2].setRow(cells[2].getRow() - 2);
				rotated++;
				return;//break out
			}
			if (rotated == 2) {//Right
				cells[1].setCol(cells[1].getCol() - 1);
				cells[1].setRow(cells[1].getRow() + 1);
				cells[2].setCol(cells[2].getCol() - 2);
				cells[2].setRow(cells[2].getRow() + 2);
				rotated++;
				return;//break out
			}
			if (rotated == 3) {//Down
				cells[1].setCol(cells[1].getCol() + 1);
				cells[1].setRow(cells[1].getRow() + 1);
				cells[2].setCol(cells[2].getCol() + 2);
				cells[2].setRow(cells[2].getRow() + 2);
				rotated = 0;//Reset to Left
				return;//break out
			}
		} else if (this.getClass() == LShape.class) {//LShape - Rotation

			if (rotated == 0) {//Left
				cells[1].setCol(cells[1].getCol() + 3);
				cells[1].setRow(cells[1].getRow() + 1);
				cells[2].setCol(cells[2].getCol() + 2);
				cells[3].setCol(cells[3].getCol() + 1);
				cells[3].setRow(cells[3].getRow() - 1);
				rotated++;
				return;//break out

			}

			if (rotated == 1) {//Up
				cells[1].setCol(cells[1].getCol() - 1);
				cells[1].setRow(cells[1].getRow() - 3);
				cells[2].setCol(cells[2].getCol());
				cells[2].setRow(cells[2].getRow() - 2);
				cells[3].setCol(cells[3].getCol() + 1);
				cells[3].setRow(cells[3].getRow() - 1);
				rotated++;
				return;//break out

			}

			if (rotated == 2) {//Right
				cells[1].setCol(cells[1].getCol() - 1);
				cells[1].setRow(cells[1].getRow() - 1);
				cells[2].setCol(cells[2].getCol() - 2);
				cells[2].setRow(cells[2].getRow());
				cells[3].setCol(cells[3].getCol() - 3);
				cells[3].setRow(cells[3].getRow() + 1);
				rotated++;
				return;//break out

			}

			if (rotated == 3) {//Down
				cells[1].setCol(cells[1].getCol() - 1);
				cells[1].setRow(cells[1].getRow() + 3);
				cells[2].setCol(cells[2].getCol());
				cells[2].setRow(cells[2].getRow() + 2);
				cells[3].setCol(cells[3].getCol() + 1);
				cells[3].setRow(cells[3].getRow() + 1);

				rotated = 0;//Reset = 'Left'
				return;//break out

			}
		} else if (this.getClass() == JShape.class) {//JShape Rotation
			if (rotated == 0) {//Left
				cells[0].setCol(cells[0].getCol() + 1);
				cells[0].setRow(cells[0].getRow() + 1);
				cells[1].setCol(cells[1].getCol() + 2);
				cells[2].setCol(cells[2].getCol() + 1);
				cells[2].setRow(cells[2].getRow() - 1);
				cells[3].setRow(cells[3].getRow() - 2);
				rotated++;
				return;//break out

			}

			if (rotated == 1) {//Up
				cells[0].setCol(cells[0].getCol() + 1);
				cells[0].setRow(cells[0].getRow() - 1);
				cells[1].setRow(cells[1].getRow() - 2);
				cells[2].setCol(cells[2].getCol() - 1);
				cells[2].setRow(cells[2].getRow() - 1);
				cells[3].setCol(cells[3].getCol() - 2);
				
				rotated++;
				return;//break out

			}

			if (rotated == 2) {//Right
				cells[0].setCol(cells[0].getCol() - 1);
				cells[0].setRow(cells[0].getRow() - 1);
				cells[1].setCol(cells[1].getCol() - 2);
				cells[2].setCol(cells[2].getCol() - 1);
				cells[2].setRow(cells[2].getRow() + 1);
				cells[3].setRow(cells[3].getRow() + 2);
				
				rotated++;
				return;//break out

			}

			if (rotated == 3) {//Down
				cells[0].setCol(cells[0].getCol() - 1);
				cells[0].setRow(cells[0].getRow() + 1);
				cells[1].setRow(cells[1].getRow() + 2);
				cells[2].setCol(cells[2].getCol() + 1);
				cells[2].setRow(cells[2].getRow() + 1);
				cells[3].setCol(cells[3].getCol() + 2);

				rotated = 0;//Reset = 'Left'
				return;//break out

			}
		} else if (this.getClass() == TShape.class) {//TShape Rotation
			if (rotated == 0) {//Left
				cells[1].setCol(cells[1].getCol() + 2);
				cells[2].setCol(cells[2].getCol() + 1);
				cells[2].setRow(cells[2].getRow() - 1);
				cells[3].setRow(cells[3].getRow() - 2);
				rotated = 1;
				return;//break out

			}
			if (rotated == 1) {//Up
				cells[1].setRow(cells[1].getRow() - 2);
				cells[2].setCol(cells[2].getCol() - 1);
				cells[2].setRow(cells[2].getRow() - 1);
				cells[3].setCol(cells[3].getCol() - 2);
				rotated++;
				return;//break out
			}
			if (rotated == 2) {//Right
				cells[1].setCol(cells[1].getCol() - 2);
				cells[2].setCol(cells[2].getCol() - 1);
				cells[2].setRow(cells[2].getRow() + 1);
				cells[3].setRow(cells[3].getRow() + 2);
				rotated++;
				return;//break out
			}
			if (rotated == 3) {//Down
				cells[1].setRow(cells[1].getRow() + 2);
				cells[2].setCol(cells[2].getCol() + 1);
				cells[2].setRow(cells[2].getRow() + 1);
				cells[3].setCol(cells[3].getCol() + 2);
				rotated = 0;//Reset = Left
				return;//break out
			}
		} else if (this.getClass() == SZShape.class) {//SZShape Rotation
			Block blck;
			// - Green
			if (cells[0].getBlock().getColorHint() == Color.GREEN) {//Check what to do by color.
				
				if (cells[0].getBlock().isMagic()){
					blck = new Block(Color.RED, true);
				}else{
					blck = new Block(Color.RED, false);
				}
				//Change Position
				cells[0] = new Cell(blck, new Position(cells[0].getRow(), cells[0].getCol() + 1));
				blck = new Block(Color.RED, false);

				cells[2] = new Cell(blck, new Position(cells[1].getRow(), cells[1].getCol() + 1));
				cells[1] = new Cell(blck, new Position(cells[2].getRow(), cells[2].getCol() - 1));
				cells[3] = new Cell(blck, new Position(cells[3].getRow(), cells[3].getCol() - 1));

				return;//Break out

			}
			// - Red
			if (cells[0].getBlock().getColorHint() == Color.RED) {

				if (cells[0].getBlock().isMagic()){
					blck = new Block(Color.GREEN, true);
				}else{
					blck = new Block(Color.GREEN, false);
				}
				//Change Position
				cells[0] = new Cell(blck, new Position(cells[0].getRow(), cells[0].getCol() - 1));
				blck = new Block(Color.GREEN, false);
				cells[1] = new Cell(blck, new Position(cells[2].getRow(), cells[2].getCol() - 1));
				cells[2] = new Cell(blck, new Position(cells[1].getRow(), cells[1].getCol() + 1));
				cells[3] = new Cell(blck, new Position(cells[3].getRow(), cells[3].getCol() + 1));

			}
		} else if (this.getClass() == OShape.class) {//OShape Rotation
			// No rotation
		}
	}
	/** Shifts the position of the shape by moving the blocks around it self setting them to one another
	 * 
	 * **/
	public void cycle() {
		cells = this.getCells();

		if (this.getClass() == IShape.class) {//For IShape
			Cell temp = cells[2];
			//Set Next to the one below it
			cells[2] = new Cell(cells[1].getBlock(), new Position(cells[2].getRow(), cells[2].getCol()));
			cells[1] = new Cell(cells[0].getBlock(), new Position(cells[1].getRow(), cells[1].getCol()));
			cells[0] = new Cell(temp.getBlock(), new Position(cells[0].getRow(), cells[0].getCol()));
			//Finally set the First to the temp
		} else {//For Everything else
			Cell temp = cells[3];
			//Set Next to the one below it
			cells[3] = new Cell(cells[2].getBlock(), new Position(cells[3].getRow(), cells[3].getCol()));
			cells[2] = new Cell(cells[1].getBlock(), new Position(cells[2].getRow(), cells[2].getCol()));
			cells[1] = new Cell(cells[0].getBlock(), new Position(cells[1].getRow(), cells[1].getCol()));
			cells[0] = new Cell(temp.getBlock(), new Position(cells[0].getRow(), cells[0].getCol()));
			//Finally set the First to the temp
		}
	}
	/** Shifts the position of this shape left (increasing the column) by one. No bounds checking is done. 
	 * 
	 * **/
	public void shiftLeft() {
		cells = this.getCells();
		pos.setCol(pos.col() - 1);//Set Position
		for (int idx = 0; idx < cells.length; idx++) {//Move Blocks Left
			cells[idx].setCol(cells[idx].getCol() - 1);
		}
	}
	/** Shifts the position of this shape Down (increasing the row) by one. No bounds checking is done. 
	 * 
	 * **/
	public void shiftDown() {
		cells = this.getCells();
		pos.setRow(pos.row() + 1);
		for (int idx = 0; idx < cells.length; idx++) {//Move Blocks Down
			cells[idx].setRow(cells[idx].getRow() + 1);
		}
	}
	/** Shifts the position of this shape right (increasing the column) by one. No bounds checking is done. 
	 * 
	 * **/
	public void shiftRight() {
		cells = this.getCells();
		pos.setCol(pos.col() + 1);//Set Position
		for (int idx = 0; idx < cells.length; idx++) {//Move Blocks Right 
			cells[idx].setCol(cells[idx].getCol() + 1);
		}
	}

	@Override
	public Shape clone() {
		try {
			AbstractShape s = (AbstractShape) super.clone();
			return s;
		} catch (CloneNotSupportedException e) {
			// can't happen
			return null;
		}
	}
}
