import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UdemyXcelCrap {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		 List<Map<String, String>> collection = new ArrayList<>();
		    Map<String, String> row1 = new LinkedHashMap<>();
		    row1.put("ID","1");
		    row1.put("Name","pop");
		    collection.add(row1);
		    Map<String, String> row2 = new LinkedHashMap<>();
		    row2.put("ID","2");
		    row2.put("Name","lop");
		    collection.add(row2);
		    File ff=new File("C:\\Users\\ccomp\\eclipse-workspace\\latestPageObjectModelFramework-master\\resources\\configfile\\testData.xlsx");
		    writeCollection(ff,"Sheet4",collection);
	}
	private static void writeCollection(File file, String sheetName, List<Map<String, String>> collection) throws Exception {
	    try {
	        FileInputStream fileInputStream = new FileInputStream(file);
	        XSSFWorkbook workBook = new XSSFWorkbook(fileInputStream);
	        XSSFSheet sheet = workBook.getSheet(sheetName);
	        
	        int rows = sheet.getLastRowNum();
	        System.out.println(rows);
	        fileInputStream.close();
	        rows = rows + 1;
	 
	        for (int index = 0; index < collection.size(); index++) {
	            XSSFRow row = sheet.createRow(rows++);
	            Map<String, String> rowObject = collection.get(index);
	            for (String columnName : rowObject.keySet()) {
	                int cellIndex = getColumnIndex(sheet, columnName);
	                if (cellIndex != -1) {
	                    XSSFCell cell = row.createCell(cellIndex);
	                    cell.setCellValue(rowObject.get(columnName));
	                }
	            }
	        }
	        FileOutputStream out = new FileOutputStream(file);
	        workBook.write(out);
	        out.close();
	    
	 
	    } catch (Exception e) {
	        throw e;
	    }
	}
	 
	public static int getColumnIndex(XSSFSheet sheet, String columnName) {
	    int columnIndex = -1;
	    try {
	        int colNum = sheet.getRow(0).getLastCellNum();
	        XSSFRow firstRow = sheet.getRow(0);
	        for (int colIndex = 0; colIndex < colNum; colIndex++) {
	            XSSFCell cell = firstRow.getCell(colIndex);
	            if (cell.toString().equals(columnName)) {
	                columnIndex = colIndex;
	            }
	        }
	    } catch (Exception e) {
	        throw e;
	    }
	    return columnIndex;
	}
}
