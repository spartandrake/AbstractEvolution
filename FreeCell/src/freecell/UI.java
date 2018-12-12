package freecell;

import javafx.geometry.Insets;

import java.util.Random;

import freecell.playingTable;
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
/*
 * Comment
 */

public class UI  extends Application{

	Stage window;
	GridPane grid;
	Stack first = null;
	
	Label card1;
	Label card2;
	Label card3;
	Label card4;
	Label card5;
	Label card6;
	Label card7;
	Label card8;
	Label freeCell1;
	Label freeCell2;
	Label freeCell3;
	Label freeCell4;
	Label foundation1;
	Label foundation2;
	Label foundation3;
	Label foundation4;
	
	Button column1;
	Button column2;
	Button column3;
	Button column4;
	Button column5;
	Button column6;
	Button column7;
	Button column8;
	Button column9;
	Button column10;
	Button column11;
	Button column12;
	Button column13;
	Button column14;
	Button column15;
	Button column16;
	
	playingTable table;
	
	static long seed = 42;
	static boolean cheat = false;
	
	/* Pass an argument for it to be the seed of the program. If nothing is received a random seed is used.
	 * If you pass the word "Cheater" then the deck will not shuffle and it is easier to see how the game works once you win.
	 */
	public static void main(String[] args) {
		if(args.length != 0) {
			if(args[0].equals("Cheater")) {
				cheat = true;
			}
			else {
				try {
					seed = Integer.parseInt(args[0]);
				}
				catch(Exception e) {
					
				}
			}
		}
		else {
			Random rand = new Random();
			seed = rand.nextLong();
		}
		launch(args);
	}

