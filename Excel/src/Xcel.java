import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		   XSSFWorkbook wb = new XSSFWorkbook();
		  XSSFSheet sheet = wb.createSheet("emp");
		  
		Map<String,Object[]> maps = new TreeMap <String,Object[]>();
		
		 maps.put("1", new Object[] {"empid","name","dept"});
		 maps.put("2", new Object[] {"1","sam","sales"});
		 maps.put("3", new Object[] {"2","ran","cust"});
		 
		Set<String> keys = maps.keySet();
		int rowid=0;
		for(String key:keys) {
			  XSSFRow row = sheet.createRow(rowid++);
			Object[] objar = maps.get(key);
			int colnum=0;
			for(Object obj: objar) {
				    Cell cell = row.createCell(colnum++);
				    cell.setCellValue((String) obj);
				    
				    
			}
		}
		  
		 FileOutputStream fout = new FileOutputStream(new File("C:\\users\\ccomp\\documents\\hui.xlsx"));
		  wb.write(fout);
		  wb.close();
		  fout.close();
		
	
		
		
	}

}
