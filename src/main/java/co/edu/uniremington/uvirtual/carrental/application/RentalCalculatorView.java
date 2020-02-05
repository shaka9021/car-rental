package co.edu.uniremington.uvirtual.carrental.application;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RentalCalculatorView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader();

        String file = String.format("%s.fxml", RentalCalculatorView.class.getSimpleName());
        URL url = RentalCalculatorView.class.getResource(file);

        loader.setLocation(url);
        AnchorPane root = loader.<AnchorPane>load();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
