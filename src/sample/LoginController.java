package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    void loginButtonPressed(ActionEvent event) {



    }

    public String getUsername(){
        return username.getText();
    }

    public String getPassword(){
        return password.getText();
    }


}
