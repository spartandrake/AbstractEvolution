import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
		window.setTitle("Title");
		
		
		StackPane layout = new StackPane();
		int width = 300, height = 250;
		Scene scene = new Scene(layout, width, height);
		window.setScene(scene);
		window.show();
	}

}
