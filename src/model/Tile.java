package model;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Tile extends StackPane{
	private int x,y;
	private boolean hasBomb;
	private int bombs = 0;
	
	private Rectangle border = new Rectangle(40, 40);
	private Text text = new Text();
	
	public Tile(int x, int y, boolean hasBomb) {
		this.x = x;
		this.y = y;
		this.hasBomb = hasBomb;			
		border.setStroke(Color.LIGHTGRAY);		
		text.setText(hasBomb ? "x" : "");		
		getChildren().addAll(border, text);
		
		setTranslateX(x * 40);
		setTranslateY(y * 40);
		
	}

}
