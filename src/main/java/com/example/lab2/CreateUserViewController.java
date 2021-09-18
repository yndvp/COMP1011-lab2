package com.example.lab2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class CreateUserViewController implements Initializable {

    @FXML
    private TextField userNameTextField;

    @FXML
    private TextField pointBalanceTextField;

    @FXML
    private ComboBox<String> characterComboBox;

    @FXML
    private Spinner<Integer> levelSpinner;

    @FXML
    private Label msgLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<String> characters = Arrays.asList("McCree", "Widowmaker", "Sombra", "Zarya","Mei");
        characterComboBox.getItems().addAll(characters);

        // initialize spinner
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100);
        valueFactory.setValue(1);
        levelSpinner.setValueFactory(valueFactory);
    }

    @FXML
    private void submitButton()
    {
        try
        {
            String userName = this.userNameTextField.getText();
            String character = this.characterComboBox.getSelectionModel().getSelectedItem();
            int level = this.levelSpinner.getValue();
            double pointBalance = Double.parseDouble(this.pointBalanceTextField.getText());

            GameUser user = new GameUser(userName,character,level,pointBalance);
            msgLabel.setText("Created user:\n\n"+user);
        }catch (Exception e)
        {
            this.msgLabel.setText((e.getMessage()));
        }
    }
}

