import javafx.geometry.Insets;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class test2  extends Application{

	Stage window;
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		window = arg0;
		window.setTitle("AE FreeCell");
		
		HBox topMenu = new HBox();
		Button newGame = new Button("New");
		Button retryGame = new Button("Retry");
		topMenu.getChildren().addAll(newGame, retryGame);
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(10);
		
		Label freeCell1 = new Label("Empty");
		GridPane.setConstraints(freeCell1, 0, 0);
		
		Label freeCell2 = new Label("Empty");
		GridPane.setConstraints(freeCell2, 1, 0);
		
		Label freeCell3 = new Label("Empty");
		GridPane.setConstraints(freeCell3, 2, 0);
		
		Label freeCell4 = new Label("Empty");
		GridPane.setConstraints(freeCell4, 3, 0);
		
		Button column9 = new Button("Free Cell 1");
		GridPane.setConstraints(column9, 0, 1);
		Button column10 = new Button("Free Cell 2");
		GridPane.setConstraints(column10, 1, 1);
		Button column11 = new Button("Free Cell 3");
		GridPane.setConstraints(column11, 2, 1);
		Button column12 = new Button("Free Cell 4");
		GridPane.setConstraints(column12, 3, 1);
		
		Label foundation1 = new Label("Empty");
		GridPane.setConstraints(foundation1, 4, 0);
		
		Label foundation2 = new Label("Empty");
		GridPane.setConstraints(foundation2, 5, 0);
		
		Label foundation3 = new Label("Empty");
		GridPane.setConstraints(foundation3, 6, 0);
		
		Label foundation4 = new Label("Empty");
		GridPane.setConstraints(foundation4, 7, 0);
		
		Button column13 = new Button("Foundation 1");
		GridPane.setConstraints(column13, 4, 1);
		Button column14 = new Button("Foundation 2");
		GridPane.setConstraints(column14, 5, 1);
		Button column15 = new Button("Foundation 3");
		GridPane.setConstraints(column15, 6, 1);
		Button column16 = new Button("Foundation 4");
		GridPane.setConstraints(column16, 7, 1);
		
		
		// Card
		Label card1 = new Label("Ace of Spades");
		GridPane.setConstraints(card1, 0, 2);
		
		Label card2 = new Label("Ace of Clubs");
		GridPane.setConstraints(card2, 1, 2);
		
		Label card3 = new Label("Ace of Hearts");
		GridPane.setConstraints(card3, 2, 2);
		
		Label card4 = new Label("Ace of Diamonds");
		GridPane.setConstraints(card4, 3, 2);
		
		Label card5 = new Label("King of Spades");
		GridPane.setConstraints(card5, 4, 2);
		
		Label card6 = new Label("King of Clubs");
		GridPane.setConstraints(card6, 5, 2);
		
		Label card7 = new Label("King of Hearts");
		GridPane.setConstraints(card7, 6, 2);
		
		Label card8 = new Label("King of Diamonds");
		GridPane.setConstraints(card8, 7, 2);
		
		Button column1 = new Button("Column 1");
		GridPane.setConstraints(column1, 0, 3);
		Button column2 = new Button("Column 2");
		GridPane.setConstraints(column2, 1, 3);
		Button column3 = new Button("Column 3");
		GridPane.setConstraints(column3, 2, 3);
		Button column4 = new Button("Column 4");
		GridPane.setConstraints(column4, 3, 3);
		Button column5 = new Button("Column 5");
		GridPane.setConstraints(column5, 4, 3);
		Button column6 = new Button("Column 6");
		GridPane.setConstraints(column6, 5, 3);
		Button column7 = new Button("Column 7");
		GridPane.setConstraints(column7, 6, 3);
		Button column8 = new Button("Column 8");
		GridPane.setConstraints(column8, 7, 3);
		
		grid.getChildren().addAll(foundation1, foundation2, foundation3, foundation4);
		grid.getChildren().addAll(column13, column14, column15, column16);
		grid.getChildren().addAll(freeCell1, freeCell2, freeCell3, freeCell4);
		grid.getChildren().addAll(column9, column10, column11, column12);
		grid.getChildren().addAll(card1, card2, card3, card4, card5, card6, card7, card8);
		grid.getChildren().addAll(column1, column2, column3, column4, column5, column6, column7, column8);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setCenter(grid);
		
		
		int width = 1200, height = 250;
		Scene scene = new Scene(borderPane, width, height);
		scene.getStylesheets().add("theme.css");
		window.setScene(scene);
		window.show();
	}

}
