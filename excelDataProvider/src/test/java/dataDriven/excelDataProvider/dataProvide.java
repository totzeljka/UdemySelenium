package dataDriven.excelDataProvider;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvide {

	DataFormatter formatter = new DataFormatter();
	@Test(dataProvider="driveTest")	
	public void testCaseData(String greeting,String communication,String id){
		System.out.println(greeting+communication+id);
	}
	
	
	@DataProvider(name="driveTest")
	public Object[][] getdata() throws IOException {
	
		//svaki red u excelu se cuva kao jedan array
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Željka\\Documents\\ExcelDrivenDocuments\\excelDriven.xlsx");
		XSSFWorkbook wb  = new XSSFWorkbook(fis);
		XSSFSheet sheet =	wb.getSheetAt(0);
		int rowCount =	sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colcount =	row.getLastCellNum();
		
		//rowcount -1-> heder-naslovi,trebaju nam samo podaci,ako bi bilo nekog naslova polja u prvoj koloni bilo bi i colcount manje jedan
		Object data[][]=new Object[rowCount-1][colcount];
		
		//stampa po redovima, uzima prvi ispod hedera pa iterira po kolonama, pa opet iterira red pa iterira po kolomama i tako dok ima redova
		for(int i=0; i<rowCount; i++) 
		{
			row = sheet.getRow(i+1);
			
			for(int j=0; j<colcount;j++) 
			{
			XSSFCell cell= 	row.getCell(j);
			data[i][j]=formatter.formatCellValue(cell);	
			}
		}	
		return data;
	}
}
