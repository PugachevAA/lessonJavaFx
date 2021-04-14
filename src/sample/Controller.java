package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {
    private Date dt = new Date();
    SimpleDateFormat dateFormatter = new SimpleDateFormat("[dd.MM.yyy HH:mm:ss]");
    @FXML
    TextArea chatTextArea;
    @FXML
    TextField messageTextField;

    public void sendAction(ActionEvent actionEvent) {
        chatTextArea.appendText(dateFormatter.format(dt) + " " + messageTextField.getText()+"\n");
        messageTextField.clear();
    }
}
