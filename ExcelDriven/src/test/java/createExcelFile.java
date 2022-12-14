import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createExcelFile {

	public static void main(String[] args) throws IOException {
		// radi!!
		//sam pravi i cuva podatke zadatih u selenijumu u excel tabelu
		//ovo sama napravim  "C:\\Users\\Željka\\Documents\\ExcelDrivenDocuments\\excel documents from selenium\\+kako zelim da mi se zove datoteka  tipa je xlsx
		File file = new File(
				"C:\\Users\\Željka\\Documents\\ExcelDrivenDocuments\\excel documents from selenium\\dataFromSelenium1.xlsx");

		FileOutputStream fos = new FileOutputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("sheetName");

		// mogu da biram koji ce tip podatka biti setCellValue() ima string iniger datum kalendar bulean...
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Numbers");
		sheet.getRow(0).createCell(1).setCellValue("1");
		sheet.getRow(0).createCell(2).setCellValue("2");
		sheet.getRow(0).createCell(3).setCellValue("3");
		sheet.getRow(0).createCell(4).setCellValue("4");
		sheet.getRow(0).createCell(5).setCellValue("5");

		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Letters");
		sheet.getRow(1).createCell(1).setCellValue("a");
		sheet.getRow(1).createCell(2).setCellValue("b");
		sheet.getRow(1).createCell(3).setCellValue("c");
		sheet.getRow(1).createCell(4).setCellValue("d");
		sheet.getRow(1).createCell(5).setCellValue("e");

	
	//	napisi i zatvori
		wb.write(fos);
		wb.close();
	}

}
