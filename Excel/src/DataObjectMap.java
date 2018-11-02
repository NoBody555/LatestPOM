import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DataObjectMap {
	@Test(dataProvider="getData")
	public static void readData(Map mapData) {
		System.out.println(mapData.get("userName"));
		System.out.println(mapData.get("password"));
	}

	@DataProvider(name="getData")
	public Object[][] getData() throws IOException {
		
	 File file = new File("C:\\Users\\ccomp\\eclipse-workspace\\latestPageObjectModelFramework-master\\Mapcrap1.xlsx");
	 
	 FileInputStream fis = new FileInputStream(file);
	 XSSFWorkbook wb = new XSSFWorkbook(fis);
	 XSSFSheet sheet =    wb.getSheetAt(0);
	 int rowCount= sheet.getLastRowNum();
	int colCount= sheet.getRow(0).getLastCellNum();
	Object[][] obj = new Object[rowCount][1];
	for(int i=0; i<rowCount; i++) {
		Map<Object,Object> maps = new HashMap<Object,Object>();
		for(int j=0; j<colCount; j++)
			maps.put(sheet.getRow(0).getCell(j).getStringCellValue(), sheet.getRow(i+1).getCell(j).getStringCellValue());
		 obj[i][0]=maps;
		
	}
	     return obj;
	}
}
