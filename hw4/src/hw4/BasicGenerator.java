
package hw4;

import java.util.Random;

import api.Generator;
import api.Position;
import api.Shape;

/**
 * Generator for Shape objects in MagicTetris.  All six shapes
 * are equally likely, and the generated shape is magic with
 * 20% probability.
 * @author Gavin Monroe
 */
public class BasicGenerator implements Generator
{
	
  @Override
  public Shape getNext(int width)
  {
    // TODO
	  int mid = width / 2;
	  boolean mag  = false;
	  Random rnd = new Random();
	  int idx = rnd.nextInt(60);
	  Shape result = null;
	  
	  if (idx % 12 == 0) {
		  mag = true;
	  }
	  if (idx > 0 && idx < 11) {
		  Position newP = new Position(-1, mid + 1);
		  result = new LShape(newP, mag);
		  
	  }else if (idx >= 10 && idx < 21) {
		  Position newP = new Position(-1, mid);
		  result = new JShape(newP, mag);
		  
	  }else if (idx >= 20 && idx < 31) {
		  Position newP = new Position(-2, mid);
		  result = new IShape(newP, mag);
		  
	  }else if (idx >= 30 && idx < 41) {
		  Position newP = new Position(-1, mid);
		  result = new OShape(newP, mag);
		  
	  }else if (idx >= 40 && idx < 51) {
		  Position newP = new Position(0, mid);
		  result = new TShape(newP, mag);
		  
	  }else if (idx >= 50 && idx < 61) {
		  Position newP = new Position(-1, mid);
		  result = new SZShape(newP, mag);
		  
	  }else{
		  Position newP = new Position(-1, mid);
		  result = new SZShape(newP, mag); 
	  }
    return result;
  }
}
