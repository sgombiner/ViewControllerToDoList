package com.example.viewcontrollertodolist;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.ArrayList;

public class HelloController {
    @FXML
    public TextField textInput;
    public ComboBox comboBox;
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

    public void initialize() {

        toDoListMon.setEditable(true);
        toDoListMon.setCellFactory(TextFieldListCell.forListView());

        toDoListTue.setEditable(true);
        toDoListTue.setCellFactory(TextFieldListCell.forListView());

        toDoListWed.setEditable(true);
        toDoListWed.setCellFactory(TextFieldListCell.forListView());

        toDoListThu.setEditable(true);
        toDoListThu.setCellFactory(TextFieldListCell.forListView());

        toDoListFri.setEditable(true);
        toDoListFri.setCellFactory(TextFieldListCell.forListView());

        toDoListSat.setEditable(true);
        toDoListSat.setCellFactory(TextFieldListCell.forListView());

        toDoListSun.setEditable(true);
        toDoListSun.setCellFactory(TextFieldListCell.forListView());

        itemsMon = FXCollections.observableArrayList();
        itemsTue = FXCollections.observableArrayList();
        itemsWed = FXCollections.observableArrayList();
        itemsThu = FXCollections.observableArrayList();
        itemsFri = FXCollections.observableArrayList();
        itemsSat = FXCollections.observableArrayList();
        itemsSun = FXCollections.observableArrayList();

        toDoListMon.setItems(itemsMon);
        toDoListTue.setItems(itemsTue);
        toDoListWed.setItems(itemsWed);
        toDoListThu.setItems(itemsThu);
        toDoListFri.setItems(itemsFri);
        toDoListSat.setItems(itemsSat);
        toDoListSun.setItems(itemsSun);
        comboBox.getItems().add("Monday");
        comboBox.getItems().add("Tuesday");
        comboBox.getItems().add("Wednesday");
        comboBox.getItems().add("Thursday");
        comboBox.getItems().add("Friday");
        comboBox.getItems().add("Saturday");
        comboBox.getItems().add("Sunday");

    }

    //code for onAction
    public void onHelloButtonClick() {


        String selectedIndex = comboBox.getSelectionModel().getSelectedItem().toString();
        System.out.println(selectedIndex);
        if (selectedIndex == "Monday") {
            String userTypeMon = textInput.getText();
            itemsMon.add(userTypeMon);
    }
        if (selectedIndex == "Tuesday") {
            String userTypeTue = textInput.getText();
            itemsTue.add(userTypeTue);
        }
        if (selectedIndex == "Wednesday") {
            String userTypeWed = textInput.getText();
            itemsWed.add(userTypeWed);
        }
        if (selectedIndex == "Thursday") {
            String userTypeThu = textInput.getText();
            itemsThu.add(userTypeThu);
        }
        if (selectedIndex == "Friday") {
            String userTypeFri = textInput.getText();
            itemsFri.add(userTypeFri);
        }
        if (selectedIndex == "Saturday") {
            String userTypeSat = textInput.getText();
            itemsSat.add(userTypeSat);
        }
        if (selectedIndex == "Sunday") {
            String userTypeSun = textInput.getText();
            itemsSun.add(userTypeSun);
        }


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
    public void deleteKeyWed( final KeyEvent keyEvent ) {
        final Object selectedItem;
        selectedItem = toDoListWed.getSelectionModel().getSelectedItem();
        toDoListWed.getSelectionModel();

        if ( selectedItem != null ) {

            if ( keyEvent.getCode().equals( KeyCode.BACK_SPACE ) ) {
                toDoListWed.getItems().remove(selectedItem);
                //text.clear
            }
        }
    }
    public void deleteKeyThu( final KeyEvent keyEvent ) {
        final Object selectedItem;
        selectedItem = toDoListThu.getSelectionModel().getSelectedItem();
        toDoListThu.getSelectionModel();

        if ( selectedItem != null ) {

            if ( keyEvent.getCode().equals( KeyCode.BACK_SPACE ) ) {
                toDoListThu.getItems().remove(selectedItem);
                //text.clear
            }
        }
    }
    public void deleteKeyFri( final KeyEvent keyEvent ) {
        final Object selectedItem;
        selectedItem = toDoListFri.getSelectionModel().getSelectedItem();
        toDoListFri.getSelectionModel();

        if ( selectedItem != null ) {

            if ( keyEvent.getCode().equals( KeyCode.BACK_SPACE ) ) {
                toDoListFri.getItems().remove(selectedItem);
                //text.clear
            }
        }
    }
    public void deleteKeySat( final KeyEvent keyEvent ) {
        final Object selectedItem;
        selectedItem = toDoListSat.getSelectionModel().getSelectedItem();
        toDoListSat.getSelectionModel();

        if ( selectedItem != null ) {

            if ( keyEvent.getCode().equals( KeyCode.BACK_SPACE ) ) {
                toDoListSat.getItems().remove(selectedItem);
                //text.clear
            }
        }
    }
    public void deleteKeySun( final KeyEvent keyEvent ) {
        final Object selectedItem;
        selectedItem = toDoListSun.getSelectionModel().getSelectedItem();
        toDoListSun.getSelectionModel();

        if ( selectedItem != null ) {

            if ( keyEvent.getCode().equals( KeyCode.BACK_SPACE ) ) {
                toDoListSun.getItems().remove(selectedItem);
                //text.clear
            }
        }
    }
}