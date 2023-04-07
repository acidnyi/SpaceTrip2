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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import spacetrip.spacetrip2.Logic.Agency;

public class LogInController {

    private Stage stage;
    private Parent root;
    private Scene scene;

    Agency agency;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button logInButton;

    @FXML
    private TextField loginTextField;

    @FXML
    private TextField passwordTextField;

    public void logInButtonClicked(ActionEvent event) throws IOException {
        agency = new Agency();
        if(agency.login(loginTextField.getText(), passwordTextField.getText())!=null){
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("Account.fxml"));
            this.stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene((Parent)fxmlLoader.load(), 600.0, 400.0);
            this.stage.setScene(scene);
            this.stage.show();
        }else{
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Error 404", "Log In problem", JOptionPane.INFORMATION_MESSAGE);
            System.exit(1);
        }

    }

}