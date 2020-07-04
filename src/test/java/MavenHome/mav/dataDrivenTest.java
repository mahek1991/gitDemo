package MavenHome.mav;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDrivenTest {
	
	public ArrayList<String> getExcelData(String testCaseName) throws IOException
	{
		int k = 0;
		int column = 0;

		ArrayList<String> a = new ArrayList<String>();
		FileInputStream file = new FileInputStream("C:\\Users\\mahek\\Desktop\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		int sheets = workbook.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) {
			String sheetName = workbook.getSheetName(i);
			if (sheetName.equalsIgnoreCase("Login")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				// Identify Testcases coloum by scanning the entire 1st row

				Iterator<Row> rows = sheet.iterator();// sheet is collection of rows
				Row firstrow = rows.next();
				Iterator<Cell> ce = firstrow.cellIterator();// row is collection of cells

				while (ce.hasNext()) {
					Cell value = ce.next();

					if (value.getStringCellValue().equalsIgnoreCase("Modules")) {
						column = k;

					}

					k++;
				}

				//// once coloumn is identified then scan entire testcase coloum to identify
				//// purcjhase testcase row
				while (rows.hasNext()) {

					Row r = rows.next();

					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {

						//// after you grab purchase testcase row = pull all the data of that row and
						//// feed into test

						Iterator<Cell> cv = r.cellIterator();
						cv.next();
						while (cv.hasNext()) {

							Cell c = cv.next();
							if (c.getCellTypeEnum() == CellType.STRING) {
								String value = c.getStringCellValue();

								a.add(value);
							} else {
								String intValue = NumberToTextConverter.toText(c.getNumericCellValue());
								a.add(intValue);
							}

						}
					}
				}

			}

		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		
	}
}
