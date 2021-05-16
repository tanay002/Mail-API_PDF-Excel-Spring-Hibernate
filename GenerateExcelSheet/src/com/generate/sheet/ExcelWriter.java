package com.generate.sheet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	private static String[] columns = { "First Name", "Last Name", "Email",
	"Date Of Birth" };
	private static List<Contact> contacts = new ArrayList<Contact>();

	public static void main(String[] args) throws IOException, 
	InvalidFormatException {
		contacts.add(new Contact("Tanay", "Saxena",
				"tanay.saxena002@gmail.com", "05/03/1996"));
		contacts.add(new Contact("Vinay", "Kumar",
				"vinaykumar@gmail.com", "12/07/1996"));
		contacts.add(new Contact("Dhruv", "Patel",
				"dhruv.patel@gmail.com", "18/09/1995"));
		contacts.add(new Contact("Rahul", "Sharma", "rahulsharma@gmail.com",
				"17/05/1996"));

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Contacts");

		Font headerFont = workbook.createFont();
		headerFont.setBold(true);
		headerFont.setFontHeightInPoints((short) 14);

		CellStyle headerCellStyle = workbook.createCellStyle();

		headerCellStyle.setAlignment(HorizontalAlignment.CENTER);
		headerCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
         
		
		headerCellStyle.setFillBackgroundColor(IndexedColors.PINK.getIndex());
         headerCellStyle.setBorderTop(BorderStyle.THIN);
         headerCellStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
         
         headerCellStyle.setBorderBottom(BorderStyle.THIN);
         headerCellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
   
		headerCellStyle.setFont(headerFont);

		// Create a Row
		Row headerRow = sheet.createRow(0);

		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
			cell.setCellStyle(headerCellStyle);
		}
		CellStyle headerCellStyle1 = workbook.createCellStyle();
		headerCellStyle1.setAlignment(HorizontalAlignment.CENTER);
		headerCellStyle1.setVerticalAlignment(VerticalAlignment.CENTER);
		// Create Other rows and cells with contacts data
		int rowNum = 1;
		Cell cell1;
		for (Contact contact : contacts) {
			Row row = sheet.createRow(rowNum++);
			cell1= row.createCell(0);
			cell1.setCellValue(contact.firstName);
			cell1.setCellStyle(headerCellStyle1);
			
			cell1= row.createCell(1);
			cell1.setCellValue(contact.lastName);
			cell1.setCellStyle(headerCellStyle1);
			
			cell1=row.createCell(2);
			cell1.setCellValue(contact.email);
			cell1.setCellStyle(headerCellStyle1);
			
			cell1=row.createCell(3);
			cell1.setCellValue(contact.dateOfBirth);
			cell1.setCellStyle(headerCellStyle1);
		}

		// Resize all columns to fit the content size
		for (int i = 0; i < columns.length; i++) {
			sheet.autoSizeColumn(i);
		}

		// Write the output to a file
		FileOutputStream fileOut = new FileOutputStream("contacts.xlsx");
		workbook.write(fileOut);
		fileOut.close();
	}

}