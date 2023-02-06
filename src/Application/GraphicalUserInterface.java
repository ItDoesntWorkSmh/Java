package Application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GraphicalUserInterface extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        // Main window
        Group root = new Group();
        Scene scene = new Scene(root,350,250, Color.BEIGE);

        // Buttons
        Button LoginButton = new Button();
        LoginButton.setText("Login Button");
        LoginButton.setTranslateX(80);
        LoginButton.setTranslateY(150);
        LoginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Method for Login Button
            }
        });
        Button RegisterButton = new Button();
        RegisterButton.setTranslateX(170);
        RegisterButton.setTranslateY(150);
        RegisterButton.setText("Register Button");
        RegisterButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Method for Register button
            }
        });

        // Text Field
        Label login_id = new Label("Login:");
        Label password = new Label("Password:");
        TextField l1 = new TextField();
        TextField p1 = new TextField();
        GridPane gridPane = new GridPane();
        gridPane.addRow(0,login_id,l1);
        gridPane.addRow(1,password,p1);

        gridPane.setHgap(10);
        gridPane.setTranslateX(70);
        gridPane.setTranslateY(80);

        // Scene for buttons
        StackPane stackPane = new StackPane();
        root.getChildren().addAll(LoginButton,RegisterButton,gridPane);


        // Adding icon
        Image image = new Image("icon.png");
        stage.getIcons().add(image);

        // Necessary settings
        stage.setTitle("Password Generator");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}




