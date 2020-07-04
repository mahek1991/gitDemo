package MavenHome.mav;

import java.io.IOException;
import java.util.ArrayList;

public class seleniumGetData {

	public static void main(String[] args) throws IOException {
		
		dataDrivenTest d=new dataDrivenTest();
		ArrayList<String> data=d.getExcelData("Password");
		
//		System.out.println(data.get(0));
		
//		for(String i:data)
//		{
//			System.out.println(i);
//		}

	}

}
