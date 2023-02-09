package com.example.viewcontrollertodolist;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.ArrayList;

public class HelloController {
    @FXML
    public TextField textInput;
    public Button addButton;
    public ListView toDoListMon;
    public ListView toDoListTue;
    public ListView toDoListWed;
    public ListView toDoListThu;
    public ListView toDoListFri;
    public ListView toDoListSat;
    public ListView toDoListSun;

    ObservableList<String> itemsMon;
    ObservableList<String> itemsTue;
    ObservableList<String> itemsWed;
    ObservableList<String> itemsThu;
    ObservableList<String> itemsFri;
    ObservableList<String> itemsSat;
    ObservableList<String> itemsSun;

    ArrayList<ListView> allViews;




    public void initialize() {

        toDoListM.setEditable(true);
        toDoListMon.setCellFactory(TextFieldListCell.forListView());
        allViews = new ArrayList();
        for ()

        itemsMon = FXCollections.observableArrayList();
        allLists.add(itemsMon);
        itemsTue = FXCollections.observableArrayList();
        itemsWed = FXCollections.observableArrayList();
        itemsThu = FXCollections.observableArrayList();
        itemsFri = FXCollections.observableArrayList();
        itemsSat = FXCollections.observableArrayList();
        itemsSun = FXCollections.observableArrayList();

        for (ArrayList<String> eachList : allLists) {
            eachList.
        }

        toDoListMon.setItems(itemsMon);
        toDoListTue.setItems(itemsTue);
        toDoListWed.setItems(itemsWed);
        toDoListThu.setItems(itemsThu);
        toDoListFri.setItems(itemsFri);
        toDoListSat.setItems(itemsSat);
        toDoListSun.setItems(itemsSun);
    }

    //code for onAction
    public void onHelloButtonClick() {
        String userType = textInput.getText();
        itemsMon.add(userType);
        itemsTue.add(userType);
        itemsWed.add(userType);
        itemsThu.add(userType);
        itemsFri.add(userType);
        itemsSat.add(userType);
        itemsSun.add(userType);

        textInput.clear();
    }

    public void deleteKeyMon( final KeyEvent keyEvent ) {
        final Object selectedItem;
        selectedItem = toDoListMon.getSelectionModel().getSelectedItem();
        toDoListMon.getSelectionModel();

        if ( selectedItem != null ) {

            if ( keyEvent.getCode().equals( KeyCode.BACK_SPACE ) ) {
                toDoListMon.getItems().remove(selectedItem);
                //text.clear
            }
        }
    }

    public void deleteKeyTue( final KeyEvent keyEvent ) {
        final Object selectedItem;
        selectedItem = toDoListTue.getSelectionModel().getSelectedItem();
        toDoListTue.getSelectionModel();

        if ( selectedItem != null ) {

            if ( keyEvent.getCode().equals( KeyCode.BACK_SPACE ) ) {
                toDoListTue.getItems().remove(selectedItem);
                //text.clear
            }
        }
    }
}