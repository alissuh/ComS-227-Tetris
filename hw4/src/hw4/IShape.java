package hw4;
import java.awt.Color;

import api.Block;
import api.Cell;
import api.Position;
import api.Shape;
import api.Block;

/**
 * Partial implementation of the Shape interface for experimentation.
 * @author Gavin Monroe
 */
public class IShape extends AbstractShape implements Shape
{
  private Position position;
  private Cell[] cells;
  private int rotated = 0;
  
  public IShape(Position givenPosition, boolean magic)
  {
	super(givenPosition, magic);
    position = givenPosition;
    cells = new Cell[3];
    cells[0] = new Cell(new Block(Color.CYAN, magic), givenPosition );
    
    // another cell just below the first one
    Position position1 = new Position(givenPosition.row() + 1, givenPosition.col());
    cells[1] = new Cell(new Block(Color.CYAN, false), position1);
    
    // another cell just below the second one
    Position position2 = new Position(givenPosition.row() + 2, givenPosition.col());
    cells[2] = new Cell(new Block(Color.CYAN, false), position2);
  }
  
  @Override
  public Cell[] getCells()
  {
    Cell[] copy = new Cell[cells.length];
    
    copy[0] = cells[0];
    copy[1] = cells[1];
    copy[2] = cells[2];
    return copy;
  }

  @Override
  public void shiftDown()
  {
      super.shiftDown();
  }

  @Override
  public void shiftLeft()
  {
    // TODO Auto-generated method stub
	super.shiftLeft();
  }

  @Override
  public void shiftRight()
  {
    // TODO Auto-generated method stub
	  super.shiftRight();
  }

  @Override
  public void transform() {
     super.transform();
  }

  @Override
  public void cycle()
  {
    // TODO Auto-generated method stub
    // 1 2 3 = 3 1 2 ex:
	  super.cycle();
  }

  @Override
  public Shape clone()
  {
    // call the Object clone() method to create a shallow copy
      IShape s = (IShape) super.clone();

     // then make it into a deep copy
     s.position = new Position(position);
     s.cells = new Cell[3];
     s.cells[0] = new Cell(cells[0]);
     s.cells[1] = new Cell(cells[1]);
     s.cells[2] = new Cell(cells[2]);
     return s;
  }
}
