
package hw4;

import java.util.ArrayList;
import java.util.List;

import api.AbstractGame;
import api.Block;
import api.Position;
import java.math.*;

/**
 * MagicTetris implementation.
 * @author Gavin Monroe
 */
public class MagicTetris extends AbstractGame {

	/**
	 * Constructs a game with the given width (columns) and height (rows). This
	 * game will use a new instance of BasicGenerator to generate new shapes.
	 * 
	 * @param width
	 *            width of the game grid (number of columns)
	 * @param height
	 *            height of the game grid (number of rows)
	 */
	public MagicTetris(int width, int height) {
		super(width, height, new BasicGenerator());
	}

	private int score = 0;
	private boolean gravity = false;

	@Override
	public List<Position> determinePositionsToCollapse() {
		// TODO
		List<Position> result = new ArrayList<>();
		if (gravity) {

			for (int row = 0; row < this.getHeight() - 1; row++) {
				for (int col = 0; col < this.getWidth(); col++) {
					Block b = getBlock(row, col);
					if (b != null) {
						for (int idx = this.getHeight() - 1; idx > row; idx--) {
							b = getBlock(idx, col);
							if (b == null)
								result.add(new Position(idx, col));
						}
					}
				}
			}

			gravity = false;
		} else {
			for (int row = 0; row < this.getHeight(); row++) {
				int magicBlocks = 0;
				int blocks = 0;
				for (int col = 0; col < this.getWidth(); col++) {
					Block b = getBlock(row, col);
					if (b != null) {
						blocks++;
						if (b.isMagic()) {
							magicBlocks++;
						}
					}
				}

				if (blocks == this.getWidth()) {

					for (int col = 0; col < this.getWidth(); col++) {
						result.add(new Position(row, col));
					}
					if (magicBlocks >= 3) {
						gravity = true;
					}

					score += Math.pow(2, magicBlocks);
				}

			}
		}

		return result;
	}

	@Override
	public int determineScore() {
		return score;
	}

}
