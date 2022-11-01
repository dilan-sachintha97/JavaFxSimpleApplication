package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MainFormController {
    public TextField txtLanguages;
    public ListView<String > lstLanguages;
    public TextField txtSelectedLanguage;

    public void initialize(){
        setListData();
    }

    private void setListData(){
        ObservableList<String> languages =FXCollections.observableArrayList();
        languages.add("Jaya");
        languages.add("Python");
        languages.add("MySQL");
        languages.add("JavaFX");

        lstLanguages.setItems(languages);
    }
    public void btnSaveOnAction(ActionEvent actionEvent) {
    }
}
