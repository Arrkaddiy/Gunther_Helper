package ru.gunther.models;

import javafx.beans.NamedArg;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;

public class ExcelFile {

    private int Id;
    private String fileName;
    private String filePath;
    private boolean formatted;
    private Workbook file;

    public ExcelFile(int id, File file) {
        this.setId(id);
        this.setFileName(file);
        this.setFilePath(file);
        this.setFormatted(false);
        this.setFile(file);
    }

    public int getId() {
        return Id;
    }
    public void setId(@NamedArg("Model id")int id) {
        Id = id;
    }

    public String getFileName() {
        return fileName;
    }
    public void setFileName(@NamedArg("File name")String fileName) {
        this.fileName = fileName;
    }
    public void setFileName(@NamedArg("Excel file")File file) {
        this.fileName = file.getName();
    }

    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(@NamedArg("File absolute path")String filePath) {
        this.filePath = filePath;
    }
    public void setFilePath(@NamedArg("Excel file")File file) {
        this.filePath = file.getAbsolutePath();
    }

    public boolean isFormatted() {
        return formatted;
    }
    public void setFormatted(@NamedArg("isFormatted")boolean formatted) {
        this.formatted = formatted;
    }

    public Workbook getWorkbook() {
        return file;
    }
    public void setWorkbook(@NamedArg("Excel file")Workbook workbook) {
        this.file = file;
    }

    public File getFile() {
        return new File(this.getFileName());
    }
    public void setFile(@NamedArg("Excel file")File file) {
        try {
            this.file = WorkbookFactory.create(file);
        } catch (IOException ioe) {
            ioe.getMessage();
        }
    }
}
