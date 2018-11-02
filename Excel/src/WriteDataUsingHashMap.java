import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataUsingHashMap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream (new File("C:\\Users\\ccomp\\eclipse-workspace\\Excel\\src\\mapData.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
	
		 XSSFSheet sheet = wb.createSheet("sheetDat");
			XSSFRow row;
             Map<String ,Object[]> einfo = new TreeMap<String,Object[]>();
             einfo.put("1", new Object[] {"EmployeName", "EmployeDesignation","EmployeArea"});
             einfo.put("2", new Object[] {"Abrar","Engineer","testing"});
             einfo.put("3",new Object[] {"wroom","doctor","hater"});
             einfo.put("4",new Object[] {"droner","doctor","hater"});
             einfo.put("5",new Object[] {"room","duster","hater"});      
             einfo.put("6",new Object[] {"doctor","water","hater"});
                
           Set<String> keys = einfo.keySet();
           int rowNo=0;
            for(String key:keys) {
            	Object[] objarr = einfo.get(key);
            	 row = sheet.createRow(rowNo++);
            	  int cellid=0;
            	  for(Object obj:objarr) {
            	  Cell cell= row.createCell(cellid++);
            	  cell.setCellValue((String)obj);
            	    
            	  }
            }
            FileOutputStream fout = new FileOutputStream(new File("C:\\Users\\ccomp\\eclipse-workspace\\Excel\\src\\mapData.xlsx"));
            wb.write(fout);
            fout.close();
            System.out.println("File is done");
	}

}
