package ApplicationGraphical;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GraphicalUserInterface extends Application{
    @Override
    public void start(Stage stage) throws Exception {
    try{
        Image icon = new Image("icon.png");
        stage.getIcons().add(icon);

        BorderPane root = new BorderPane();
        Scene scene = new Scene(root,250,250, Color.ANTIQUEWHITE);

        Button LoginButton = new Button();
        LoginButton.setText("Login");
        LoginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Add method on LoginButton action in the future
            }
        });


        root.setTop(LoginButton);
        stage.setTitle("Password generator");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }

    }
}