	public void updateText() {
		card1 = new Label(table.getTableColumns().get(0).toString());
		card2 = new Label(table.getTableColumns().get(1).toString());
		card3 = new Label(table.getTableColumns().get(2).toString());
		card4 = new Label(table.getTableColumns().get(3).toString());
		card5 = new Label(table.getTableColumns().get(4).toString());
		card6 = new Label(table.getTableColumns().get(5).toString());
		card7 = new Label(table.getTableColumns().get(6).toString());
		card8 = new Label(table.getTableColumns().get(7).toString());
		freeCell1 = new Label(table.getTableFreeCells().get(0).toString());		
		freeCell2 = new Label(table.getTableFreeCells().get(1).toString());
		freeCell3 = new Label(table.getTableFreeCells().get(2).toString());
		freeCell4 = new Label(table.getTableFreeCells().get(3).toString());
		foundation1 = new Label(table.getTableFoundations().get(0).toString());
		foundation2 = new Label(table.getTableFoundations().get(1).toString());
		foundation3 = new Label(table.getTableFoundations().get(2).toString());
		foundation4 = new Label(table.getTableFoundations().get(3).toString());
		
	}
	@Override
	public void start(Stage arg0) throws Exception {
		// Open a user interface
		// Create a playingTable
		// Get user seed for deck
		//Random rand = new Random(1);
		//long userInput = rand.nextLong();
		table = new playingTable(seed, cheat);
		// Shuffle the deck, maybe use a seed
		table.deal();
		// Deal the cards
		// Interact with user
		//// Check for win
		//// Check valid move
		
		
		window = arg0;
		window.setTitle("AE FreeCell");
		
		HBox topMenu = new HBox();
		Button newGame = new Button("New");
		Button retryGame = new Button("Retry");
		topMenu.getChildren().addAll(newGame, retryGame);
		
		grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(10);
		
		freeCell1 = new Label(table.getTableFreeCells().get(0).toString());
		GridPane.setConstraints(freeCell1, 0, 0);
		
		freeCell2 = new Label(table.getTableFreeCells().get(1).toString());
		GridPane.setConstraints(freeCell2, 1, 0);
		
		freeCell3 = new Label(table.getTableFreeCells().get(2).toString());
		GridPane.setConstraints(freeCell3, 2, 0);
		
		freeCell4 = new Label(table.getTableFreeCells().get(3).toString());
		GridPane.setConstraints(freeCell4, 3, 0);
		
		column9 = new Button("Free Cell 1");
		GridPane.setConstraints(column9, 0, 1);
		column9.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(first == null) {
					first = table.getTableFreeCells().get(0);
				}
				else {
					table.moveCard(first, table.getTableFreeCells().get(0));
					first = null;
				}
				card1.setText(table.getTableColumns().get(0).toString());
				card2.setText(table.getTableColumns().get(1).toString());
				card3.setText(table.getTableColumns().get(2).toString());
				card4.setText(table.getTableColumns().get(3).toString());
				card5.setText(table.getTableColumns().get(4).toString());
				card6.setText(table.getTableColumns().get(5).toString());
				card7.setText(table.getTableColumns().get(6).toString());
				card8.setText(table.getTableColumns().get(7).toString());
				
				freeCell1.setText(table.getTableFreeCells().get(0).toString());
				freeCell2.setText(table.getTableFreeCells().get(1).toString());
				freeCell3.setText(table.getTableFreeCells().get(2).toString());
				freeCell4.setText(table.getTableFreeCells().get(3).toString());
				
				foundation1.setText(table.getTableFoundations().get(0).toString());
				foundation2.setText(table.getTableFoundations().get(1).toString());
				foundation3.setText(table.getTableFoundations().get(2).toString());
				foundation4.setText(table.getTableFoundations().get(3).toString());
			}
		});
		/*
		 * 
		 	column9.setOnAction(e -> {
		 
			if(first == null) {
				first = table.getTableFreeCells().get(0);
			}
			else {
				table.moveCard(first, table.getTableFreeCells().get(0));
				first = null;
				
				System.out.println(table.getTableFreeCells().get(0));
			}	
		});
		*/
		column10 = new Button("Free Cell 2");
		GridPane.setConstraints(column10, 1, 1);
		column10.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(first == null) {
					first = table.getTableFreeCells().get(1);
				}
				else {
					table.moveCard(first, table.getTableFreeCells().get(1));
					first = null;
				}
				card1.setText(table.getTableColumns().get(0).toString());
				card2.setText(table.getTableColumns().get(1).toString());
				card3.setText(table.getTableColumns().get(2).toString());
				card4.setText(table.getTableColumns().get(3).toString());
				card5.setText(table.getTableColumns().get(4).toString());
				card6.setText(table.getTableColumns().get(5).toString());
				card7.setText(table.getTableColumns().get(6).toString());
				card8.setText(table.getTableColumns().get(7).toString());
				
				freeCell1.setText(table.getTableFreeCells().get(0).toString());
				freeCell2.setText(table.getTableFreeCells().get(1).toString());
				freeCell3.setText(table.getTableFreeCells().get(2).toString());
				freeCell4.setText(table.getTableFreeCells().get(3).toString());
				
				foundation1.setText(table.getTableFoundations().get(0).toString());
				foundation2.setText(table.getTableFoundations().get(1).toString());
				foundation3.setText(table.getTableFoundations().get(2).toString());
				foundation4.setText(table.getTableFoundations().get(3).toString());
			}
		});
		column11 = new Button("Free Cell 3");
		GridPane.setConstraints(column11, 2, 1);
		column11.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(first == null) {
					first = table.getTableFreeCells().get(2);
				}
				else {
					table.moveCard(first, table.getTableFreeCells().get(2));
					first = null;
				}	
				card1.setText(table.getTableColumns().get(0).toString());
				card2.setText(table.getTableColumns().get(1).toString());
				card3.setText(table.getTableColumns().get(2).toString());
				card4.setText(table.getTableColumns().get(3).toString());
				card5.setText(table.getTableColumns().get(4).toString());
				card6.setText(table.getTableColumns().get(5).toString());
				card7.setText(table.getTableColumns().get(6).toString());
				card8.setText(table.getTableColumns().get(7).toString());
				
				freeCell1.setText(table.getTableFreeCells().get(0).toString());
				freeCell2.setText(table.getTableFreeCells().get(1).toString());
				freeCell3.setText(table.getTableFreeCells().get(2).toString());
				freeCell4.setText(table.getTableFreeCells().get(3).toString());
				
				foundation1.setText(table.getTableFoundations().get(0).toString());
				foundation2.setText(table.getTableFoundations().get(1).toString());
				foundation3.setText(table.getTableFoundations().get(2).toString());
				foundation4.setText(table.getTableFoundations().get(3).toString());
			}
		});
		column12 = new Button("Free Cell 4");
		GridPane.setConstraints(column12, 3, 1);
		column12.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(first == null) {
					first = table.getTableFreeCells().get(3);
				}
				else {
					table.moveCard(first, table.getTableFreeCells().get(3));
					first = null;
				}	
				card1.setText(table.getTableColumns().get(0).toString());
				card2.setText(table.getTableColumns().get(1).toString());
				card3.setText(table.getTableColumns().get(2).toString());
				card4.setText(table.getTableColumns().get(3).toString());
				card5.setText(table.getTableColumns().get(4).toString());
				card6.setText(table.getTableColumns().get(5).toString());
				card7.setText(table.getTableColumns().get(6).toString());
				card8.setText(table.getTableColumns().get(7).toString());
				
				freeCell1.setText(table.getTableFreeCells().get(0).toString());
				freeCell2.setText(table.getTableFreeCells().get(1).toString());
				freeCell3.setText(table.getTableFreeCells().get(2).toString());
				freeCell4.setText(table.getTableFreeCells().get(3).toString());
				
				foundation1.setText(table.getTableFoundations().get(0).toString());
				foundation2.setText(table.getTableFoundations().get(1).toString());
				foundation3.setText(table.getTableFoundations().get(2).toString());
				foundation4.setText(table.getTableFoundations().get(3).toString());
			}
		});
		
		foundation1 = new Label(table.getTableFoundations().get(0).toString());
		GridPane.setConstraints(foundation1, 4, 0);
		
		foundation2 = new Label(table.getTableFoundations().get(1).toString());
		GridPane.setConstraints(foundation2, 5, 0);
		
		foundation3 = new Label(table.getTableFoundations().get(2).toString());
		GridPane.setConstraints(foundation3, 6, 0);
		
		foundation4 = new Label(table.getTableFoundations().get(3).toString());
		GridPane.setConstraints(foundation4, 7, 0);
		
		Button column13 = new Button("Foundation 1");
		GridPane.setConstraints(column13, 4, 1);
		column13.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(first == null) {
					
				}
				else {
					table.moveCard(first, table.getTableFoundations().get(0));
					first = null;
				}	
				card1.setText(table.getTableColumns().get(0).toString());
				card2.setText(table.getTableColumns().get(1).toString());
				card3.setText(table.getTableColumns().get(2).toString());
				card4.setText(table.getTableColumns().get(3).toString());
				card5.setText(table.getTableColumns().get(4).toString());
				card6.setText(table.getTableColumns().get(5).toString());
				card7.setText(table.getTableColumns().get(6).toString());
				card8.setText(table.getTableColumns().get(7).toString());
				
				freeCell1.setText(table.getTableFreeCells().get(0).toString());
				freeCell2.setText(table.getTableFreeCells().get(1).toString());
				freeCell3.setText(table.getTableFreeCells().get(2).toString());
				freeCell4.setText(table.getTableFreeCells().get(3).toString());
				
				foundation1.setText(table.getTableFoundations().get(0).toString());
				foundation2.setText(table.getTableFoundations().get(1).toString());
				foundation3.setText(table.getTableFoundations().get(2).toString());
				foundation4.setText(table.getTableFoundations().get(3).toString());
				
				if(table.isGameOver()) {
					WinScreen.Display();
				}
			}
		});
		Button column14 = new Button("Foundation 2");
		GridPane.setConstraints(column14, 5, 1);
		column14.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(first == null) {
					
				}
				else {
					table.moveCard(first, table.getTableFoundations().get(1));
					first = null;
				}	
				card1.setText(table.getTableColumns().get(0).toString());
				card2.setText(table.getTableColumns().get(1).toString());
				card3.setText(table.getTableColumns().get(2).toString());
				card4.setText(table.getTableColumns().get(3).toString());
				card5.setText(table.getTableColumns().get(4).toString());
				card6.setText(table.getTableColumns().get(5).toString());
				card7.setText(table.getTableColumns().get(6).toString());
				card8.setText(table.getTableColumns().get(7).toString());
				
				freeCell1.setText(table.getTableFreeCells().get(0).toString());
				freeCell2.setText(table.getTableFreeCells().get(1).toString());
				freeCell3.setText(table.getTableFreeCells().get(2).toString());
				freeCell4.setText(table.getTableFreeCells().get(3).toString());
				
				foundation1.setText(table.getTableFoundations().get(0).toString());
				foundation2.setText(table.getTableFoundations().get(1).toString());
				foundation3.setText(table.getTableFoundations().get(2).toString());
				foundation4.setText(table.getTableFoundations().get(3).toString());
				if(table.isGameOver()) {
					WinScreen.Display();
				}
			}
		});
		Button column15 = new Button("Foundation 3");
		GridPane.setConstraints(column15, 6, 1);
		column15.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(first == null) {
					
				}
				else {
					table.moveCard(first, table.getTableFoundations().get(2));
					first = null;
				}	
				card1.setText(table.getTableColumns().get(0).toString());
				card2.setText(table.getTableColumns().get(1).toString());
				card3.setText(table.getTableColumns().get(2).toString());
				card4.setText(table.getTableColumns().get(3).toString());
				card5.setText(table.getTableColumns().get(4).toString());
				card6.setText(table.getTableColumns().get(5).toString());
				card7.setText(table.getTableColumns().get(6).toString());
				card8.setText(table.getTableColumns().get(7).toString());
				
				freeCell1.setText(table.getTableFreeCells().get(0).toString());
				freeCell2.setText(table.getTableFreeCells().get(1).toString());
				freeCell3.setText(table.getTableFreeCells().get(2).toString());
				freeCell4.setText(table.getTableFreeCells().get(3).toString());
				
				foundation1.setText(table.getTableFoundations().get(0).toString());
				foundation2.setText(table.getTableFoundations().get(1).toString());
				foundation3.setText(table.getTableFoundations().get(2).toString());
				foundation4.setText(table.getTableFoundations().get(3).toString());
				if(table.isGameOver()) {
					WinScreen.Display();
				}
			}
		});
		Button column16 = new Button("Foundation 4");
		GridPane.setConstraints(column16, 7, 1);
		column16.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(first == null) {
					
				}
				else {
					table.moveCard(first, table.getTableFoundations().get(3));
					first = null;
				}	
				card1.setText(table.getTableColumns().get(0).toString());
				card2.setText(table.getTableColumns().get(1).toString());
				card3.setText(table.getTableColumns().get(2).toString());
				card4.setText(table.getTableColumns().get(3).toString());
				card5.setText(table.getTableColumns().get(4).toString());
				card6.setText(table.getTableColumns().get(5).toString());
				card7.setText(table.getTableColumns().get(6).toString());
				card8.setText(table.getTableColumns().get(7).toString());
				
				freeCell1.setText(table.getTableFreeCells().get(0).toString());
				freeCell2.setText(table.getTableFreeCells().get(1).toString());
				freeCell3.setText(table.getTableFreeCells().get(2).toString());
				freeCell4.setText(table.getTableFreeCells().get(3).toString());
				
				foundation1.setText(table.getTableFoundations().get(0).toString());
				foundation2.setText(table.getTableFoundations().get(1).toString());
				foundation3.setText(table.getTableFoundations().get(2).toString());
				foundation4.setText(table.getTableFoundations().get(3).toString());
				if(table.isGameOver()) {
					WinScreen.Display();
				}
			}
		});
		
		
		// Card
		card1 = new Label(table.getTableColumns().get(0).toString());
		GridPane.setConstraints(card1, 0, 2);
		
		card2 = new Label(table.getTableColumns().get(1).toString());
		GridPane.setConstraints(card2, 1, 2);
		
		card3 = new Label(table.getTableColumns().get(2).toString());
		GridPane.setConstraints(card3, 2, 2);
		
		card4 = new Label(table.getTableColumns().get(3).toString());
		GridPane.setConstraints(card4, 3, 2);
		
		card5 = new Label(table.getTableColumns().get(4).toString());
		GridPane.setConstraints(card5, 4, 2);
		
		card6 = new Label(table.getTableColumns().get(5).toString());
		GridPane.setConstraints(card6, 5, 2);
		
		card7 = new Label(table.getTableColumns().get(6).toString());
		GridPane.setConstraints(card7, 6, 2);
		
		card8 = new Label(table.getTableColumns().get(7).toString());
		GridPane.setConstraints(card8, 7, 2);
		
		Button column1 = new Button("Column 1");
		GridPane.setConstraints(column1, 0, 3);
		column1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(first == null) {
					first = table.getTableColumns().get(0);
				}
				else {
					table.moveCard(first, table.getTableColumns().get(0));
					first = null;
				}	
				card1.setText(table.getTableColumns().get(0).toString());
				card2.setText(table.getTableColumns().get(1).toString());
				card3.setText(table.getTableColumns().get(2).toString());
				card4.setText(table.getTableColumns().get(3).toString());
				card5.setText(table.getTableColumns().get(4).toString());
				card6.setText(table.getTableColumns().get(5).toString());
				card7.setText(table.getTableColumns().get(6).toString());
				card8.setText(table.getTableColumns().get(7).toString());
				
				freeCell1.setText(table.getTableFreeCells().get(0).toString());
				freeCell2.setText(table.getTableFreeCells().get(1).toString());
				freeCell3.setText(table.getTableFreeCells().get(2).toString());
				freeCell4.setText(table.getTableFreeCells().get(3).toString());
				
				foundation1.setText(table.getTableFoundations().get(0).toString());
				foundation2.setText(table.getTableFoundations().get(1).toString());
				foundation3.setText(table.getTableFoundations().get(2).toString());
				foundation4.setText(table.getTableFoundations().get(3).toString());
			}
		});
		column2 = new Button("Column 2");
		GridPane.setConstraints(column2, 1, 3);
		column2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(first == null) {
					first = table.getTableColumns().get(1);
				}
				else {
					table.moveCard(first, table.getTableColumns().get(1));
					first = null;
				}	
				card1.setText(table.getTableColumns().get(0).toString());
				card2.setText(table.getTableColumns().get(1).toString());
				card3.setText(table.getTableColumns().get(2).toString());
				card4.setText(table.getTableColumns().get(3).toString());
				card5.setText(table.getTableColumns().get(4).toString());
				card6.setText(table.getTableColumns().get(5).toString());
				card7.setText(table.getTableColumns().get(6).toString());
				card8.setText(table.getTableColumns().get(7).toString());
				
				freeCell1.setText(table.getTableFreeCells().get(0).toString());
				freeCell2.setText(table.getTableFreeCells().get(1).toString());
				freeCell3.setText(table.getTableFreeCells().get(2).toString());
				freeCell4.setText(table.getTableFreeCells().get(3).toString());
				
				foundation1.setText(table.getTableFoundations().get(0).toString());
				foundation2.setText(table.getTableFoundations().get(1).toString());
				foundation3.setText(table.getTableFoundations().get(2).toString());
				foundation4.setText(table.getTableFoundations().get(3).toString());
			}
		});
		column3 = new Button("Column 3");
		GridPane.setConstraints(column3, 2, 3);
		column3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(first == null) {
					first = table.getTableColumns().get(2);
				}
				else {
					table.moveCard(first, table.getTableColumns().get(2));
					first = null;
				}	
				card1.setText(table.getTableColumns().get(0).toString());
				card2.setText(table.getTableColumns().get(1).toString());
				card3.setText(table.getTableColumns().get(2).toString());
				card4.setText(table.getTableColumns().get(3).toString());
				card5.setText(table.getTableColumns().get(4).toString());
				card6.setText(table.getTableColumns().get(5).toString());
				card7.setText(table.getTableColumns().get(6).toString());
				card8.setText(table.getTableColumns().get(7).toString());
				
				freeCell1.setText(table.getTableFreeCells().get(0).toString());
				freeCell2.setText(table.getTableFreeCells().get(1).toString());
				freeCell3.setText(table.getTableFreeCells().get(2).toString());
				freeCell4.setText(table.getTableFreeCells().get(3).toString());
				
				foundation1.setText(table.getTableFoundations().get(0).toString());
				foundation2.setText(table.getTableFoundations().get(1).toString());
				foundation3.setText(table.getTableFoundations().get(2).toString());
				foundation4.setText(table.getTableFoundations().get(3).toString());
			}
		});
		column4 = new Button("Column 4");
		GridPane.setConstraints(column4, 3, 3);
		column4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(first == null) {
					first = table.getTableColumns().get(3);
				}
				else {
					table.moveCard(first, table.getTableColumns().get(3));
					first = null;
				}	
				card1.setText(table.getTableColumns().get(0).toString());
				card2.setText(table.getTableColumns().get(1).toString());
				card3.setText(table.getTableColumns().get(2).toString());
				card4.setText(table.getTableColumns().get(3).toString());
				card5.setText(table.getTableColumns().get(4).toString());
				card6.setText(table.getTableColumns().get(5).toString());
				card7.setText(table.getTableColumns().get(6).toString());
				card8.setText(table.getTableColumns().get(7).toString());
				
				freeCell1.setText(table.getTableFreeCells().get(0).toString());
				freeCell2.setText(table.getTableFreeCells().get(1).toString());
				freeCell3.setText(table.getTableFreeCells().get(2).toString());
				freeCell4.setText(table.getTableFreeCells().get(3).toString());
				
				foundation1.setText(table.getTableFoundations().get(0).toString());
				foundation2.setText(table.getTableFoundations().get(1).toString());
				foundation3.setText(table.getTableFoundations().get(2).toString());
				foundation4.setText(table.getTableFoundations().get(3).toString());
			}
		});
		column5 = new Button("Column 5");
		GridPane.setConstraints(column5, 4, 3);
		column5.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(first == null) {
					first = table.getTableColumns().get(4);
				}
				else {
					table.moveCard(first, table.getTableColumns().get(4));
					first = null;
				}	
				card1.setText(table.getTableColumns().get(0).toString());
				card2.setText(table.getTableColumns().get(1).toString());
				card3.setText(table.getTableColumns().get(2).toString());
				card4.setText(table.getTableColumns().get(3).toString());
				card5.setText(table.getTableColumns().get(4).toString());
				card6.setText(table.getTableColumns().get(5).toString());
				card7.setText(table.getTableColumns().get(6).toString());
				card8.setText(table.getTableColumns().get(7).toString());
				
				freeCell1.setText(table.getTableFreeCells().get(0).toString());
				freeCell2.setText(table.getTableFreeCells().get(1).toString());
				freeCell3.setText(table.getTableFreeCells().get(2).toString());
				freeCell4.setText(table.getTableFreeCells().get(3).toString());
				
				foundation1.setText(table.getTableFoundations().get(0).toString());
				foundation2.setText(table.getTableFoundations().get(1).toString());
				foundation3.setText(table.getTableFoundations().get(2).toString());
				foundation4.setText(table.getTableFoundations().get(3).toString());
			}
		});
		column6 = new Button("Column 6");
		GridPane.setConstraints(column6, 5, 3);
		column6.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(first == null) {
					first = table.getTableColumns().get(5);
				}
				else {
					table.moveCard(first, table.getTableColumns().get(5));
					first = null;
				}	
				card1.setText(table.getTableColumns().get(0).toString());
				card2.setText(table.getTableColumns().get(1).toString());
				card3.setText(table.getTableColumns().get(2).toString());
				card4.setText(table.getTableColumns().get(3).toString());
				card5.setText(table.getTableColumns().get(4).toString());
				card6.setText(table.getTableColumns().get(5).toString());
				card7.setText(table.getTableColumns().get(6).toString());
				card8.setText(table.getTableColumns().get(7).toString());
				
				freeCell1.setText(table.getTableFreeCells().get(0).toString());
				freeCell2.setText(table.getTableFreeCells().get(1).toString());
				freeCell3.setText(table.getTableFreeCells().get(2).toString());
				freeCell4.setText(table.getTableFreeCells().get(3).toString());
				
				foundation1.setText(table.getTableFoundations().get(0).toString());
				foundation2.setText(table.getTableFoundations().get(1).toString());
				foundation3.setText(table.getTableFoundations().get(2).toString());
				foundation4.setText(table.getTableFoundations().get(3).toString());
			}
		});
		column7 = new Button("Column 7");
		GridPane.setConstraints(column7, 6, 3);
		column7.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(first == null) {
					first = table.getTableColumns().get(6);
				}
				else {
					table.moveCard(first, table.getTableColumns().get(6));
					first = null;
				}	
				card1.setText(table.getTableColumns().get(0).toString());
				card2.setText(table.getTableColumns().get(1).toString());
				card3.setText(table.getTableColumns().get(2).toString());
				card4.setText(table.getTableColumns().get(3).toString());
				card5.setText(table.getTableColumns().get(4).toString());
				card6.setText(table.getTableColumns().get(5).toString());
				card7.setText(table.getTableColumns().get(6).toString());
				card8.setText(table.getTableColumns().get(7).toString());
				
				freeCell1.setText(table.getTableFreeCells().get(0).toString());
				freeCell2.setText(table.getTableFreeCells().get(1).toString());
				freeCell3.setText(table.getTableFreeCells().get(2).toString());
				freeCell4.setText(table.getTableFreeCells().get(3).toString());
				
				foundation1.setText(table.getTableFoundations().get(0).toString());
				foundation2.setText(table.getTableFoundations().get(1).toString());
				foundation3.setText(table.getTableFoundations().get(2).toString());
				foundation4.setText(table.getTableFoundations().get(3).toString());
			}
		});
		column8 = new Button("Column 8");
		GridPane.setConstraints(column8, 7, 3);
		column8.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(first == null) {
					first = table.getTableColumns().get(7);
				}
				else {
					table.moveCard(first, table.getTableColumns().get(7));
					first = null;
				}	
				card1.setText(table.getTableColumns().get(0).toString());
				card2.setText(table.getTableColumns().get(1).toString());
				card3.setText(table.getTableColumns().get(2).toString());
				card4.setText(table.getTableColumns().get(3).toString());
				card5.setText(table.getTableColumns().get(4).toString());
				card6.setText(table.getTableColumns().get(5).toString());
				card7.setText(table.getTableColumns().get(6).toString());
				card8.setText(table.getTableColumns().get(7).toString());
				
				freeCell1.setText(table.getTableFreeCells().get(0).toString());
				freeCell2.setText(table.getTableFreeCells().get(1).toString());
				freeCell3.setText(table.getTableFreeCells().get(2).toString());
				freeCell4.setText(table.getTableFreeCells().get(3).toString());
				
				foundation1.setText(table.getTableFoundations().get(0).toString());
				foundation2.setText(table.getTableFoundations().get(1).toString());
				foundation3.setText(table.getTableFoundations().get(2).toString());
				foundation4.setText(table.getTableFoundations().get(3).toString());
			}
		});
		
		grid.getChildren().addAll(foundation1, foundation2, foundation3, foundation4);
		grid.getChildren().addAll(column13, column14, column15, column16);
		grid.getChildren().addAll(freeCell1, freeCell2, freeCell3, freeCell4);
		grid.getChildren().addAll(column9, column10, column11, column12);
		grid.getChildren().addAll(card1, card2, card3, card4, card5, card6, card7, card8);
		grid.getChildren().addAll(column1, column2, column3, column4, column5, column6, column7, column8);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setCenter(grid);
		
		
		int width = 1200, height = 1000;
		Scene scene = new Scene(borderPane, width, height);
		//scene.getStylesheets().add("theme.css");
		window.setScene(scene);
		window.show();

	}
}
