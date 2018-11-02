
import java.io.FileInputStream;

	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excel {
	public static	XSSFWorkbook wb;
	public static	XSSFSheet sheet;
	public static	XSSFRow row;
	public static	XSSFCell cell;
	public static FileInputStream fis;
		
	public static void main(String[] args) throws IOException {
		
		
		
		

		
		
		       String value = getCellData(6,2);
			 System.out.println(value);
			// String val = getCellData(4,1);
			 //System.out.println(val);
		     value =  setCellData("rotten",6,2);
			      System.out.println("the value is:"+value);
			 
			}
		private static String setCellvalue(int i, int j) {

			// TODO Auto-generated method stub

			return null;

			}

		public static String getCellData (int rowno, int col) throws IOException{
			FileInputStream fis = new FileInputStream("C:\\Users\\ccomp\\Documents\\data1.xlsx");	
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet("script");
			row=sheet.getRow(rowno);
			cell = row.getCell(col);
			return cell.getStringCellValue();
			
			
		}
		
		public static String setCellData (String text, int rowno, int col) throws IOException{
			FileInputStream fis = new FileInputStream("C:\\Users\\ccomp\\Documents\\data1.xlsx");	
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet("script");
			row=sheet.getRow(rowno);
			cell = row.getCell(col);
			cell.setCellValue(text);
	       // cell.setCellValue(text);
	        //why are we declaring and storing it in a variable, celldata1?
	        String celldata1 = cell.getStringCellValue();
			return celldata1;
			
		}
		

}

