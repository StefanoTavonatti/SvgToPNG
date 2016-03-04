package tavonatti.stefano.svgtopngresizer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by stefano on 04/03/16.
 */
public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root= FXMLLoader.load(getClass().getResource("/fxml/SvgToPNG.fxml"));
        primaryStage.setTitle("SvgToPNG");
        primaryStage.setScene(new Scene(root,500,500));
        primaryStage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}
