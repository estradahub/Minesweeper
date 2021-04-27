package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GameController {
	
	@FXML
	public GridPane grid;
	
	public Button tile = new Button();	

	public Button tile2 = new Button("X");
	
	
	public GameController() {
		
	}
	
	public void tileOnAction(ActionEvent event)throws IOException {
		System.out.println("Seems to be working well!!");
		grid.add(tile2, 0, 0, 0, 0);
		
	}
}
