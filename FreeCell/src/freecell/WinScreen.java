package freecell;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class WinScreen {

	public static void Display() {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("WINNER WINNER OLD CHINESE FOOD DINNER");
		window.setMinWidth(400);
		window.setMinHeight(400);
		
		Label label = new Label("Well, the game is over. Maybe you won, maybe you lost. Either way you're a loser.");
		Button closeButton = new Button("Goodbye");
		closeButton.setOnAction(e -> window.close());
		
		VBox layout = new VBox();
		layout.getChildren().addAll(label, closeButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.show();

	}

}
