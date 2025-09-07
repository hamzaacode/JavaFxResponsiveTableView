package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.model.User;

public class MainTableViewController {
    @FXML
    private TableView<User> tableView;
    @FXML
    private TableColumn<User, String> nameColumn;
    @FXML
    private TableColumn<User, String> emailColumn;
    @FXML
    private TableColumn<User, String> roleColumn;

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        emailColumn.setCellValueFactory(cellData -> cellData.getValue().emailProperty());
        roleColumn.setCellValueFactory(cellData -> cellData.getValue().roleProperty());
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        ObservableList<User> users = FXCollections.observableArrayList(
            new User("Alice", "alice@example.com", "Admin"),
            new User("Bob", "bob@example.com", "User"),
            new User("Charlie", "charlie@example.com", "Guest")
        );
        tableView.setItems(users);
    }
}
