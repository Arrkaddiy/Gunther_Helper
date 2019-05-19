package ru.gunther.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import ru.gunther.models.ExcelFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ExcelParserController {

    @FXML
    private TableView<ExcelFile> excelParserTable;
    @FXML
    private TextArea excelParserTextArea;

    private FileChooser fileChooser = new FileChooser();

    public static ArrayList<ExcelFile> excelFiles = new ArrayList<>();

    public void addFile(ActionEvent actionEvent) {
        List<File> files = fileChooser.showOpenMultipleDialog(((Node)actionEvent.getSource()).getScene().getWindow());
        if (files != null) {
            for (File file : files) excelFiles.add(new ExcelFile(files.indexOf(file)+1, file));
        }

        excelParserTextArea.appendText("Загруженно файлов : " + excelFiles.size() + "шт.\n");
    }
}
