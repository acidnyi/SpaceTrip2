package spacetrip.spacetrip2;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import spacetrip.spacetrip2.Logic.Account;
import spacetrip.spacetrip2.Logic.Agency;
import spacetrip.spacetrip2.Logic.Data;

public class AccountController {

    Data data;
    @FXML
    private Label nameLabel;

    @FXML
    private Button printPlanetsButton;

    @FXML
    private Label surnameLabel;

    public void printAllPlanets(){
        data =new Data(1);
        data.print();
    }

}