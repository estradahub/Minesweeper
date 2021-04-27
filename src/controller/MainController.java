package controller;

import java.io.IOException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import model.Tile;
import model.matrizSecondForm;

public class MainController {
	
	public Button beginner, intermediate, hard, perso;
	//private GameController gc = new GameController(); 
	private matrizSecondForm mat = new matrizSecondForm();

	public void beginnerButtonAction(ActionEvent event) throws IOException {
	
		Random r = new Random();								
		
		GridPane grid = new GridPane();
		
		for (int i=0;i<8;i++) {
			for (int j=0;j<8;j++) {
				int bomb = r.nextInt(2);
				String oneForBomb = String.format(" %s ", bomb);
				Button tile = new Button(oneForBomb);
				
				tile.setOnAction(new EventHandler<ActionEvent>(){					
					@Override
					public void handle(ActionEvent arg0) {						
						System.out.println("It is working now");
					}					
				});
				
				grid.add(tile, i, j);
			}			
		}

		Scene scene = new Scene(grid,800,600);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();

	}
	public void tileOnAction(ActionEvent event)throws IOException {
		System.out.println("throws some test into the console");
		
	}
	public void intermediateButtonAction(ActionEvent event) throws IOException {
		Random r = new Random();
		int bombsQuantity = 10;
		//Button tile = new Button();
		GridPane grid = new GridPane();
		
		for (int i=0;i<16;i++) {
			for (int j=0;j<16;j++) {
				Button tile = new Button();
				int bomb = r.nextInt(16);
				if(bombsQuantity > 0 && bomb == 1) {
					bombsQuantity--;
					String oneForBomb = String.format("%s", bomb);
					tile.setText(oneForBomb);
				}else {
					tile.setText("  ");
				}
				//String oneForBomb = String.format(" %s ", bomb);
								
				tile.setOnAction(new EventHandler<ActionEvent>(){					
					@Override
					public void handle(ActionEvent arg0) {						
						System.out.println("It is working now");
					}					
				});
				
				grid.add(tile, i, j);
			}			
		}

		Scene scene = new Scene(grid,580,450);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(scene);
		window.show();

	}
	public void hardButtonAction(ActionEvent event) throws IOException {
		Parent gameParent = FXMLLoader.load(getClass().getResource("../view/Game.fxml"));
		Scene gameScene = new Scene(gameParent);						
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();		
		window.setScene(gameScene);
		window.show();
	}
	public void persoButtonAction(ActionEvent event) throws IOException {
		Parent gameParent = FXMLLoader.load(getClass().getResource("../view/Game.fxml"));
		Scene gameScene = new Scene(gameParent);						
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();		
		window.setScene(gameScene);
		window.show();
	}
}
