package co.edu.uniremington.uvirtual.carrental.application;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RentalCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader();

        String file = "RentalCalculatorView.fxml";
        URL url = RentalCalculatorApplication.class.getResource(file);

        loader.setLocation(url);
        AnchorPane root = loader.<AnchorPane>load();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Renta de vehículos");

        primaryStage.show();

    }

}
