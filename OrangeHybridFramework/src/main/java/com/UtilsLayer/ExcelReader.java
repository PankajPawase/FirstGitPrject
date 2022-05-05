package com.UtilsLayer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public XSSFWorkbook workbook;

	public ExcelReader(String path) {
		File f = new File(path);
		try {
			FileInputStream fis = new FileInputStream(f);
			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getData(int index, int row, int col) {
		return workbook.getSheetAt(index).getRow(row).getCell(col).getStringCellValue();
	}

	public int countRow(int index) {
		return workbook.getSheetAt(index).getLastRowNum();
	}

	public int countColumn(int index) {
		return workbook.getSheetAt(index).getRow(0).getLastCellNum();
	}

}
