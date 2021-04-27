package model;

import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;

public class Game {
	//Tile class to fill the pane. 
	private class Tile extends StackPane{
		private int x,y;
		private boolean hasBomb;
//		private Rectangle border = new Rectangle(tile_size -2, tile_size-2);
		
		public Tile(int x,int y, boolean hasBomb){
			this.x = x;
			this.y = y;
			this.hasBomb = hasBomb;								
		}
		
	}
}
