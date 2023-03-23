package com.example.viewcontrollertodolist;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.css.converter.StringConverter;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxListCell;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

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
    public Button save;
    public Button load;

    ArrayList<ObservableList<String>> allObservableLists;
    ArrayList<ListView<String>> allToDoLists;
    public int i;

    public void initialize() throws Exception {
        restoreData();
/*
        for (ListView eachListView: allToDoLists) {
            eachListView.setEditable(true);
            eachListView.setCellFactory(TextFieldListCell.forListView());
        }


 */
     /*   toDoListMon.setEditable(true);
        toDoListMon.setCellFactory(TextFieldListCell.forListView());
        //toDoListMon.setCellFactory(CheckBoxListCell.forListView(new Callback<String, ObservableValue<Boolean>>()
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
*/
        //allObservableLists = new ArrayList<>();
        for (i = 0; i < 7; i = i + 1) {
            allToDoLists.get(i).setEditable(true);
            allToDoLists.get(i).setCellFactory(TextFieldListCell.forListView());
            //allObservableLists.add(FXCollections.observableArrayList());
            //allObservableLists.set(allToDoLists);
            allToDoLists.get(i).setOnKeyPressed(event -> {
                if (event.getCode() == KeyCode.BACK_SPACE) {
                    allToDoLists.get(i).getItems().removeAll(allToDoLists.get(i).getSelectionModel().getSelectedItems());
                }
            });
        /*
        itemsMon = FXCollections.observableArrayList();
        itemsTue = FXCollections.observableArrayList();
        itemsWed = FXCollections.observableArrayList();
        itemsThu = FXCollections.observableArrayList();
        itemsFri = FXCollections.observableArrayList();
        itemsSat = FXCollections.observableArrayList();
        itemsSun = FXCollections.observableArrayList();
         */
/*
        toDoListTue.setItems(itemsTue);
        toDoListWed.setItems(itemsWed);
        toDoListThu.setItems(itemsThu);
        toDoListFri.setItems(itemsFri);
        toDoListSat.setItems(itemsSat);
        toDoListSun.setItems(itemsSun);
 */
        }

        comboBox.getItems().add("Monday");
        comboBox.getItems().add("Tuesday");
        comboBox.getItems().add("Wednesday");
        comboBox.getItems().add("Thursday");
        comboBox.getItems().add("Friday");
        comboBox.getItems().add("Saturday");
        comboBox.getItems().add("Sunday");
        /*
        comboBox.

        ArrayList<ComboBox<String>> allComboBox = new ArrayList();
        allComboBox.add(comboBox.getItems().add("Monday"));

         */


      //  restoreData();

    }

    //code for onAction
    // public void listViewClick(){}
    public void onHelloButtonClick() {
        int selectedIndex = comboBox.getSelectionModel().getSelectedIndex();
        System.out.println(selectedIndex);
        //allObservableLists.get(selectedIndex).add(textInput.getText());
        allToDoLists.get(selectedIndex).getItems().add(textInput.getText());
/*
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


 */
        textInput.clear();
    }
 /*
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

     */

    public void saveData() throws Exception {
        FileOutputStream fileOut = new FileOutputStream("Save");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        for (int i = 0; i < allToDoLists.size(); i++) {
            ArrayList<String> TemporaryAllToDoLists = new ArrayList<>(allToDoLists.get(i).getItems());
            out.writeObject(TemporaryAllToDoLists);
        }


        // Method for serialization of object
        out.close();
        fileOut.close();
    }

    public void restoreData()  {
        allToDoLists = new ArrayList<>();
        allToDoLists.add(toDoListMon);
        allToDoLists.add(toDoListTue);
        allToDoLists.add(toDoListWed);
        allToDoLists.add(toDoListThu);
        allToDoLists.add(toDoListFri);
        allToDoLists.add(toDoListSat);
        allToDoLists.add(toDoListSun);

        try {
            FileInputStream fileIn = new FileInputStream("Save");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            for (int i = 0; i < allToDoLists.size(); i++) {
                ArrayList<String> temporaryAllToDoLists = (ArrayList<String>) in.readObject();
                ObservableList temporaryObservableList = FXCollections.observableArrayList(temporaryAllToDoLists);
                allToDoLists.get(i).setItems(temporaryObservableList);
            }
            // Method for deserialization of object
            in.close();
            fileIn.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}