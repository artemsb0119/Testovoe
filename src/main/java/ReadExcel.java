import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
//Чтение из Excel файла и вывод в консоль
public class ReadExcel {

    public static TableInfo readFromExcel(String file) throws IOException {

        TableInfo tableInfo = new TableInfo();
        List<String> titles = new ArrayList<>();
        List<String> q_info = new ArrayList<>();
        List<String> rowDate = new ArrayList<>();
        List<Integer> column1 = new ArrayList<>();
        List<String> column2 = new ArrayList<>();
        List<Integer> column3 = new ArrayList<>();
        List<Integer> column4 = new ArrayList<>();
        List<Integer> column5 = new ArrayList<>();
        List<Integer> column6 = new ArrayList<>();
        List<Integer> column7 = new ArrayList<>();
        List<Integer> column8 = new ArrayList<>();
        List<Integer> column9 = new ArrayList<>();
        List<Integer> column10 = new ArrayList<>();

        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook myExcelBook = new XSSFWorkbook(inputStream);
        XSSFSheet myExcelSheet = myExcelBook.getSheetAt(0);
        int i = 0;
        XSSFRow row = myExcelSheet.getRow(0);
        Iterator<Cell> cellIterator = row.iterator();
        cellIterator.next();
        cellIterator.next();
        while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            if (cell.getCellType() == CellType.STRING) {
                titles.add(cell.getStringCellValue());
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t" + cell.getStringCellValue());
            }
        }
        System.out.println();
        row = myExcelSheet.getRow(1);
        cellIterator = row.iterator();
        cellIterator.next();
        cellIterator.next();
        while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            if (cell.getCellType() == CellType.STRING) {
                q_info.add(cell.getStringCellValue());
                System.out.print("\t\t\t\t\t\t\t" + cell.getStringCellValue());
            }
        }
        System.out.println();
        row = myExcelSheet.getRow(0);
        rowDate.add(row.getCell(0).toString());
        rowDate.add(row.getCell(1).toString());
        System.out.print("\t" + row.getCell(0));
        System.out.print("\t" + row.getCell(1));
        Cell cell = row.getCell(1);
        row = myExcelSheet.getRow(2);
        cellIterator = row.iterator();
        cellIterator.next();
        cellIterator.next();
        while (cellIterator.hasNext()) {
            cell = cellIterator.next();
            if (cell.getCellType() == CellType.NUMERIC) {
                Date date = cell.getDateCellValue();
                SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy");
                rowDate.add(sdf.format(date));
                System.out.print("\t  " + sdf.format(date));
            }
        }
        System.out.println();
        Iterator<Row> rowIterator = myExcelSheet.iterator();
        rowIterator.next();
        rowIterator.next();
        rowIterator.next();
        while (rowIterator.hasNext()) {
            row = (XSSFRow) rowIterator.next();
            cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                cell = cellIterator.next();
                if (cell==row.getCell(0)){
                    column1.add((int) cell.getNumericCellValue());
                }
                if (cell==row.getCell(1)){
                    column2.add(cell.getStringCellValue());
                }
                if (cell==row.getCell(2)){
                    column3.add((int) cell.getNumericCellValue());
                }
                if (cell==row.getCell(3)){
                    column4.add((int) cell.getNumericCellValue());
                }
                if (cell==row.getCell(4)){
                    column5.add((int) cell.getNumericCellValue());
                }
                if (cell==row.getCell(5)){
                    column6.add((int) cell.getNumericCellValue());
                }
                if (cell==row.getCell(6)){
                    column7.add((int) cell.getNumericCellValue());
                }
                if (cell==row.getCell(7)){
                    column8.add((int) cell.getNumericCellValue());
                }
                if (cell==row.getCell(8)){
                    column9.add((int) cell.getNumericCellValue());
                }
                if (cell==row.getCell(9)){
                    column10.add((int) cell.getNumericCellValue());
                }
                switch (cell.getCellType()) {
                    case NUMERIC:

                        if (i >= 2) {
                            System.out.print("\t\t  ");
                            System.out.printf("%.0f    ", cell.getNumericCellValue());
                        } else {
                            System.out.print("\t");
                            System.out.printf("%.0f", cell.getNumericCellValue());
                        }
                        break;
                    case STRING:
                        System.out.print("\t" + cell.getStringCellValue());
                        break;
                }
                i++;
            }
            i = 0;
            System.out.println();
        }
        myExcelBook.close();
        tableInfo.setTitles(titles);
        tableInfo.setQ_info(q_info);
        tableInfo.setRowDate(rowDate);
        tableInfo.setColumn1(column1);
        tableInfo.setColumn2(column2);
        tableInfo.setColumn3(column3);
        tableInfo.setColumn4(column4);
        tableInfo.setColumn5(column5);
        tableInfo.setColumn6(column6);
        tableInfo.setColumn7(column7);
        tableInfo.setColumn8(column8);
        tableInfo.setColumn9(column9);
        tableInfo.setColumn10(column10);
        return tableInfo;
    }
}