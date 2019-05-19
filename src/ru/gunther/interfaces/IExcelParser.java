package ru.gunther.interfaces;

import ru.gunther.models.ExcelFile;

public interface IExcelParser {

    void addWorkBook(ExcelFile excelFile);

    void formattedWorkBook(ExcelFile excelFile);

    void deleteWorkBook(ExcelFile excelFile);
}
