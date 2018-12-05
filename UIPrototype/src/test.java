import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/*
 	The stage is the window.
 	The scene is all that you see in the window.
 
 */
public class test extends Application{

	Button button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		arg0.setTitle("FreeCell Prototype");
		button = new Button();
		button.setText("Click here.");
		
		//button.setOnAction(e -> AlertBox.display("Spam", "OoooOOOoooohhhh I like it when you touch me there")); // If clicked we want the card to stick to the mouse
		
		button.setOnAction(e -> {
			boolean result = ConfirmBox.display("Spicy", "Are you sure you want to send naked pics to your ex?");
			System.out.println(result);
		});
		
		StackPane layout = new StackPane();
		
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 800, 600);
		
		arg0.setScene(scene);
		arg0.show();
	}
	

}
