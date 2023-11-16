package ExcelSheet;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFromExcel {


    public String readDataFromExcel(File file, int sheetIndex, int rowNum, int colNum) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(sheetIndex);

        XSSFRow row = sheet.getRow(rowNum);
        XSSFCell cell = row.getCell(colNum);

        String cellValue = getCellValue(cell);

        workbook.close();
        fis.close();

        return (cellValue);

    }

    public String getCellValue(XSSFCell cell){
        return switch (cell.getCellType()) {
            case NUMERIC -> String.valueOf(cell.getNumericCellValue());
            case BOOLEAN -> String.valueOf(cell.getBooleanCellValue());
            case STRING -> cell.getStringCellValue();
            default -> cell.getStringCellValue();
        };
    }

}
