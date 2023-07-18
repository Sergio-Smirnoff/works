package frontend;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SavingsApp extends Application{

        public static void main(String[] args) {
            launch(args);
        }
        @Override
        public void start(Stage primaryStage) {
            // Create a BorderPane to hold the content
            BorderPane root = new BorderPane();

            // Create a toolbox at the top of the BorderPane
            StackPane toolbox = new StackPane();
            toolbox.setPadding(new Insets(10));
            toolbox.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, null, null)));
            Button button1 = new Button("Tool 1");
            Button button2 = new Button("Tool 2");
            Button button3 = new Button("Tool 3");
            toolbox.getChildren().addAll(button1, button2, button3);
            StackPane.setAlignment(button1, javafx.geometry.Pos.CENTER_LEFT);
            StackPane.setAlignment(button2, javafx.geometry.Pos.CENTER);
            StackPane.setAlignment(button3, javafx.geometry.Pos.CENTER_RIGHT);
            root.setTop(toolbox);

            // Create a StackPane to hold the main content
            StackPane content = new StackPane();
            content.setBackground(new Background(new BackgroundFill(Color.DARKGRAY, null, null)));
            root.setCenter(content);

            // Create a Scene and add the content to it
            Scene scene = new Scene(root, 400, 300);

            // Set the Scene on the primary stage
            primaryStage.setScene(scene);
            primaryStage.show();
        }
}
