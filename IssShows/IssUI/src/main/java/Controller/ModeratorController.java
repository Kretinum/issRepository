package Controller;/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/

import Moodel.Moderator;
import Service.Service;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


import java.util.*;
import java.time.*;



// ----------- << imports@AAAAAAF5f+QN6NS1mf8= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAF5f+QN6NS1mf8= >>
// ----------- >>
public class ModeratorController {
    // ----------- << attribute.annotations@AAAAAAF5f+WDidThc2o= >>
    // ----------- >>
    private Moderator LoggedMod;

    // ----------- << attribute.annotations@AAAAAAF5f+Y+4tTrWZw= >>
    // ----------- >>
    private Service Serv;

    public Moderator getLoggedMod() {
        return LoggedMod;
    }


    public void setLoggedMod(Moderator LoggedMod) {
        this.LoggedMod = LoggedMod;
    }

    public void setService(Service serv) {
        this.Serv = serv;
    }


    private Boolean Login(String username,String password)
    {
        Moderator mod = Serv.getModByName(username);
        if (mod!=null && mod.getPassword().equals(password))
            return  true;
        return false;
    }

    @FXML
    TextField userfield;
    @FXML
    PasswordField passfield;
    @FXML
    Button buton;

    @FXML
    public void initialize() {

        buton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String nume = userfield.getText();
                String passwd = passfield.getText();


                if (Login(nume,passwd))
                {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("Success");
                    alert.showAndWait();
                }
                else
                {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Authentication failure");
                alert.setContentText("Wrong username or password");
                alert.showAndWait();
                }
            }
        });
}
}
