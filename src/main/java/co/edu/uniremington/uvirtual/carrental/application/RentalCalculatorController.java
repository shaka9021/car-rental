package co.edu.uniremington.uvirtual.carrental.application;

import co.edu.uniremington.uvirtual.carrental.domain.Car;
import co.edu.uniremington.uvirtual.carrental.domain.Minibus;
import co.edu.uniremington.uvirtual.carrental.domain.Truck;
import co.edu.uniremington.uvirtual.carrental.domain.Van;
import co.edu.uniremington.uvirtual.carrental.domain.Vehicle;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RentalCalculatorController implements Initializable {

    @FXML
    private Label quantity;
    @FXML
    private Label message;
    @FXML
    private TextField days;
    @FXML
    private ComboBox<Vehicle> cars;
    @FXML
    private Button calculator;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // list of cars to rental

        List<Vehicle> l = Arrays.asList(
            new Car("EDR801P"),
            new Minibus("UHJ601P"),
            new Van("UHG01P", 1.0d),
            new Truck("IJF01P", 1.0d));

        // create the observable

        ObservableList<Vehicle> ol = FXCollections.observableList(l);
        cars.setItems(ol);

        // add event handler to button

        calculator.setOnAction((event) -> {

            message.setText("");
            Vehicle v = cars.getSelectionModel().getSelectedItem();

            if (v == null) {
                message.setText("Debe seleccionar un vehìculo");
                return;
            }

            long d = 0;

            try {
                d = Long.parseLong(days.getText());
            } catch (NumberFormatException e) {
                message.setText("Sólo se puede ingresar valores numéricos mayores a 0");
                return;
            }

            if (d <= 0.0d) {
                message.setText("Sólo se puede ingresar valores numéricos mayores a 0");
                return;
            }

            double r = v.rental(d);

            quantity.setText(String.valueOf(r));

        });

    }

}
