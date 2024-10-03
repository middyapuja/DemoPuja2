package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	/**
	 * 
	 * @param Sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String toReaddataFromExcelFile(String Sheetname, int row, int cell) throws EncryptedDocumentException, IOException  {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Testdata.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String  value = wb.getSheet(Sheetname).getRow(row).getCell(cell).toString();
		return value;
	}

}
