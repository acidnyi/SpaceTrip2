package spacetrip.spacetrip2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import spacetrip.spacetrip2.Logic.Agency;

public class SignUpController {

    private Stage stage;
    private Parent root;
    private Scene scene;

    Agency agency;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private CheckBox petCheckBox;

    @FXML
    private TextField raceTextField;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField surnameTextField;

    public void signUpButtonClicked(ActionEvent event) throws IOException {
        agency = new Agency();
        if(agency.signUp(nameTextField.getText(), surnameTextField.getText(), raceTextField.getText(), loginTextField.getText(), passwordTextField.getText(), petCheckBox.isAllowIndeterminate())!=null) {
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("Account.fxml"));
            this.stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene((Parent)fxmlLoader.load(), 600.0, 400.0);
            this.stage.setScene(scene);
            this.stage.show();
        } else{
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Error 404", "Sign Up problem", JOptionPane.INFORMATION_MESSAGE);
            System.exit(1);
        }
    }

}